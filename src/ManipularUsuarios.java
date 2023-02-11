public class ManipularUsuarios {

    public void adicionarUsuario(AcervoDaBiblioteca biblioteca, Usuarios usuario) {
        biblioteca.listaDeUsuarios.add(usuario);
    }

    public void removerUsuarioPorIndice(AcervoDaBiblioteca biblioteca, int indice){
        biblioteca.listaDeUsuarios.remove(indice);
    }

    public void editarUsuarios(AcervoDaBiblioteca biblioteca, int indice, Usuarios usuario){
        Usuarios usuarioBusca = biblioteca.listaDeUsuarios.get(indice);
        usuarioBusca.setNome(usuario.getNome());
        usuarioBusca.setCpf(usuario.getCpf());
        usuarioBusca.setCep(usuario.getCep());
        usuarioBusca.setLogradouro(usuario.getLogradouro());
        usuarioBusca.setNumero(usuario.getNumero());
        usuarioBusca.setTelefone(usuario.getTelefone());
    }

    public void listarUsuarios(AcervoDaBiblioteca biblioteca){
        for(int i = 0; i < biblioteca.listaDeUsuarios.size(); i++){
            System.out.println("id " + i + " - " + biblioteca.listaDeUsuarios.get(i));
        }
    }



}
