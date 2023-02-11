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
        emprestimoBusca.setIdAluguel(emprestimo.getIdAluguel());
        emprestimoBusca.setQuantidadeDeDias(emprestimo.getQuantidadeDeDias());
    }

    public void listarEmprestimos(AcervoDaBiblioteca biblioteca){
        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Sem aluguéis cadastrados.");
        }{
            biblioteca.getListaEmprestimos().stream().forEach(aluguel -> aluguel.imprimeAluguel());
        }
    }

    public Aluguel buscaAluguel(AcervoDaBiblioteca biblioteca, String idLivro){
        Aluguel aluguelBuscado = (Aluguel) biblioteca.getListaEmprestimos().stream().filter(aluguel -> aluguel.getIdAluguel().equals(idLivro));
        return aluguelBuscado;
    }


}
