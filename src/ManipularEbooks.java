public class ManipularEbooks {

    public void adicionarEbook(AcervoDaBiblioteca biblioteca, Livro ebook) {
        biblioteca.ebooks.add(ebook);
    }

    public void removerEbook(AcervoDaBiblioteca biblioteca, String ebook){
        biblioteca.livrosFisicos.remove(ebook);
    }

    public void editarEbook(AcervoDaBiblioteca biblioteca, int indice, Livro livro){
        Livro ebookBusca = biblioteca.ebooks.get(indice);
        ebookBusca.setTitulo(livro.getTitulo());
        ebookBusca.setGenero(livro.getGenero());
        ebookBusca.setAutor(livro.getAutor());
        ebookBusca.setEditora(livro.getEditora());
        ebookBusca.setTitulo(livro.getAno());
    }

    public void listarEbooks(AcervoDaBiblioteca biblioteca){
        for(int i = 0; i < biblioteca.ebooks.size(); i++){
            System.out.println("id " + i + " - " + biblioteca.ebooks.get(i));
        }
    }


}
