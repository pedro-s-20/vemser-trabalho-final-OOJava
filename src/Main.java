public class Main {

    public static void main(String[] args) {
        AcervoDaBiblioteca biblioteca = new AcervoDaBiblioteca();

        Estudante bruno = new Estudante();
        bruno.setNome("Bruno Rodrigues Dias");
        bruno.setTelefone("51994414634");
        bruno.setLogradouro("Av. General Anapio Gomes");
        bruno.setNumero("1081");
        bruno.setCep("94920-270");
        bruno.setBairro("Vila Cachoeirinha");

        Livro livro1 = new Livro();
        livro1.setTitulo("Clean code");
        livro1.setEditora("Não sei");
        livro1.setAutor("tio bob");
        livro1.setAno("2000");
        livro1.setGenero("Programação");
        livro1.setTipo("1");

        biblioteca.manipularLivrosFisicos.emprestarLivro(bruno, livro1);
        livro1.imprimirDadosLivro();
        biblioteca.manipularLivrosFisicos.devolverLivro(bruno, biblioteca.getContadorDeAlgueis() - 1);
        biblioteca.manipularLivrosFisicos.emprestarLivro(bruno, livro1);

    }
}
