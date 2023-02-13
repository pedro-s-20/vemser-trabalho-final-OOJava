public class Estudante extends Usuario implements Impressao {
    private String matricula;

    public String getMatricula() {return matricula;}
    public void setMatricula(String id) {this.matricula = id;}

    @Override
    public void imprimir(){

        System.out.println("--------ESTUDANTE-------");
        System.out.println("Nome: " + super.getNome());
        System.out.println("CPF: " + super.getCpf());
        System.out.println("Endereço: " + super.getLogradouro() + ", " + super.getNumero() + ", bairro: " + super.getBairro());
        System.out.println("CEP: " + super.getCep());
        System.out.println("Telefone: " + super.getTelefone());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("------------------------");

    }
}
