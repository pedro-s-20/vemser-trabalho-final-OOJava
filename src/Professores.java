public class Professores extends Usuarios implements Impressao {
    private String matricula;

    public Professores(String nome, String cpf, String telefone, String logradouro, int numero, String cep, String matricula) {
        super(nome, cpf, telefone, logradouro, numero, cep);
        this.matricula = matricula;
    }

    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}

    @Override
    public void imprimir() {

    }
}
