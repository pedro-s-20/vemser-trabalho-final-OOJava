public abstract class Usuario implements Impressao {
    private String nome;
    private String cpf;
    private String telefone;
    private String logradouro;
    private String bairro;
    private String numero;
    private String cep;

    //1- Estudante | 2 - Professor | 3 - Gestor | 4 - Administrador
    private int tipoUsuario;

    public int getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

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

    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {return cep;}

    public void setCep(String cep) {this.cep = cep;}



}
