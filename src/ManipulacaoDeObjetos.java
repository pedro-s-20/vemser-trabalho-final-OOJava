import java.util.ArrayList;
import java.util.List;
public class ManipulacaoDeObjetos {
    private List<Livro> livrosFisicos;
    private List<Livro> ebooks;
    private List<Usuarios> listaDeUsuarios;
    private List<Aluguel> emprestimos;

    public ManipulacaoDeObjetos() {
        this.livrosFisicos = new ArrayList<>();
        this.ebooks = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
        this.emprestimos = new ArrayList<>();
    }
    //Comando de adicionar objetos nas listas
    public void adicionarUsuario(Usuarios usuario) {
        this.listaDeUsuarios.add(usuario);
    }

    public void adicionarLivroFisico(Livro livroFisico) {
        this.livrosFisicos.add(livroFisico);
    }

    public void adicionarEbook(Livro ebook) {
        this.ebooks.add(ebook);
    }

    public void adicionarUsuario(Aluguel emprestimo) {
        this.emprestimos.add(emprestimo);
    }

    //Comando de remover objetos
    public void removerLivroFisicoPorId(String idLivro){
        this.livrosFisicos.remove(idLivro);
    }
    public void removerEbook(String ebook){
        this.livrosFisicos.remove(ebook);
    }
    public void removerUsuarioPorIndice(String indice){
        this.listaDeUsuarios.remove(indice);
    }
    public void removerEmprestimo(int idEmprestimo){
        this.emprestimos.remove(emprestimos);
    }
}

