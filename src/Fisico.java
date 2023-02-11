import java.util.List;

public class Fisico extends AcervoDaBiblioteca{
    private List<Livro> livroFisico;
    public Fisico(List<Usuarios> listaUsuarios, List<Aluguel> agendaAluguel) {
        super(listaUsuarios, agendaAluguel);
    }

    public List<Livro> getLivroFisico() {
        return livroFisico;
    }

    public void setLivroFisico(List<Livro> livroFisico) {
        this.livroFisico = livroFisico;
    }

}
