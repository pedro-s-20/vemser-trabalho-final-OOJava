import java.util.stream.Stream;

public class ManipularEbooks {

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




}
