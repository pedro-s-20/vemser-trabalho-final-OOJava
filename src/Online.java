import java.util.List;

public class Online extends AcervoDaBiblioteca{
    private List<Livro> ebook;

    public Online(List<Usuarios> listaUsuarios, List<Aluguel> agendaAluguel) {
        super(listaUsuarios, agendaAluguel);
    }


    public List<Livro> getEbook() {
        return ebook;
    }

    public void setEbook(List<Livro> ebook) {
        this.ebook = ebook;
    }
}
