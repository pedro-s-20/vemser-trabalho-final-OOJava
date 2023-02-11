import java.util.ArrayList;
import java.util.List;
public class AcervoDaBiblioteca {
    private List<Livro> livrosFisicos;
    private List<Livro> ebooks;
    private List<Usuario> listaDeUsuarios;
    private List<Aluguel> listaEmprestimos;
    public AcervoDaBiblioteca(){
        this.livrosFisicos = new ArrayList<>();
        this.ebooks = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
        this.listaEmprestimos = new ArrayList<>();
    }

    public List<Livro> getLivrosFisicos() {
        return livrosFisicos;
    }

    public void setLivrosFisicos(List<Livro> livrosFisicos) {
        this.livrosFisicos = livrosFisicos;
    }

    public List<Livro> getEbooks() {
        return ebooks;
    }

    public void setEbooks(List<Livro> ebooks) {
        this.ebooks = ebooks;
    }

    public List<Usuario> getListaDeUsuarios() {
        return listaDeUsuarios;
    }

    public void setListaDeUsuarios(List<Usuario> listaDeUsuarios) {
        this.listaDeUsuarios = listaDeUsuarios;
    }

    public List<Aluguel> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(List<Aluguel> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

}
