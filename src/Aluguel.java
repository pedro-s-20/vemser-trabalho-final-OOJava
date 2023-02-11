public class Aluguel{

    private static final double MULTA_POR_ATRASO = 2;

    private String idAluguel;
    private int quantidadeDeDias;
    private double valorMulta;
    private Livro livroEmprestimo;

    public void imprimeAluguel(){
        System.out.println("Aluguel de ID: " + getIdAluguel());
        System.out.println("----------------------------------");
        livroEmprestimo.imprimirDadosLivro();
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

    public String getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(String idLivro) {
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

