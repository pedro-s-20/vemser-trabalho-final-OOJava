public class ManipularLivrosFisicos {

    public void adicionarLivroFisico(AcervoDaBiblioteca biblioteca, Livro livroFisico) {
        biblioteca.getLivrosFisicos().add(livroFisico);
    }

    public void removerLivroFisicoPorId(AcervoDaBiblioteca biblioteca, String idLivro){
        biblioteca.getLivrosFisicos().remove(idLivro);
    }

    public void editarLivrofisico(AcervoDaBiblioteca biblioteca, int indice, Livro livro){
        Livro livroBusca = biblioteca.getLivrosFisicos().get(indice);
        livroBusca.setTitulo(livro.getTitulo());
        livroBusca.setGenero(livro.getGenero());
        livroBusca.setAutor(livro.getAutor());
        livroBusca.setEditora(livro.getEditora());
        livroBusca.setTitulo(livro.getAno());
    }

    public void listarLivrosFisicos(AcervoDaBiblioteca biblioteca){
        for(int i = 0; i < biblioteca.getLivrosFisicos().size(); i++){
            System.out.println("id " + i + " - " + biblioteca.getLivrosFisicos().get(i));
        }
    }

    public Livro buscaLivrosFisicos(AcervoDaBiblioteca biblioteca, int idLivro){
        Livro livroBuscado = (Livro) biblioteca.getLivrosFisicos().stream().filter(livro -> livro.getIdLivro() == idLivro);
        return livroBuscado;
    }

}
