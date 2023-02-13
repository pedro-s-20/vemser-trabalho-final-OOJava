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

    public void removerAluguel(int index){
        biblioteca.getListaEmprestimos().remove(index);
    }

    public void editarEmprestimo(int indice, Aluguel emprestimo){
        Aluguel emprestimoBusca = biblioteca.getListaEmprestimos().get(indice);
        emprestimoBusca.setValorMulta(emprestimo.getValorMulta());
        emprestimoBusca.setFinalizado(emprestimo.isFinalizado());
        emprestimoBusca.setQuantidadeDeDias(emprestimo.getQuantidadeDeDias());
    }

    public void listarEmprestimos(){
        int contador = 0;

        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Sem aluguéis cadastrados.");
        }else{

            for (Aluguel aluguel:biblioteca.getListaEmprestimos()) {
                System.out.println("Index: " + contador);
                aluguel.imprimeAluguel();
                contador++;
            }
            System.out.println("Esses são os aluguéis no momento.");
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
