public class ManipularEbooks implements EmprestimoEDevolucaoDeLivro {

    AcervoDaBiblioteca biblioteca;

    public ManipularEbooks(AcervoDaBiblioteca biblioteca){
        this.biblioteca = biblioteca;
    }

    public void adicionarEbook(Livro ebook) {
        biblioteca.getEbooks().add(ebook);
        biblioteca.setContadorDeLivros();
    }

    public void removerEbook(String ebook){
        biblioteca.getLivrosFisicos().remove(ebook);
    }

    public void editarEbook(int indice, Livro livro){
        Livro ebookBusca = biblioteca.getEbooks().get(indice);
        ebookBusca.setTitulo(livro.getTitulo());
        ebookBusca.setGenero(livro.getGenero());
        ebookBusca.setAutor(livro.getAutor());
        ebookBusca.setEditora(livro.getEditora());
        ebookBusca.setTitulo(livro.getAno());
    }

    public void listarEbooks(){
        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Acervo de e-books vazio.");
        }{
            biblioteca.getEbooks().stream().forEach(ebook -> ebook.imprimirDadosLivro());
        }
    }

    public Livro buscaEbooks(int idLivro){
        Livro livroBuscado = (Livro) biblioteca.getEbooks().stream().filter(livro -> livro.getIdLivro() == idLivro);
        return livroBuscado;
    }
    @Override
    public void emprestarLivro(Usuario usuario, Livro livro){
        if(livro.isDisponivel()){
            livro.setDisponivel(false);
            biblioteca.setContadorDeAlugueis();
            Aluguel aluguelLivro = new Aluguel();
            aluguelLivro.setIdAluguel(biblioteca.getContadorDeAlgueis());
            if(usuario.getTipoUsuario() == 1){
                aluguelLivro.setQuantidadeDeDias(7);
            } else {
                aluguelLivro.setQuantidadeDeDias(14);
            }
            aluguelLivro.setPessoa(usuario);
            biblioteca.manipularAlugueis.adicionarAluguel(aluguelLivro);
            System.out.println("O número do seu protocolo é: " + biblioteca.getContadorDeAlgueis());
        } else {
            System.out.println("O livro escolhido não está disponível!");
        }
    }
    @Override
    public void devolverLivro(Usuario usuario, int idEmprestimo){
        if(idEmprestimo <= biblioteca.getListaEmprestimos().size()) {
            biblioteca.getListaEmprestimos().get(idEmprestimo).getLivroEmprestimo().setDisponivel(true);
            biblioteca.getListaEmprestimos().get(idEmprestimo).setFinalizado(true);
        } else {
            System.out.println("O número de protocolo não foi encontrado, tente novamente!");
        }
    }


}
