import java.util.stream.Stream;

public class ManipularEbooks {

    public void adicionarEbook(AcervoDaBiblioteca biblioteca, Livro ebook) {
        biblioteca.getEbooks().add(ebook);
    }

    public void removerEbook(AcervoDaBiblioteca biblioteca, String ebook){
        biblioteca.getLivrosFisicos().remove(ebook);
    }

    public void editarEbook(AcervoDaBiblioteca biblioteca, int indice, Livro livro){
        Livro ebookBusca = biblioteca.getEbooks().get(indice);
        ebookBusca.setTitulo(livro.getTitulo());
        ebookBusca.setGenero(livro.getGenero());
        ebookBusca.setAutor(livro.getAutor());
        ebookBusca.setEditora(livro.getEditora());
        ebookBusca.setTitulo(livro.getAno());
    }

    public void listarEbooks(AcervoDaBiblioteca biblioteca){
        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Acervo de e-books vazio.");
        }{
            biblioteca.getEbooks().stream().forEach(ebook -> ebook.imprimirDadosLivro());
        }
    }

    public Livro buscaEbooks(AcervoDaBiblioteca biblioteca, int idLivro){
        Livro livroBuscado = (Livro) biblioteca.getEbooks().stream().filter(livro -> livro.getIdLivro() == idLivro);
        return livroBuscado;
    }




}
