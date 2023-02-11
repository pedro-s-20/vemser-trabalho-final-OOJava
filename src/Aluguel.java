import java.util.List;

public class Aluguel{

    private static final double MULTA_POR_ATRASO = 2;

    private String idLivro;
    private int quantidadeDeDias;
    private double valorMulta;
    private Livro livroEmprestimo;

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

    public String getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(String idLivro) {
        this.idLivro = idLivro;
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

