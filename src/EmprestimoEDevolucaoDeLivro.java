public interface EmprestimoEDevolucaoDeLivro {

    public void emprestarLivro(String cpf, Livro livro);

    public void devolverLivro(String cpf, int id);

}
