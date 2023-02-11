import java.util.List;
public abstract class AcervoDaBiblioteca {
    private List<Usuarios> listaUsuarios;

    private List<Livro> livrosFisicos;
    private List<Livro> ebooks;

    public void cadastrarLivro(Livro livro){
        if(livro.getTipo().equals("1")){
            livrosFisicos.add(livro);
        } else {
            ebooks.add(livro);
        }
    }

}
