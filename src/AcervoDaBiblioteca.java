import java.util.List;
public abstract class AcervoDaBiblioteca {
    private List<Usuarios> listaUsuarios;
    private List<Aluguel> agendaDeAluguel;
    private List<Livro> livrosFisicos;
    private List<Livro> ebooks;

    public AcervoDaBiblioteca(List<Usuarios> listaUsuarios, List<Aluguel> agendaDeAluguel) {
        this.listaUsuarios = listaUsuarios;
        this.agendaDeAluguel = agendaDeAluguel;
    }

    public void cadastrarLivro(Livro livro){
        if(livro.getTipo().equals("1")){
            livrosFisicos.add(livro);
        } else {
            ebooks.add(livro);
        }
    }

    public int emprestarLivro(String idUsuario, Livro livro){
        int idEmprestimo = 0;
        if(livro.isDisponivel()){
            livro.setDisponivel(false);
            System.out.println();
            idEmprestimo ++;
            Aluguel aluguelLivro = new Aluguel(livro, 7, idUsuario);
            agendaDeAluguel.add(aluguelLivro);
        } else {
            System.out.println("Livro indisponível!");
        }
        return idEmprestimo;
    }




}
