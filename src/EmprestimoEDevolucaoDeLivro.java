public interface EmprestimoEDevolucaoDeLivro {

    public void emprestarLivro(Usuario usuario, Livro livro);

    public void devolverLivro(Usuario usuario, int id);

}
