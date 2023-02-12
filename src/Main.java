import java.util.Scanner;

public class Main {

    static AcervoDaBiblioteca biblioteca = new AcervoDaBiblioteca();

    public static void main(String[] args) {

        boolean sair = false;
        Usuario usuarioAcessado = null;
        usuarioAcessado = telaLogin();


        if (usuarioAcessado != null) {
            telaInicial();
        } else {
            System.out.println("Programa finalizado.");
        }

    }

        static Usuario telaLogin () {

            Scanner entradaUsu = new Scanner(System.in);
            boolean acessoLiberado = false, continuar = true;
            int opcao = 0;
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
                            acessoLiberado = true;
                            continuar = false;
                        } else {
                            System.out.println("Usuário não encontrado. Tente novamente.");
                        }
                        break;

                    case 2:
                        opcao = 0;

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
                                System.out.println("Opção inválida. Tente novamente.");
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
                                acessoLiberado = false;
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
                                acessoLiberado = false;
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
                                acessoLiberado = false;
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
                                acessoLiberado = false;
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
                        acessoLiberado = true;
                        continuar = true;
                        break;

                    default:
                        System.err.println("Opção inválida!");
                        break;
                }

            } while (continuar == true);

            return usuarioAcessado;

        }

        static void telaInicial () {
            Scanner ler = new Scanner(System.in);
            boolean livroLiberado = false, continua = true;
            int opcao = 0;
            int idLivro;

            do {
                System.out.println("-----BEM-VINDO A BIBLIOTECA DBC!-----");
                System.out.println("Escolha uma opção: ");
                System.out.println("[1] - Pesquisar Livro.");
                System.out.println("[2] - Cadastrar Livro.");
                System.out.println("[3] - Editar Livro");
                System.out.println("[4] - Remover Livro");
                System.out.println("[5] - Sair.");
                opcao = ler.nextInt();
                ler.nextLine();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o ID do livro ");
                        idLivro = ler.nextInt();
                        if (biblioteca.manipularLivrosFisicos.buscaLivrosFisicos(idLivro) != null) {
                            livroLiberado = true;
                        } else {
                            System.out.println("Livro não encontrado.");
                        }
                        break;

                    case 2:
                        opcao = 0;

                        do {
                            System.out.println("Digite os dados do livro. ");

                            opcao = ler.nextInt();
                            ler.nextLine();

                            if (opcao < 1 || opcao > 7) {
                                System.out.println("Opção inválida. Tente novamente.");
                            }
                        } while (opcao < 1 || opcao > 6);

                        switch (opcao) {
                            case 1:
                                Livro livro = new Livro();

                                livro.setIdLivro(0);
                                System.out.println("Digite o ID do livro: ");
                                livro.setIdLivro(ler.nextInt());
                                System.out.println("Digite o titulo do livro: ");
                                livro.setTitulo(ler.nextLine());
                                System.out.println("Digite o genero do livro: ");
                                livro.setGenero(ler.nextLine());
                                System.out.println("Digite o Autor: ");
                                livro.setAutor(ler.nextLine());
                                System.out.println("Digite a Editora: ");
                                livro.setEditora(ler.nextLine());
                                System.out.println("Digite o  Ano: ");
                                livro.setAno(ler.nextLine());
                                System.out.println("Digite o Tipo(1- Físico / 2- Ebook) ");
                                livro.setTipo(ler.nextInt());

                                biblioteca.manipularLivrosFisicos.adicionarLivroFisico(livro);

                                System.out.println("Livro cadastrado com sucesso!");
                                livroLiberado = true;
                                continua = false;
                                break;

                        }
                        while (continua == true) {
                            return;

                        }
                    case 3:
//                      como deseja pesquisar o livro!!!!
                        System.out.println("Digite o ID do livro que quer editar:");
                        idLivro = ler.nextInt();
                        ler.nextLine();
                        Livro livro = biblioteca.manipularLivrosFisicos.buscaLivrosFisicos(idLivro);
                        if (livro != null) {
                            biblioteca.manipularLivrosFisicos.editarLivrofisico();
                            livroLiberado = true;
                        } else {
                            System.out.println("Livro não encontrado.");
                        }
                    case 3:
//                      como deseja pesquisar o livro!!!!
                        System.out.println("Digite o ID do livro que quer editar:");
                        idLivro = ler.nextInt();
                        ler.nextLine();
                        Livro livro = biblioteca.manipularLivrosFisicos.buscaLivrosFisicos(idLivro);
                        if (livro != null) {
                            biblioteca.manipularLivrosFisicos.removerLivroFisicoPorId();
                            livroLiberado = true;
                        } else {
                            System.out.println("Livro não encontrado.");
                        }
                        break;

                }


            } while (continua);


        }
    }
