public class ManipularUsuarios {

    AcervoDaBiblioteca biblioteca;

    public ManipularUsuarios(AcervoDaBiblioteca biblioteca){
        this.biblioteca = biblioteca;
    }

    public void adicionarUsuario(Usuario usuario) {
        biblioteca.getListaDeUsuarios().add(usuario);
        biblioteca.setContadorDeUsuarios();
    }

    public void removerUsuarioPorIndice(int indice){
        biblioteca.getListaDeUsuarios().remove(indice);
    }

    public void editarUsuarios(int indice, Usuario usuario){
        Usuario usuarioBusca = biblioteca.getListaDeUsuarios().get(indice);
        usuarioBusca.setNome(usuario.getNome());
        usuarioBusca.setCpf(usuario.getCpf());
        usuarioBusca.setCep(usuario.getCep());
        usuarioBusca.setLogradouro(usuario.getLogradouro());
        usuarioBusca.setNumero(usuario.getNumero());
        usuarioBusca.setTelefone(usuario.getTelefone());
    }

    public void listarUsuarios(){
        if(biblioteca.getListaEmprestimos().isEmpty()){
            System.out.println("Sem usuários cadastrados.");
        }{
            biblioteca.getListaDeUsuarios().stream().forEach(usuario -> usuario.imprimir());
        }
    }

    public Usuario buscaUsuario(String cpfUsuario){
        String cpfUsuarioFormatado = cpfUsuario.replaceAll("[!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}~]", "");

        Usuario usuarioBuscado = null;

        for (Usuario usuario:biblioteca.getListaDeUsuarios()) {
            if(usuario.getCpf().equals(cpfUsuarioFormatado)){
                usuarioBuscado = usuario;
            }
        }

        return usuarioBuscado;
    }



}
