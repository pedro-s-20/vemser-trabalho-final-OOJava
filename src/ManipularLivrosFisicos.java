public class ManipularLivrosFisicos implements EmprestimoEDevolucaoDeLivro {

    AcervoDaBiblioteca biblioteca;


    public ManipularLivrosFisicos(AcervoDaBiblioteca biblioteca){
        this.biblioteca = biblioteca;
    }

    public void adicionarLivroFisico(Livro livroFisico) {
        biblioteca.getLivrosFisicos().add(livroFisico);
        biblioteca.setContadorDeLivros();
    }

    public void removerLivroFisicoPorId(int index){

        biblioteca.getLivrosFisicos().remove(index);
    }

    public void editarLivrofisico(Livro livroAtualizado, Livro livroArray){
        livroArray.setTitulo(livroAtualizado.getTitulo());
        livroArray.setGenero(livroAtualizado.getGenero());
        livroArray.setAutor(livroAtualizado.getAutor());
        livroArray.setEditora(livroAtualizado.getEditora());
        livroArray.setTitulo(livroAtualizado.getAno());
    }

    public void listarLivrosFisicos(){
        int contador = 0;
        if(biblioteca.getLivrosFisicos().isEmpty()){
            System.out.println("Acervo de livros vazio.");
        }{for (Livro livro: biblioteca.getLivrosFisicos()) {
                System.out.println("Index: " + contador);
                livro.imprimirDadosLivro();
                contador++;
            }
        }
    }

    public Livro buscaLivroPorNome(String busca) {
        Livro livro = null;
        for (int i = 0; i < biblioteca.getLivrosFisicos().size(); i++) {
            if (biblioteca.getLivrosFisicos().get(i).getTitulo().toLowerCase().equals(busca.toLowerCase())) {
                biblioteca.getLivrosFisicos().get(i).imprimirDadosLivro();
                livro = biblioteca.getLivrosFisicos().get(i);
            } else {
                System.out.println("O livro não foi encontrado!");
            }
        }
        return livro;
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
