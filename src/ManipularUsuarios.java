public class ManipularUsuarios {

    public void adicionarUsuario(AcervoDaBiblioteca biblioteca, Usuario usuario) {
        biblioteca.getListaDeUsuarios().add(usuario);
    }

    public void removerUsuarioPorIndice(AcervoDaBiblioteca biblioteca, int indice){
        biblioteca.getListaDeUsuarios().remove(indice);
    }

    public void editarUsuarios(AcervoDaBiblioteca biblioteca, int indice, Usuario usuario){
        Usuario usuarioBusca = biblioteca.getListaDeUsuarios().get(indice);
        usuarioBusca.setNome(usuario.getNome());
        usuarioBusca.setCpf(usuario.getCpf());
        usuarioBusca.setCep(usuario.getCep());
        usuarioBusca.setLogradouro(usuario.getLogradouro());
        usuarioBusca.setNumero(usuario.getNumero());
        usuarioBusca.setTelefone(usuario.getTelefone());
    }

    public void listarUsuarios(AcervoDaBiblioteca biblioteca){
        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Sem usuários cadastrados.");
        }{
            biblioteca.getListaDeUsuarios().stream().forEach(usuario -> usuario.imprimirInformacoes());
        }
    }

    public Usuario buscaAluguel(AcervoDaBiblioteca biblioteca, String cpfUsuario){
        String cpfUsuarioFormatado = cpfUsuario.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "");
        Usuario usuariolUsuario = (Usuario) biblioteca.getListaDeUsuarios().stream().filter(Usuario -> Usuario.getCpf().equals(cpfUsuarioFormatado));
        return usuariolUsuario;
    }



}
