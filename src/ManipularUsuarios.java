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
        int contador = 0;
        if(biblioteca.getListaDeUsuarios().isEmpty()){
            System.out.println("Sem usuários cadastrados.");
        } else {
            for (Usuario usuario: biblioteca.getListaDeUsuarios()) {
                if(usuario.getTipoUsuario() == 1){
                    Estudante estudante = (Estudante) usuario;
                    System.out.println("Index: " + contador);
                    estudante.imprimir();
                }else if(usuario.getTipoUsuario() == 2){
                    Professor professor = (Professor) usuario;
                    System.out.println("Index: " + contador);
                    professor.imprimir();
                }else if(usuario.getTipoUsuario() == 3){
                    Gestor gestor = (Gestor) usuario;
                    System.out.println("Index: " + contador);
                    gestor.imprimir();
                }else if(usuario.getTipoUsuario() == 4){
                    Administrativo administrativo = (Administrativo) usuario;
                    System.out.println("Index: " + contador);
                    administrativo.imprimir();
                }
                contador++;

            }
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
