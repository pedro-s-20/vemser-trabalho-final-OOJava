public class ManipularAlugueis {

    public void adicionarAluguel(AcervoDaBiblioteca biblioteca, Aluguel emprestimo) {
        biblioteca.listaEmprestimos.add(emprestimo);
    }

    public void removerAluguel(AcervoDaBiblioteca biblioteca, int idEmprestimo){
        biblioteca.listaEmprestimos.remove(idEmprestimo);
    }

    public void editarEmprestimo(AcervoDaBiblioteca biblioteca, int indice, Aluguel emprestimo){
        Aluguel emprestimoBusca = biblioteca.listaEmprestimos.get(indice);
        emprestimoBusca.setValorMulta(emprestimo.getValorMulta());
        emprestimoBusca.setLivroEmprestimo(emprestimo.getLivroEmprestimo());
        emprestimoBusca.setIdLivro(emprestimo.getIdLivro());
        emprestimoBusca.setQuantidadeDeDias(emprestimo.getQuantidadeDeDias());
    }

    public void listarEmprestimos(AcervoDaBiblioteca biblioteca){
        for(int i = 0; i < biblioteca.listaEmprestimos.size(); i++){
            System.out.println("id " + i + " - " + biblioteca.listaEmprestimos.get(i));
        }
    }




}
