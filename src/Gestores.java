public class Gestores extends Usuario implements Impressao{
    private String matricula;
    public String getMatricula() {return matricula;}

    public void setMatricula(String matricula) {this.matricula = matricula;}

    @Override
    public void imprimir() {

    }
}
