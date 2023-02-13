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

    public void listarUsuarios(){
        if(biblioteca.getListaDeUsuarios().isEmpty()){
            System.out.println("Sem usuários cadastrados.");
        }else{
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
