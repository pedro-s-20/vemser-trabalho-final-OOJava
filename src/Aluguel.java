public class Aluguel extends Usuarios implements Impressao {

    private static final double MULTA_POR_ATRASO = 2;

    private String idLivro;
    private String calendario;
    private int quantidadeDeDias ;
    private double valorMulta;


    public Aluguel(String nome, String cpf, String telefone, String logradouro, int numero, String cep,
                   String idLivro, String calendario, int quantidadeDeDias, double valorMulta) {
        super(nome, cpf, telefone, logradouro, numero, cep);
        this.idLivro = idLivro;
        this.calendario = calendario;
        this.quantidadeDeDias = quantidadeDeDias;
        this.valorMulta = valorMulta;
    }


    public String getIdLivro() {return idLivro;}
    public void setIdLivro(String idLivro) {this.idLivro = idLivro;}

    public String getCalendario() {return calendario;}
    public void setCalendario(String calendario) {this.calendario = calendario;}

    public int getQuantidadeDeDias() {return quantidadeDeDias;}
    public void setQuantidadeDeDias(int quantidadeDeDias) {this.quantidadeDeDias = quantidadeDeDias;}

    public double getValorMulta() {return valorMulta;}
    public void setValorMulta(double valorMulta) {this.valorMulta = valorMulta;}


    public boolean calcularMulta(int dias) {
        if (dias <= 3) {
            return true;
        } else {
            setValorMulta(  MULTA_POR_ATRASO * (dias - 3));
            return false;
        }

    }
    @Override
    public void imprimir() {
    }
}

