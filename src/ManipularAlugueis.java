public class ManipularAlugueis {
    AcervoDaBiblioteca biblioteca;

    public ManipularAlugueis(AcervoDaBiblioteca biblioteca){
        this.biblioteca = biblioteca;
    }


    public void adicionarAluguel(Aluguel emprestimo) {
        biblioteca.getListaEmprestimos().add(emprestimo);
        biblioteca.setContadorDeAlugueis();
        emprestimo.setFinalizado(false);
    }

    public void removerAluguel(int idEmprestimo){
        biblioteca.getListaEmprestimos().remove(idEmprestimo);
    }

    public void editarEmprestimo(int indice, Aluguel emprestimo){
        Aluguel emprestimoBusca = biblioteca.getListaEmprestimos().get(indice);
        emprestimoBusca.setValorMulta(emprestimo.getValorMulta());
        emprestimoBusca.setLivroEmprestimo(emprestimo.getLivroEmprestimo());
        emprestimoBusca.setIdAluguel(emprestimo.getIdAluguel());
        emprestimoBusca.setQuantidadeDeDias(emprestimo.getQuantidadeDeDias());
    }

    public void listarEmprestimos(){
        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Sem aluguéis cadastrados.");
        }{
            biblioteca.getListaEmprestimos().stream().forEach(aluguel -> aluguel.imprimeAluguel());
        }
    }

    public Aluguel buscaAluguel(int idAluguel){

        Aluguel aluguelBuscado = null;

        for (Aluguel aluguel:biblioteca.getListaEmprestimos()) {
            if(aluguel.getIdAluguel() == idAluguel){
                aluguelBuscado = aluguel;
            }
        }

        return aluguelBuscado;
    }


}
