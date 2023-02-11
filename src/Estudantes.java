public class Estudantes extends Usuarios implements Impressao {
    private String id;

    public Estudantes(String nome, String cpf, String telefone, String logradouro, int numero, String cep, String id) {
        super(nome, cpf, telefone, logradouro, numero, cep);
        this.id = id;
    }

    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    @Override
    public void imprimir() {

    }
}
