public class Gestor extends Usuario implements Impressao{
    private String matricula;

    public String getMatricula() {return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}

    @Override
    public void imprimir(){

        System.out.println("------------------------");
        System.out.println("---------GESTOR---------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getLogradouro() + ", " + getNumero() + ", bairro: " + getBairro());
        System.out.println("CEP: " + getCep());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("------------------------");

    }
}
