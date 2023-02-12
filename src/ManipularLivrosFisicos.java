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

    public void editarLivrofisico(Livro livroAtualizado, Livro livroArray){
        livroArray.setTitulo(livroAtualizado.getTitulo());
        livroArray.setGenero(livroAtualizado.getGenero());
        livroArray.setAutor(livroAtualizado.getAutor());
        livroArray.setEditora(livroAtualizado.getEditora());
        livroArray.setTitulo(livroAtualizado.getAno());
    }

    public void listarLivrosFisicos(){
        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Acervo de livros físicos vazio.");
        }{
            biblioteca.getLivrosFisicos().stream().forEach(livroFisico -> livroFisico.imprimirDadosLivro());
        }
    }

    public Livro buscaLivrosFisicos(int idLivro){

        Livro livroBuscado = null;

        for (Livro livro:biblioteca.getLivrosFisicos()) {
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
            Aluguel aluguelLivro = new Aluguel();
            aluguelLivro.setIdAluguel(biblioteca.getContadorDeAlgueis());
            if(usuario.getTipoUsuario() == 1){
                aluguelLivro.setQuantidadeDeDias(7);
            } else {
                aluguelLivro.setQuantidadeDeDias(14);
            }
            aluguelLivro.setPessoa(usuario);
            biblioteca.manipularAlugueis.adicionarAluguel(aluguelLivro);
            System.out.println("O emprestimo foi realizazdo com sucesso!");
            System.out.println("O número do seu protocolo é: " + biblioteca.getContadorDeAlgueis());
            biblioteca.getListaEmprestimos().get(biblioteca.getContadorDeAlgueis() - 1).setLivroEmprestimo(livro);
        } else {
            System.out.println("O livro escolhido não está disponível!");
        }
    }
    @Override
    public void devolverLivro(Usuario usuario, int idEmprestimo){
        if(idEmprestimo <= biblioteca.getListaEmprestimos().size()) {
            biblioteca.getListaEmprestimos().get(idEmprestimo).getLivroEmprestimo().setDisponivel(true);
            biblioteca.getListaEmprestimos().get(idEmprestimo).setFinalizado(true);
            System.out.println("O livro foi devolvido com sucesso!");
        } else {
            System.out.println("O número de protocolo não foi encontrado, tente novamente!");
        }
    }

}
