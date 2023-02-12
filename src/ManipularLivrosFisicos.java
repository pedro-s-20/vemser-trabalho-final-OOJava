public class ManipularLivrosFisicos implements EmprestimoEDevolucaoDeLivro {

    AcervoDaBiblioteca biblioteca;

    public ManipularLivrosFisicos(AcervoDaBiblioteca biblioteca){
        this.biblioteca = biblioteca;
    }

    public void adicionarLivroFisico(Livro livroFisico) {
        biblioteca.getLivrosFisicos().add(livroFisico);
        biblioteca.setContadorDeLivros();
    }

    public void removerLivroFisicoPorId(String idLivro){
        biblioteca.getLivrosFisicos().remove(idLivro);
    }

    public void editarLivrofisico(int indice, Livro livro){
        Livro livroBusca = biblioteca.getLivrosFisicos().get(indice);
        livroBusca.setTitulo(livro.getTitulo());
        livroBusca.setGenero(livro.getGenero());
        livroBusca.setAutor(livro.getAutor());
        livroBusca.setEditora(livro.getEditora());
        livroBusca.setTitulo(livro.getAno());
    }

    public void listarLivrosFisicos(){
        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Acervo de livros físicos vazio.");
        }{
            biblioteca.getLivrosFisicos().stream().forEach(livroFisico -> livroFisico.imprimirDadosLivro());
        }
    }

    public Livro buscaLivrosFisicos(int idLivro){
        Livro livroBuscado = (Livro) biblioteca.getLivrosFisicos().stream().filter(livro -> livro.getIdLivro() == idLivro);
        return livroBuscado;
    }

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

    public void devolverLivro(Usuario usuario, int idEmprestimo){
        biblioteca.getListaEmprestimos().get(idEmprestimo).getLivroEmprestimo().setDisponivel(true);
    }

}
