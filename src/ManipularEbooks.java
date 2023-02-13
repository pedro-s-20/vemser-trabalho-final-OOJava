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


    public void editarEbook(Livro livroAtualizado, Livro livroArray){
        livroArray.setTitulo(livroAtualizado.getTitulo());
        livroArray.setGenero(livroAtualizado.getGenero());
        livroArray.setAutor(livroAtualizado.getAutor());
        livroArray.setEditora(livroAtualizado.getEditora());
        livroArray.setTitulo(livroAtualizado.getAno());
    }

    public void listarEbooks(){
        int contador = 0;
        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Acervo de e-books vazio.");
        }{
            for (Livro livro: biblioteca.getEbooks()) {

            }
        }
    }

    public Livro buscaEbookPorNome(String busca) {
        Livro livro = null;
        for (int i = 0; i < biblioteca.getEbooks().size(); i++) {
            if (biblioteca.getEbooks().get(i).getTitulo().toLowerCase().equals(busca.toLowerCase())) {
                biblioteca.getEbooks().get(i).imprimirDadosLivro();
                livro = biblioteca.getEbooks().get(i);
            } else {
                System.out.println("O livro não foi encontrado!");
            }
        }
        return livro;
    }

    public Livro buscaEbooks(int idLivro){
        Livro livroBuscado = null;

        for (Livro livro:biblioteca.getEbooks()) {
            if(livro.getIdLivro() == idLivro){
                livroBuscado = livro;
            }
        }

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
