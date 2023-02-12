public class Estudante extends Usuario implements Impressao {
    private String matricula;

    public String getMatricula() {return matricula;}
    public void setMatricula(String id) {this.matricula = id;}

    @Override
    public void imprimir(){

        System.out.println("------------------------");
        System.out.println("--------ESTUDANTE-------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getLogradouro() + ", " + getNumero() + ", bairro: " + getBairro());
        System.out.println("CEP: " + getCep());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("------------------------");

    }
}
