public class Livro {
    private int idLivro;
    private String titulo;
    private String genero;
    private String autor;
    private String editora;
    private String ano;
    // 1 - Livro físico | 2 - e-book
    private int tipo;
    private boolean disponivel = true;

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void imprimirDadosLivro(){
        System.out.println("Título: " + titulo);
        System.out.println("Genêro: " + genero);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Ano: " + ano);
        if(tipo == 1){
            System.out.println("Tipo: Fisico");
        } else {
            System.out.println("Tipo: Ebook");
        }
        System.out.println("Disponivel: " + disponivel);
        System.out.println("--------------------------------------------------------------");

    }
}
