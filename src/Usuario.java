public abstract class Usuario implements Impressao {
    private String nome;
    private String cpf;
    private String telefone;
    private String logradouro;
    private int numero;
    private String cep;

    public Usuario(String nome, String cpf, String telefone, String logradouro, int numero, String cep) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getLogradouro() {return logradouro;}
    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public String getCep() {return cep;}

    public void setCep(String cep) {this.cep = cep;}
}
