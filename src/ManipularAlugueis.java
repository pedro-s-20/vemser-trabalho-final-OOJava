public class ManipularAlugueis {

    public void adicionarAluguel(AcervoDaBiblioteca biblioteca, Aluguel emprestimo) {
        biblioteca.getListaEmprestimos().add(emprestimo);
    }

    public void removerAluguel(AcervoDaBiblioteca biblioteca, int idEmprestimo){
        biblioteca.getListaEmprestimos().remove(idEmprestimo);
    }

    public void editarEmprestimo(AcervoDaBiblioteca biblioteca, int indice, Aluguel emprestimo){
        Aluguel emprestimoBusca = biblioteca.getListaEmprestimos().get(indice);
        emprestimoBusca.setValorMulta(emprestimo.getValorMulta());
        emprestimoBusca.setLivroEmprestimo(emprestimo.getLivroEmprestimo());
        emprestimoBusca.setIdLivro(emprestimo.getIdLivro());
        emprestimoBusca.setQuantidadeDeDias(emprestimo.getQuantidadeDeDias());
    }

    public void listarEmprestimos(AcervoDaBiblioteca biblioteca){
        for(int i = 0; i < biblioteca.getListaEmprestimos().size(); i++){
            System.out.println("id " + i + " - " + biblioteca.getListaEmprestimos().get(i));
        }
    }

    public Aluguel buscaAluguel(AcervoDaBiblioteca biblioteca, String idLivro){
        Aluguel aluguelBuscado = (Aluguel) biblioteca.getListaEmprestimos().stream().filter(aluguel -> aluguel.getIdLivro().equals(idLivro));
        return aluguelBuscado;
    }


}
