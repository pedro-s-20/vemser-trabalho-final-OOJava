import java.util.ArrayList;
import java.util.List;
public class AcervoDaBiblioteca {
    public List<Livro> livrosFisicos;
    public List<Livro> ebooks;
    public List<Usuarios> listaDeUsuarios;
    public List<Aluguel> listaEmprestimos;
    public AcervoDaBiblioteca(){
        this.livrosFisicos = new ArrayList<>();
        this.ebooks = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
        this.listaEmprestimos = new ArrayList<>();
    }

}
