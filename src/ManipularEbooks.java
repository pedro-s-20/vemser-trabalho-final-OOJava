public class ManipularEbooks implements EmprestimoEDevolucaoDeLivro {

    AcervoDaBiblioteca biblioteca;

    public ManipularEbooks(AcervoDaBiblioteca biblioteca){
        this.biblioteca = biblioteca;
    }

    public void adicionarEbook(Livro ebook) {
        biblioteca.getEbooks().add(ebook);
        biblioteca.setContadorDeLivros();
    }

    public void removerEbook(int index){
        biblioteca.getEbooks().remove(index);
    }


    public void editarEbook(int index, Livro livroAtualizado){
        Livro livroArray = biblioteca.getEbooks().get(index);
        livroArray.setTitulo(livroAtualizado.getTitulo());
        livroArray.setGenero(livroAtualizado.getGenero());
        livroArray.setAutor(livroAtualizado.getAutor());
        livroArray.setEditora(livroAtualizado.getEditora());
        livroArray.setAno(livroAtualizado.getAno());
        livroArray.setTitulo(livroAtualizado.getAno());
    }

    public void listarEbooks(){
        int contador = 0;
        if(biblioteca.getEbooks().isEmpty()){
            System.out.println("Acervo de e-books vazio.");
        }else{
            for (Livro livro: biblioteca.getEbooks()) {
                System.out.println("Index: " + contador);
                livro.imprimirDadosLivro();
                contador++;
            }
        }
    }

    public Livro buscaEbookPorNome(String busca) {
        Livro livro = null;
        for (int i = 0; i < biblioteca.getEbooks().size(); i++) {
            if (biblioteca.getEbooks().get(i).getTitulo().toLowerCase().equals(busca.toLowerCase())) {
                biblioteca.getEbooks().get(i).imprimirDadosLivro();
                livro = biblioteca.getEbooks().get(i);
            }
        }
        if (livro == null) {
            System.out.println("O livro não foi encontrado!");
        }
        return livro;
    }

    public Livro buscaEbooks(int index){
        Livro livroBuscado = null;

        for (int i = 0; i < biblioteca.getEbooks().size(); i++) {
            if (i == index) {
                livroBuscado = biblioteca.getEbooks().get(index);
            }
        }

        if(livroBuscado == null) {
            System.out.println("O livro não foi encontrado!");
        }
        return livroBuscado;
    }
    @Override
    public void emprestarLivro(String cpf, Livro livro){
        if (biblioteca.manipularUsuarios.buscaUsuario(cpf) != null) {
            Usuario usuario = biblioteca.manipularUsuarios.buscaUsuario(cpf);
            if (livro.isDisponivel()) {
                livro.setDisponivel(false);
                biblioteca.setContadorDeAlugueis();
                Aluguel aluguelLivro = new Aluguel();
                aluguelLivro.setIdAluguel(biblioteca.getContadorDeAlgueis());
                if (usuario.getTipoUsuario() == 1) {
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
        } else {
            System.out.println("Usuário inválido!");
        }
    }
    @Override
    public void devolverLivro(String cpf, int idEmprestimo){
        if (biblioteca.manipularUsuarios.buscaUsuario(cpf) != null) {
            if (idEmprestimo <= biblioteca.getListaEmprestimos().size()) {
                biblioteca.getListaEmprestimos().get(idEmprestimo).getLivroEmprestimo().setDisponivel(true);
                biblioteca.getListaEmprestimos().get(idEmprestimo).setFinalizado(true);
            } else {
                System.out.println("O número de protocolo não foi encontrado, tente novamente!");
            }
        }
    }


}
