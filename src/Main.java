import java.util.Scanner;

public class Main {

    static AcervoDaBiblioteca biblioteca = new AcervoDaBiblioteca();

    public static void main(String[] args) {

        boolean sair = false;
        Usuario usuarioAcessado = null;
        usuarioAcessado = telaLogin();

        if (usuarioAcessado != null) {
            telaInicial(usuarioAcessado);
        } else {
            System.out.println("Programa finalizado.");
        }

    }

    static Usuario telaLogin () {

        Scanner entradaUsu = new Scanner(System.in);
        boolean continuar = true;
        int opcao;
        String cpfUsuario;

        Usuario usuarioAcessado = null;

        do {
            System.out.println("-----BEM-VINDO A BIBLIOTECA DBC!-----");
            System.out.println("Escolha uma opção: ");
            System.out.println("[1] - Já sou cadastrado.");
            System.out.println("[2] - Quero me cadastrar.");
            System.out.println("[3] - Sair.");
            opcao = entradaUsu.nextInt();
            entradaUsu.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite seu CPF: ");
                    cpfUsuario = entradaUsu.nextLine();
                    if (biblioteca.manipularUsuarios.buscaUsuario(cpfUsuario) != null) {
                        usuarioAcessado = biblioteca.manipularUsuarios.buscaUsuario(cpfUsuario);
                        continuar = false;
                    } else {
                        System.out.println("Usuário não encontrado. Tente novamente.");
                    }
                    break;

                case 2:
                    do {
                        System.out.println("Qual tipo de usuário você pertence? ");
                        System.out.println("[1] - Estudante ");
                        System.out.println("[2] - Professor ");
                        System.out.println("[3] - Gestor ");
                        System.out.println("[4] - Administrador ");
                        System.out.println("[5] - Voltar");
                        opcao = entradaUsu.nextInt();
                        entradaUsu.nextLine();
                        if (opcao < 1 || opcao > 5) {
                            System.err.println("Opção inválida. Tente novamente.");
                        }
                    } while (opcao < 1 || opcao > 4);

                    switch (opcao) {
                        case 1:
                            Estudante estudante = new Estudante();

                            estudante.setTipoUsuario(1);
                            System.out.println("Digite seu nome: ");
                            estudante.setNome(entradaUsu.nextLine());

                            System.out.println("Digite seu CPF: ");
                            estudante.setCpf(entradaUsu.nextLine());

                            System.out.println("Agora sobre o endereço");
                            System.out.println("Digite a rua: ");
                            estudante.setLogradouro(entradaUsu.nextLine());
                            System.out.println("Digite o bairro: ");
                            estudante.setBairro(entradaUsu.nextLine());
                            System.out.println("Digite o CEP: ");
                            estudante.setCep(entradaUsu.nextLine());
                            System.out.println("Digite o número: ");
                            estudante.setNumero(entradaUsu.nextLine());

                            System.out.println("Digite o telefone: ");
                            estudante.setTelefone(entradaUsu.nextLine());
                            System.out.println("Digite sua matrícula");
                            estudante.setMatricula(entradaUsu.nextLine());

                            biblioteca.manipularUsuarios.adicionarUsuario(estudante);

                            System.out.println("---Usuário cadastrado com sucesso!---");
                            System.out.println("--Agora faça seu login.--");
                            continuar = true;
                            break;


                        case 2:
                            Professor professor = new Professor();

                            professor.setTipoUsuario(2);
                            System.out.println("Digite seu nome: ");
                            professor.setNome(entradaUsu.nextLine());

                            System.out.println("Digite seu CPF: ");
                            professor.setCpf(entradaUsu.nextLine());

                            System.out.println("Agora sobre o endereço");
                            System.out.println("Digite a rua: ");
                            professor.setLogradouro(entradaUsu.nextLine());
                            System.out.println("Digite o bairro: ");
                            professor.setBairro(entradaUsu.nextLine());
                            System.out.println("Digite o CEP: ");
                            professor.setCep(entradaUsu.nextLine());
                            System.out.println("Digite o número: ");
                            professor.setNumero(entradaUsu.nextLine());

                            System.out.println("Digite o telefone: ");
                            professor.setTelefone(entradaUsu.nextLine());
                            System.out.println("Digite sua matrícula");
                            professor.setMatricula(entradaUsu.nextLine());

                            biblioteca.manipularUsuarios.adicionarUsuario(professor);

                            System.out.println("---Usuário cadastrado com sucesso!---");
                            System.out.println("--Agora faça seu login.--");
                            continuar = true;
                            break;

                        case 3:
                            Gestor gestor = new Gestor();

                            gestor.setTipoUsuario(3);
                            System.out.println("Digite seu nome: ");
                            gestor.setNome(entradaUsu.nextLine());

                            System.out.println("Digite seu CPF: ");
                            gestor.setCpf(entradaUsu.nextLine());

                            System.out.println("Agora sobre o endereço");
                            System.out.println("Digite a rua: ");
                            gestor.setLogradouro(entradaUsu.nextLine());
                            System.out.println("Digite o bairro: ");
                            gestor.setBairro(entradaUsu.nextLine());
                            System.out.println("Digite o CEP: ");
                            gestor.setCep(entradaUsu.nextLine());
                            System.out.println("Digite o número: ");
                            gestor.setNumero(entradaUsu.nextLine());

                            System.out.println("Digite o telefone: ");
                            gestor.setTelefone(entradaUsu.nextLine());
                            System.out.println("Digite sua matrícula");
                            gestor.setMatricula(entradaUsu.nextLine());

                            biblioteca.manipularUsuarios.adicionarUsuario(gestor);

                            System.out.println("---Usuário cadastrado com sucesso!---");
                            System.out.println("--Agora faça seu login.--");
                            continuar = true;
                            break;

                        case 4:
                            Administrativo administrativo = new Administrativo();

                            administrativo.setTipoUsuario(4);
                            System.out.println("Digite seu nome: ");
                            administrativo.setNome(entradaUsu.nextLine());

                            System.out.println("Digite seu CPF: ");
                            administrativo.setCpf(entradaUsu.nextLine());

                            System.out.println("Agora sobre o endereço");
                            System.out.println("Digite a rua: ");
                            administrativo.setLogradouro(entradaUsu.nextLine());
                            System.out.println("Digite o bairro: ");
                            administrativo.setBairro(entradaUsu.nextLine());
                            System.out.println("Digite o CEP: ");
                            administrativo.setCep(entradaUsu.nextLine());
                            System.out.println("Digite o número: ");
                            administrativo.setNumero(entradaUsu.nextLine());

                            System.out.println("Digite o telefone: ");
                            administrativo.setTelefone(entradaUsu.nextLine());
                            System.out.println("Digite sua matrícula");
                            administrativo.setMatricula(entradaUsu.nextLine());

                            biblioteca.manipularUsuarios.adicionarUsuario(administrativo);

                            System.out.println("---Usuário cadastrado com sucesso!---");
                            System.out.println("--Agora faça seu login.--");
                            continuar = true;
                            break;

                        case 5:
                            continuar = true;
                            break;

                        default:
                            System.out.println("Ocorreu algum erro, verifique com um administrador.");
                            continuar = true;
                            break;
                    }

                    break;
                case 3:
                    continuar = true;
                    break;
                default:
                    System.err.println("Opção inválida!");
                    break;
            }
        }while (continuar == true) ;
        return usuarioAcessado;

    }

    static void telaInicial (Usuario usuarioLogado) {
        Scanner ler = new Scanner(System.in);
        boolean livroLiberado = false, continua = true;
        int opcao = 0;
        int entradaUsu, tipoDeLivro, index;

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println("[1] - Livros ");
            System.out.println("[2] - Alugueis");
            System.out.println("[3] - Usuarios");
            System.out.println("[4] - Sair");

            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao){
                case 1-> {
                    do {
                        System.out.println("Escolha uma opção: ");
                        System.out.println("[1] - Pesquisar Livro.");
                        System.out.println("[2] - Cadastrar Livro.");
                        System.out.println("[3] - Editar Livro");
                        System.out.println("[4] - Listar Livro");
                        System.out.println("[5] - Remover Livro");
                        System.out.println("[6] - Voltar.");
                        opcao = ler.nextInt();
                        ler.nextLine();

                        switch (opcao) {
                            case 1:
                                do {
                                    System.out.println("Digite o Tipo de livro que deseja pesquisar (1- Físico / 2- Ebook) ");
                                    tipoDeLivro = ler.nextInt();
                                    ler.nextLine();

                                    switch (tipoDeLivro) {
                                        case 1 -> {
                                            System.out.println("Digite o título da obra que procura: ");
                                            Livro livroEncontrado = biblioteca.manipularLivrosFisicos.buscaLivroPorNome(ler.nextLine());
                                            if(livroEncontrado != null){
                                                System.out.println("Estas são as informações encontradas do livro: ");
                                                livroEncontrado.imprimirDadosLivro();
                                            }
                                        }
                                        case 2 -> {
                                            System.out.println("Digite o título da obra que procura: ");
                                            Livro livroEncontrado = biblioteca.manipularEbooks.buscaEbookPorNome(ler.nextLine());
                                            if(livroEncontrado != null){
                                                System.out.println("Estas são as informações encontradas do livro: ");
                                                livroEncontrado.imprimirDadosLivro();
                                            }
                                        }
                                        default -> {
                                            System.err.println("Valor invalido!");
                                        }
                                    }
                                } while (tipoDeLivro < 1 || tipoDeLivro > 2);
                                break;

                            case 2:
                                Livro livro = new Livro();

                                livro.setIdLivro(biblioteca.getContadorDeLivros());
                                System.out.println("Digite o titulo do livro: ");
                                livro.setTitulo(ler.nextLine());
                                System.out.println("Digite o genero do livro: ");
                                livro.setGenero(ler.nextLine());
                                System.out.println("Digite o Autor: ");
                                livro.setAutor(ler.nextLine());
                                System.out.println("Digite a Editora: ");
                                livro.setEditora(ler.nextLine());
                                System.out.println("Digite o Ano: ");
                                livro.setAno(ler.nextLine());
                                do {
                                    System.out.println("Digite o Tipo (1- Físico / 2- Ebook) ");
                                    tipoDeLivro = ler.nextInt();
                                    ler.nextLine();
                                    switch (tipoDeLivro) {
                                        case 1 -> {
                                            livro.setTipo(1);
                                            biblioteca.manipularLivrosFisicos.adicionarLivroFisico(livro);
                                        }
                                        case 2 -> {
                                            livro.setTipo(2);
                                            biblioteca.manipularEbooks.adicionarEbook(livro);
                                        }
                                        default -> {
                                            System.err.println("Valor invalido!");
                                        }
                                    }
                                } while (tipoDeLivro < 1 || tipoDeLivro > 2);
                                System.out.println("Livro cadastrado com sucesso!");
                                break;

                            case 3:
                                do {
                                    System.out.println("Digite o Tipo (1- Físico / 2- Ebook) ");
                                    tipoDeLivro = ler.nextInt();
                                    ler.nextLine();
                                    switch (tipoDeLivro) {
                                        case 1 -> {

                                            biblioteca.manipularLivrosFisicos.listarLivrosFisicos();
                                            System.out.println("Digite o index do livro que deseja editar: ");
                                            index = ler.nextInt();
                                            ler.nextLine();

                                            if(biblioteca.manipularLivrosFisicos.buscaLivrosFisicos(index) != null){
                                                Livro editar = new Livro();

                                                editar.setIdLivro(biblioteca.getContadorDeLivros());
                                                System.out.println("Digite o titulo do livro: ");
                                                editar.setTitulo(ler.nextLine());
                                                System.out.println("Digite o genero do livro: ");
                                                editar.setGenero(ler.nextLine());
                                                System.out.println("Digite o Autor: ");
                                                editar.setAutor(ler.nextLine());
                                                System.out.println("Digite a Editora: ");
                                                editar.setEditora(ler.nextLine());
                                                System.out.println("Digite o Ano: ");
                                                editar.setAno(ler.nextLine());
                                                editar.setTipo(1);
                                                biblioteca.manipularLivrosFisicos.editarLivrofisico(index, editar);

                                            }else{
                                                System.out.println("Livro não encontrado!");
                                            }
                                        }
                                        case 2 -> {

                                            biblioteca.manipularEbooks.listarEbooks();
                                            System.out.println("Digite o index do livro que deseja editar: ");
                                            index = ler.nextInt();
                                            ler.nextLine();

                                            if(biblioteca.manipularEbooks.buscaEbooks(index) != null){
                                                Livro editar = new Livro();

                                                editar.setIdLivro(biblioteca.getContadorDeLivros());
                                                System.out.println("Digite o titulo do livro: ");
                                                editar.setTitulo(ler.nextLine());
                                                System.out.println("Digite o genero do livro: ");
                                                editar.setGenero(ler.nextLine());
                                                System.out.println("Digite o Autor: ");
                                                editar.setAutor(ler.nextLine());
                                                System.out.println("Digite a Editora: ");
                                                editar.setEditora(ler.nextLine());
                                                System.out.println("Digite o Ano: ");
                                                editar.setAno(ler.nextLine());
                                                editar.setTipo(2);
                                                biblioteca.manipularEbooks.editarEbook(index, editar);

                                            }else{
                                                System.out.println("Livro não encontrado!");
                                            }

                                        }
                                        default -> {
                                            System.err.println("Valor invalido!");
                                        }
                                    }
                                } while (tipoDeLivro < 1 || tipoDeLivro > 2);
                                System.out.println("Livro editado com sucesso!");
                                break;

                            case 4:
                                do {
                                    System.out.println("Digite o Tipo (1- Físico / 2- Ebook) ");
                                    tipoDeLivro = ler.nextInt();
                                    ler.nextLine();

                                    switch (tipoDeLivro) {
                                        case 1 -> {
                                            System.out.println("Lista dos livros físicos: ");
                                            biblioteca.manipularLivrosFisicos.listarLivrosFisicos();
                                        }
                                        case 2 -> {
                                            System.out.println("Lista dos livros físicos: ");
                                            biblioteca.manipularEbooks.listarEbooks();
                                        }
                                        default -> {
                                            System.err.println("Valor invalido!");
                                        }
                                    }
                                } while (tipoDeLivro < 1 || tipoDeLivro > 2);
                                break;

                            case 5:
                                do {
                                    System.out.println("Digite o Tipo (1- Físico / 2- Ebook) ");
                                    tipoDeLivro = ler.nextInt();
                                    ler.nextLine();
                                    switch (tipoDeLivro) {
                                        case 1 -> {
                                            System.out.println("Lista dos livros físicos: ");
                                            biblioteca.manipularLivrosFisicos.listarLivrosFisicos();
                                            System.out.println("Digite o index do livro a ser removido:");
                                            index = ler.nextInt();
                                            ler.nextLine();
                                            biblioteca.manipularLivrosFisicos.removerLivroFisico(index);
                                            System.out.println("Livro removido com sucesso.");
                                        }
                                        case 2 -> {
                                            System.out.println("Lista dos livros físicos: ");
                                            biblioteca.manipularEbooks.listarEbooks();
                                            System.out.println("Digite o index do livro a ser removido:");
                                            index = ler.nextInt();
                                            ler.nextLine();
                                            biblioteca.manipularEbooks.removerEbook(index);
                                            System.out.println("Livro removido com sucesso.");
                                        }
                                        default -> {
                                            System.err.println("Valor invalido!");
                                        }
                                    }
                                } while (tipoDeLivro < 1 || tipoDeLivro > 2);
                                System.out.println("Livro editado com sucesso!");
                                break;
                            case 6:
                                System.out.println("Voltando ao menu anterior.");
                                break;
                            default:
                                System.err.println("Opção invalida.");
                                break;
                        }
                    } while (opcao < 1 || opcao > 6);

                }

                case 2 ->{
                    System.out.println("Escolha uma opção: ");
                    System.out.println("[1] - Realizar um empréstimo");
                    System.out.println("[2] - Devolver um livro");
                    System.out.println("[3] - Listar empréstimos");
                    System.out.println("[4] - Remover um empréstimo da lista (somente Administrador ou Gestor)");
                    System.out.println("[5] - Editar um empréstimo (somente Administrador ou Gestor)");
                    System.out.println("[6] - Voltar");
                    opcao = ler.nextInt();
                    ler.nextLine();

                    switch(opcao){
                        case 1->{
//                            System.out.println("Escolha como deseja pesquisar o empréstimo:");
//                            System.out.println("[1] - Pesquisar cpf de usuário.");
//                            System.out.println("[2] - Pesquisar por título.");
//                            System.out.println("[3] - Pesquisar por nome do usuário.");
//                            System.out.println("[9] - Sair.");
//                            opcao = ler.nextInt();
//                            ler.nextLine();
//
//                            switch (opcao) {
//                                case 1 -> {
//                                    String cpf;
//                                    System.out.println("Digite o cpf do usuário: ");
//                                    cpf = ler.nextLine();
//                                    for (int i = 0; i < biblioteca.listaDeEmprestimos.size(); i++) {
//                                        if (biblioteca.getListaEmprestimos().get(i).getPessoa().getCpf().equals(cpf)) {
//                                            biblioteca.getListaEmprestimos.get(i).imprimeAluguel();
//                                        } else {
//                                            System.out.println("Não existem empréstimos para esse cpf.");
//                                        }
//                                    }
//                                }
//                                case 2 -> {
//                                    String titulo;
//                                    System.out.println("Digite o titulo que deseja buscar: ");
//                                    titulo = ler.nextLine();
//                                    for (int i = 0; i < biblioteca.listaDeEmprestimos.size(); i++) {
//                                        if (biblioteca.getListaEmprestimos().get(i).getLivro.getTitulo().equals(titulo)) {
//                                            biblioteca.getListaEmprestimos.get(i).imprimeAluguel();
//                                        } else {
//                                            System.out.println("Não existem empréstimos para esse título.");
//                                        }
//                                    }
//                                }
//                                case 3 -> {
//                                    String nome;
//                                    System.out.println("Digite o nome do usuário que deseja buscar: ");
//                                    nome = ler.nextLine();
//                                    for (int i = 0; i < biblioteca.listaDeEmprestimos.size(); i++) {
//                                        if (biblioteca.getListaEmprestimos().get(i).getPessoa.getNome().equals(nome)) {
//                                            biblioteca.getListaEmprestimos.get(i).imprimeAluguel();
//                                        } else {
//                                            System.out.println("Não existem empréstimos para essa pessoa.");
//                                        }
//                                    }
//                                }
//                                case 9 -> {
//                                    default -> {
//                                        System.err.println("Opção Invalida!");
//                                    }
//
//                                }
//                            }
                            //PENDENTE
                            System.out.println("Pendente! - EMPRESTAR");
                        }
                        case 2->{
                            //PENDENTE
                            System.out.println("Pendente! - DEVOLVER");
                        }
                        case 3->{
                            biblioteca.manipularAlugueis.listarEmprestimos();
                        }
                        case 4->{
                            if (usuarioLogado.getTipoUsuario() == 3 || usuarioLogado.getTipoUsuario() == 4){
                                biblioteca.manipularAlugueis.listarEmprestimos();
                                System.out.println("Digite o index do empréstimo que deseja remover: ");
                                index = ler.nextInt();
                                ler.nextLine();
                                if(index < 0 || index >= biblioteca.getListaEmprestimos().size()){
                                    System.out.println("Valor inválido. Tente novamente.");
                                }else{
                                    biblioteca.manipularAlugueis.removerAluguel(index);
                                    System.out.println("Registro de aluguel removido com sucesso!");
                                }
                            } else {
                                System.out.println("Seu usuário não tem permissão para acessar essas opções. Contate o administrador.");
                            }
                        }
                        case 5->{
                            if (usuarioLogado.getTipoUsuario() == 3 || usuarioLogado.getTipoUsuario() == 4){
                                biblioteca.manipularAlugueis.listarEmprestimos();
                                System.out.println("Digite o index do empréstimo que deseja editar: ");
                                index = ler.nextInt();
                                ler.nextLine();
                                if(index < 0 || index >= biblioteca.getListaEmprestimos().size()){
                                    System.out.println("Valor inválido. Tente novamente.");
                                }else{
                                    Aluguel aluguelEditado = new Aluguel();
                                    System.out.println("Digite o valor da multa desse aluguel: ");
                                    aluguelEditado.setValorMulta(ler.nextDouble());
                                    ler.nextLine();

                                    System.out.println("O livro está emprestado? (1-sim, 2-não)");
                                    entradaUsu = ler.nextInt();
                                    if(entradaUsu == 1){
                                        aluguelEditado.setFinalizado(false);
                                    }else{
                                        aluguelEditado.setFinalizado(true);
                                    }

                                    System.out.println("Digite a quantidade de dias desse aluguel: ");
                                    aluguelEditado.setQuantidadeDeDias(ler.nextInt());
                                    ler.nextLine();

                                    biblioteca.manipularAlugueis.editarEmprestimo(index, aluguelEditado);
                                    System.out.println("Livro editado com sucesso!");
                                }
                            } else {
                                System.out.println("Seu usuário não tem permissão para acessar essas opções. Contate o administrador.");
                            }
                        }
                        case 6->{
                            System.out.println("Voltando ao menu anterior.");
                        }
                        default -> {
                            System.err.println("Opção inválida, tente novamente.");
                        }
                    }

                }

                case 3 ->{
                    if (usuarioLogado.getTipoUsuario() == 3 || usuarioLogado.getTipoUsuario() == 4){

                        do {
                            System.out.println("Escolha uma opção: ");
                            System.out.println("[1] - Pesquisar usuário.");
                            System.out.println("[2] - Cadastrar usuário.");
                            System.out.println("[3] - Editar usuário.");
                            System.out.println("[4] - Listar usuários.");
                            System.out.println("[5] - Remover usuário.");
                            System.out.println("[6] - Sair.");
                            opcao = ler.nextInt();
                            ler.nextLine();

                            switch (opcao) {
                                case 1 -> {
                                    String busca;
                                    System.out.println("Digite o cpf do usuario que deseja buscar:");
                                    busca = ler.nextLine();
                                    Usuario usuarioBuscado = biblioteca.manipularUsuarios.buscaUsuario(busca);

                                    if(usuarioBuscado.getTipoUsuario() == 1){
                                        Estudante estudante = (Estudante) usuarioBuscado;
                                        estudante.imprimir();
                                    }else if(usuarioBuscado.getTipoUsuario() == 2){
                                        Professor professor = (Professor) usuarioBuscado;
                                        professor.imprimir();
                                    }else if(usuarioBuscado.getTipoUsuario() == 3){
                                        Gestor gestor = (Gestor) usuarioBuscado;
                                        gestor.imprimir();
                                    }else if(usuarioBuscado.getTipoUsuario() == 4){
                                        Administrativo administrativo = (Administrativo) usuarioBuscado;
                                        administrativo.imprimir();
                                    }

                                }
                                case 2 -> {
                                    do {
                                        System.out.println("Qual tipo de usuário deseja cadastrar? ");
                                        System.out.println("[1] - Estudante ");
                                        System.out.println("[2] - Professor ");
                                        System.out.println("[3] - Gestor ");
                                        System.out.println("[4] - Administrador ");
                                        System.out.println("[5] - Voltar");
                                        opcao = ler.nextInt();
                                        ler.nextLine();
                                        if (opcao < 1 || opcao > 5) {
                                            System.err.println("Opção inválida. Tente novamente.");
                                        }
                                    } while (opcao < 1 || opcao > 4);

                                    switch (opcao) {
                                        case 1:
                                            Estudante estudante = new Estudante();

                                            estudante.setTipoUsuario(1);
                                            System.out.println("Digite o nome: ");
                                            estudante.setNome(ler.nextLine());

                                            System.out.println("Digite o CPF: ");
                                            estudante.setCpf(ler.nextLine());

                                            System.out.println("Agora sobre o endereço");
                                            System.out.println("Digite a rua: ");
                                            estudante.setLogradouro(ler.nextLine());
                                            System.out.println("Digite o bairro: ");
                                            estudante.setBairro(ler.nextLine());
                                            System.out.println("Digite o CEP: ");
                                            estudante.setCep(ler.nextLine());
                                            System.out.println("Digite o número: ");
                                            estudante.setNumero(ler.nextLine());

                                            System.out.println("Digite o telefone: ");
                                            estudante.setTelefone(ler.nextLine());
                                            System.out.println("Digite a matrícula");
                                            estudante.setMatricula(ler.nextLine());

                                            biblioteca.manipularUsuarios.adicionarUsuario(estudante);
                                            estudante.imprimir();

                                            System.out.println("---Usuário cadastrado com sucesso!---");
                                            break;

                                        case 2:
                                            Professor professor = new Professor();

                                            professor.setTipoUsuario(2);
                                            System.out.println("Digite o nome: ");
                                            professor.setNome(ler.nextLine());

                                            System.out.println("Digite o CPF: ");
                                            professor.setCpf(ler.nextLine());

                                            System.out.println("Agora sobre o endereço");
                                            System.out.println("Digite a rua: ");
                                            professor.setLogradouro(ler.nextLine());
                                            System.out.println("Digite o bairro: ");
                                            professor.setBairro(ler.nextLine());
                                            System.out.println("Digite o CEP: ");
                                            professor.setCep(ler.nextLine());
                                            System.out.println("Digite o número: ");
                                            professor.setNumero(ler.nextLine());

                                            System.out.println("Digite o telefone: ");
                                            professor.setTelefone(ler.nextLine());
                                            System.out.println("Digite a matrícula");
                                            professor.setMatricula(ler.nextLine());

                                            biblioteca.manipularUsuarios.adicionarUsuario(professor);
                                            professor.imprimir();

                                            System.out.println("---Usuário cadastrado com sucesso!---");
                                            break;

                                        case 3:
                                            Gestor gestor = new Gestor();

                                            gestor.setTipoUsuario(3);
                                            System.out.println("Digite o nome: ");
                                            gestor.setNome(ler.nextLine());

                                            System.out.println("Digite o CPF: ");
                                            gestor.setCpf(ler.nextLine());

                                            System.out.println("Agora sobre o endereço");
                                            System.out.println("Digite a rua: ");
                                            gestor.setLogradouro(ler.nextLine());
                                            System.out.println("Digite o bairro: ");
                                            gestor.setBairro(ler.nextLine());
                                            System.out.println("Digite o CEP: ");
                                            gestor.setCep(ler.nextLine());
                                            System.out.println("Digite o número: ");
                                            gestor.setNumero(ler.nextLine());

                                            System.out.println("Digite o telefone: ");
                                            gestor.setTelefone(ler.nextLine());
                                            System.out.println("Digite a matrícula");
                                            gestor.setMatricula(ler.nextLine());

                                            biblioteca.manipularUsuarios.adicionarUsuario(gestor);
                                            gestor.imprimir();

                                            System.out.println("---Usuário cadastrado com sucesso!---");
                                            break;

                                        case 4:
                                            Administrativo administrativo = new Administrativo();

                                            administrativo.setTipoUsuario(4);
                                            System.out.println("Digite o nome: ");
                                            administrativo.setNome(ler.nextLine());

                                            System.out.println("Digite o CPF: ");
                                            administrativo.setCpf(ler.nextLine());

                                            System.out.println("Agora sobre o endereço");
                                            System.out.println("Digite a rua: ");
                                            administrativo.setLogradouro(ler.nextLine());
                                            System.out.println("Digite o bairro: ");
                                            administrativo.setBairro(ler.nextLine());
                                            System.out.println("Digite o CEP: ");
                                            administrativo.setCep(ler.nextLine());
                                            System.out.println("Digite o número: ");
                                            administrativo.setNumero(ler.nextLine());

                                            System.out.println("Digite o telefone: ");
                                            administrativo.setTelefone(ler.nextLine());
                                            System.out.println("Digite a matrícula");
                                            administrativo.setMatricula(ler.nextLine());

                                            biblioteca.manipularUsuarios.adicionarUsuario(administrativo);
                                            administrativo.imprimir();

                                            System.out.println("---Usuário cadastrado com sucesso!---");
                                            break;

                                        case 5:
                                            break;

                                        default:
                                            System.out.println("Ocorreu algum erro, verifique com um administrador.");
                                            break;
                                    }
                                }
                                case 3 -> {
                                    String cpf;
                                    biblioteca.manipularUsuarios.listarUsuarios();
                                    System.out.println("Digite o CPF do usuário que deseja editar: ");
                                    cpf = ler.nextLine();

                                    if (biblioteca.manipularUsuarios.buscaUsuario(cpf) != null){
                                        Usuario buscaUsuario = biblioteca.manipularUsuarios.buscaUsuario(cpf);

                                        System.out.println("Digite o novo nome do usuário: ");
                                        buscaUsuario.setNome(ler.nextLine());
                                        System.out.println("Digite o novo cpf do usuário: ");
                                        buscaUsuario.setCpf(ler.nextLine());
                                        System.out.println("Digite o novo nome do usuário: ");
                                        buscaUsuario.setTelefone(ler.nextLine());
                                        System.out.println("Digite o novo logradouro do usuário: ");
                                        buscaUsuario.setLogradouro(ler.nextLine());
                                        System.out.println("Digite o novo número: ");
                                        buscaUsuario.setNumero(ler.nextLine());
                                        System.out.println("Digite o novo bairro: ");
                                        buscaUsuario.setBairro(ler.nextLine());
                                        System.out.println("Digite o novo cep: ");
                                        buscaUsuario.setCep(ler.nextLine());

                                        System.out.println("Usuário editado com sucesso!");
                                    } else {
                                        System.out.println("Usuário não encontrado!");
                                    }
                                }
                                case 4 -> {
                                    biblioteca.manipularUsuarios.listarUsuarios();
                                    System.out.println("Esses são os usuários cadastrados.");
                                }
                                case 5 -> {
                                    System.out.println("Lista de usuários: ");
                                    biblioteca.manipularUsuarios.listarUsuarios();
                                    System.out.println("Digite o index do usuário a ser removido:");
                                    index = ler.nextInt();
                                    ler.nextLine();
                                    if(index < 0 || index >= biblioteca.getListaDeUsuarios().size()){
                                        System.out.println("Valor inválido. Tente novamente.");
                                    }else{
                                        if(biblioteca.getListaDeUsuarios().get(index).getCpf().equals(usuarioLogado.getCpf())){
                                            System.out.println("Você não pode remover seu usuário.");
                                        }else{
                                            biblioteca.manipularUsuarios.removerUsuarioPorIndice(index);
                                            System.out.println("Usuário removido com sucesso.");
                                        }
                                    }
                                }
                            }
                        } while (opcao != 6);
                    } else {
                        System.out.println("Seu usuário não tem permissão para acessar essas opções. Contate o administrador.");
                    }
                }
                case 4 ->{
                    continua = false;
                }


            }
        }while (continua == true);
    }



}