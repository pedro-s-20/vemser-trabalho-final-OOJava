public class Aluguel{

    private static final double MULTA_POR_ATRASO = 2;

    private int idAluguel;
    private int quantidadeDeDias;
    private double valorMulta;
    private Livro livroEmprestimo;
    private Usuario pessoa;

    public void imprimeAluguel(){
        System.out.println("Aluguel de ID: " + getIdAluguel());
        System.out.println("----------------------------------");
        livroEmprestimo.imprimirDadosLivro();
    }

    public Usuario getPessoa() {
        return pessoa;
    }

    public void setPessoa(Usuario pessoa) {
        this.pessoa = pessoa;
    }

    public int getQuantidadeDeDias() {
        return quantidadeDeDias;
    }

    public void setQuantidadeDeDias(int quantidadeDeDias) {
        this.quantidadeDeDias = quantidadeDeDias;
    }

    public Livro getLivroEmprestimo() {
        return livroEmprestimo;
    }

    public void setLivroEmprestimo(Livro livroEmprestimo) {
        this.livroEmprestimo = livroEmprestimo;
    }

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idLivro) {
        this.idAluguel = idAluguel;
    }


    public double getValorMulta() {
        return valorMulta;
    }
    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public boolean calcularMulta(int dias) {
        if (dias <= 3) {
            return true;
        } else {
            setValorMulta(  MULTA_POR_ATRASO * (dias - 3));
            return false;
        }
    }
}

