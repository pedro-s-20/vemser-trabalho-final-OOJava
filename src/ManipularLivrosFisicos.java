public class ManipularLivrosFisicos {

    public void adicionarLivroFisico(AcervoDaBiblioteca biblioteca, Livro livroFisico) {
        biblioteca.livrosFisicos.add(livroFisico);
    }

    public void removerLivroFisicoPorId(AcervoDaBiblioteca biblioteca, String idLivro){
        biblioteca.livrosFisicos.remove(idLivro);
    }

    public void editarLivrofisico(AcervoDaBiblioteca biblioteca, int indice, Livro livro){
        Livro livroBusca = biblioteca.livrosFisicos.get(indice);
        livroBusca.setTitulo(livro.getTitulo());
        livroBusca.setGenero(livro.getGenero());
        livroBusca.setAutor(livro.getAutor());
        livroBusca.setEditora(livro.getEditora());
        livroBusca.setTitulo(livro.getAno());
    }

    public void listarLivrosFisicos(AcervoDaBiblioteca biblioteca){
        for(int i = 0; i < biblioteca.livrosFisicos.size(); i++){
            System.out.println("id " + i + " - " + biblioteca.livrosFisicos.get(i));
        }
    }

}
