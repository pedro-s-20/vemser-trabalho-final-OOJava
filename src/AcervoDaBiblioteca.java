import java.util.ArrayList;
import java.util.List;
public class AcervoDaBiblioteca {
    private List<Livro> livrosFisicos;
    private List<Livro> ebooks;
    private List<Usuarios> listaDeUsuarios;
    private List<Aluguel> listaEmprestimos;
    public AcervoDaBiblioteca(){
        this.livrosFisicos = new ArrayList<>();
        this.ebooks = new ArrayList<>();
        this.listaDeUsuarios = new ArrayList<>();
        this.listaEmprestimos = new ArrayList<>();
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
        this.listaEmprestimos.add(emprestimo);
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
        this.listaEmprestimos.remove(listaEmprestimos);
    }

    //Comando para editar objetos
    public void editarLivrofisico(int indice, Livro livro){
        Livro livroBusca = livrosFisicos.get(indice);
        livroBusca.setTitulo(livro.getTitulo());
        livroBusca.setGenero(livro.getGenero());
        livroBusca.setAutor(livro.getAutor());
        livroBusca.setEditora(livro.getEditora());
        livroBusca.setTitulo(livro.getAno());
    }
    public void editarEbook(int indice, Livro livro){
        Livro ebookBusca = ebooks.get(indice);
        ebookBusca.setTitulo(livro.getTitulo());
        ebookBusca.setGenero(livro.getGenero());
        ebookBusca.setAutor(livro.getAutor());
        ebookBusca.setEditora(livro.getEditora());
        ebookBusca.setTitulo(livro.getAno());
    }
    public void editarUsuarios(int indice, Usuarios usuario){
        Usuarios usuarioBusca = listaDeUsuarios.get(indice);
        usuarioBusca.setNome(usuario.getNome());
        usuarioBusca.setCpf(usuario.getCpf());
        usuarioBusca.setCep(usuario.getCep());
        usuarioBusca.setLogradouro(usuario.getLogradouro());
        usuarioBusca.setNumero(usuario.getNumero());
        usuarioBusca.setTelefone(usuario.getTelefone());
    }
    //Comando para listar os objetos
    public void listarLivrosFisicos(){
        for(int i = 0; i < livrosFisicos.size(); i++){
            System.out.println("id " + i + " - " + livrosFisicos.get(i));
        }
    }
    public void listarEbooks(){
        for(int i = 0; i < ebooks.size(); i++){
            System.out.println("id " + i + " - " + ebooks.get(i));
        }
    }
    public void listarUsuarios(){
        for(int i = 0; i < listaDeUsuarios.size(); i++){
            System.out.println("id " + i + " - " + listaDeUsuarios.get(i));
        }
    }
    public void listarEmprestimos(){
        for(int i = 0; i < listaEmprestimos.size(); i++){
            System.out.println("id " + i + " - " + listaEmprestimos.get(i));
        }
    }

}
