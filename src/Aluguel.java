public class Aluguel{

    private static final double MULTA_POR_ATRASO = 2;

    private int idAluguel;
    private int quantidadeDeDias;
    private double valorMulta;
    private Livro livroEmprestimo;
    private Usuario pessoa;
    private boolean finalizado = false;
    AcervoDaBiblioteca biblioteca;

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public void imprimeAluguel(){
        System.out.println("Aluguel de ID: " + getIdAluguel());
        livroEmprestimo.imprimirDadosLivro();
        if(isFinalizado()){
            System.out.println("Empréstimo já finalizado.");
            System.out.println("Estava emprestado para: " + getPessoa().getNome());
            System.out.println("----------------------------------");
        }else{
            System.out.println("Está emprestado para: " + getPessoa().getNome());
            System.out.println("Dias restantes que ela tem para devolver: " + getQuantidadeDeDias());
            System.out.println("----------------------------------");
        }

    }

    public void editarAluguel(Aluguel aluguelEditado, int index){
        Aluguel aluguelArray = biblioteca.getListaEmprestimos().get(index);
        aluguelArray.setQuantidadeDeDias(aluguelEditado.getQuantidadeDeDias());
        aluguelArray.setFinalizado(aluguelEditado.isFinalizado());
        aluguelArray.setValorMulta(aluguelEditado.getValorMulta());
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
        if (dias <= 7) {
            return true;
        } else {
            setValorMulta(  MULTA_POR_ATRASO * (dias - 3));
            return false;
        }
    }
}

