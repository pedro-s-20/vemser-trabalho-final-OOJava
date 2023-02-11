public class Livro {
    private int idLivro = 0;
    private String titulo;
    private String genero;
    private String autor;
    private String editora;
    private String ano;
    private String tipo;
    private boolean disponivel = true;

    public Livro(String titulo, String genero, String autor, String editora, String ano, String tipo) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.tipo = tipo;
    }

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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
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
        if(tipo.equals("1")){
            System.out.println("Tipo: Fisico");
        } else {
            System.out.println("Tipo: Ebook");
        }

    }
}
