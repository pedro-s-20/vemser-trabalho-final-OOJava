import java.util.ArrayList;
import java.util.List;
public class AcervoDaBiblioteca {
    private List<Livro> livrosFisicos;
    private List<Livro> ebooks;
    private List<Usuario> listaDeUsuarios;
    private List<Aluguel> listaEmprestimos;

    private int contadorDeAlgueis;
    private int contadorDeLivros;
    private int contadorDeUsuarios;

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

    public int getContadorDeAlgueis() {
        return contadorDeAlgueis;
    }

    public void setContadorDeAlgueis(int contadorDeAlgueis) {
        this.contadorDeAlgueis = contadorDeAlgueis;
    }

    public int getContadorDeLivros() {
        return contadorDeLivros;
    }

    public void setContadorDeLivros(int contadorDeLivros) {
        this.contadorDeLivros = contadorDeLivros;
    }

    public int getContadorDeUsuarios() {
        return contadorDeUsuarios;
    }

    public void setContadorDeUsuarios(int contadorDeUsuarios) {
        this.contadorDeUsuarios = contadorDeUsuarios;
    }
}
