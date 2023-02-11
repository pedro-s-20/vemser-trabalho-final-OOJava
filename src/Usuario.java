public abstract class Usuario implements Impressao {
    private String nome;
    private String cpf;
    private String telefone;
    private String logradouro;
    private String bairro;
    private int numero;
    private String cep;

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {
        this.cpf = cpf.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "");
    }

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getLogradouro() {return logradouro;}
    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {return cep;}

    public void setCep(String cep) {this.cep = cep;}

    public void imprimirInformacoes(){

        System.out.println("------------------------");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getLogradouro() + ", " + getNumero() + ", bairro: " + getBairro());
        System.out.println("CEP: " + getCep());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("------------------------");

    }



}
