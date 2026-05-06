package br.edu.ifpb.poo.aplicacao;

import java.util.Scanner;

import br.edu.ifpb.poo.modelo.Aluno;
import br.edu.ifpb.poo.modelo.Cd;
import br.edu.ifpb.poo.modelo.Dvd;
import br.edu.ifpb.poo.modelo.FuncionarioAdministrativo;
import br.edu.ifpb.poo.modelo.Livro;
import br.edu.ifpb.poo.modelo.PosGraduado;
import br.edu.ifpb.poo.modelo.Professor;
import br.edu.ifpb.poo.modelo.Revista;
import br.edu.ifpb.poo.servico.GerenciadorDeItens;
import br.edu.ifpb.poo.servico.GerenciadorDeUsuario;
import br.edu.ifpb.poo.servico.GerenciadorEmprestimos;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta = 1;
        GerenciadorDeUsuario usuarios = new GerenciadorDeUsuario();
        GerenciadorDeItens itens = new GerenciadorDeItens();
        GerenciadorEmprestimos emprestimos = new GerenciadorEmprestimos();

        Livro livroDefault = new Livro("37910000194500", "O Senhor dos Aneis",
                "J.R.R.Tolkien", "Harper Collins", 2020, "Fantasia",
                1100, "Frodo Bolseiro embarca numa missão com seu seus amigos hobbits,\nseu guia Gandalf, elfos, um anão e humanos para levar o Um Anel para a\nMontanha da Perdição e salvar a Terra Média.");
        itens.addLivro(livroDefault);

        Livro livroDefault2 = new Livro("18900000197700", "Sherlock Holmes",
                "Arthur Conan Doyler", "Harper Collins", 2021, "Romance Policial",
                220, "O Dr. Watson acompanha a resolução dos mistérios por seu amigo\nSherlock Holmes Detetive de Londres.");
        itens.addLivro(livroDefault2);
        Livro livroDefault3 = new Livro("17000000198400", "1984",
                "George Orwell", "Darkside", 1983, "Ficção Distopica",
                336, "Winston Smith desafia o Partido e o Grande Irmão, buscando \nliberdade e amor em um mundo vigiado de controle absoluto.");
        itens.addLivro(livroDefault3);
        Revista revistaDefault = new Revista("1001002003004", "Veja", 1, "Abril", "11/08/2019");
        itens.addRevista(revistaDefault);


        Aluno alunoDefault = new Aluno("Anna", "2024137300", "Sistemas");
        usuarios.addAluno(alunoDefault);
        Aluno alunoDefault2 = new Aluno("Harry", "2024137100", "Redes", "inativo");
        usuarios.addAluno(alunoDefault2);
        Professor professorDefault2 = new Professor("Rafael", "2024137000");
        usuarios.addProfessor(professorDefault2);
        

        while (resposta != 0) {
            System.out.println("""

                _____________Biblioteca Polaris____________
                [1] Gerenciar Itens do Acervo
                [2] Gerenciar Usuários
                [3] Realizar Emprestimos
                [4] Consultar
                [0] Sair
             """);
            resposta = sc.nextInt();
            sc.nextLine();
            switch (resposta) {
                case 1:
                    gerenciarItensAcervo(sc, itens);
                    break;
                case 2:
                    gerenciarUsuarios(sc, usuarios);
                    break;
                case 3:
                    realizarEmprestimos(sc, usuarios, itens, emprestimos);
                    break;
                case 4:
                    consultar(sc, usuarios, itens, emprestimos);
                    break;
                case 0:
                    System.out.println("Você saiu.");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
        sc.close();
    }

    private static void consultar(Scanner sc, GerenciadorDeUsuario usuarios, GerenciadorDeItens itens, GerenciadorEmprestimos emprestimos) {

        int respconsult = 1;
        while (respconsult != 0) {
            System.out.println("""
               O que você gostaria de Fazer? 
               [1] Listar Usuários
               [2] Listar Itens do Acervo
               [3] Listar Empréstimos
               [4] Pesquisar Usuário
               [5] Pesquisar Item do Acervo
               [0] Voltar
            """);
            respconsult = Integer.parseInt(sc.nextLine());
            switch (respconsult) {
                case 1:
                    System.out.println("\nAlunos cadastrados: ");
                    usuarios.listarAlunos();
                    System.out.println("\nProfessores cadastrados: ");
                    usuarios.listarProfessores();
                    System.out.println("\nPos Graduados cadastrados: ");
                    usuarios.listarPosGraduados();
                    System.out.println("\nFuncionário Administrativos cadastrados: ");
                    usuarios.listarFuncionariosAdministrativos();
                    break;
                case 2:
                    System.out.println("Livros cadastrados: ");
                    itens.listarLivros();
                    System.out.println("\nRevistas cadastradas: ");
                    itens.listarRevistas();
                    System.out.println("\nCDs cadastrados: ");
                    itens.listarCds();
                    System.out.println("\nDVDs cadastrados: ");
                    itens.listarDvds();
                    break;
                case 3:
                    System.out.println("Empréstimos Cadastrados: ");
                    emprestimos.listaEmprestimos();
                    break;
                case 4:
                    buscarUsuario(sc, usuarios);
                    break;
                case 5:
                    buscarItem(sc, itens);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void buscarUsuario(Scanner sc, GerenciadorDeUsuario usuarios) {
        int respcons = 1;
        while (respcons != 0) {
            System.out.println("""
               Que usuário você gostaria de buscar? 
               [1] Pesquisar Aluno
               [2] Pesquisar Professor
               [3] Pesquisar Pós Graduado
               [4] Pesquisar Funcionário Administrativo
               [0] Voltar
            """);
            respcons = Integer.parseInt(sc.nextLine());
            switch (respcons) {
                case 1:
                    System.out.println("Digite a matricula do aluno que deseja buscar: ");
                    String matriculaAluno = sc.nextLine();
                    Aluno alunoEncontrado = usuarios.buscarAluno(matriculaAluno);
                    if (alunoEncontrado == null) {
                        System.out.println("Aluno não encontrado");
                    } else {
                        System.out.println(alunoEncontrado.toString());
                    }
                    break;
                case 2:
                    System.out.println("Digite a matricula do Professor que deseja buscar: ");
                    String matriculaProfessor = sc.nextLine();
                    Professor professorEncontrado = usuarios.buscarProfessor(matriculaProfessor);
                    if (professorEncontrado == null) {
                        System.out.println("Professor não encontrado");
                    } else {
                        System.out.println(professorEncontrado.toString());
                    }
                    break;
                case 3:
                    System.out.println("Digite a matricula do Pós Graduado que deseja buscar: ");
                    String matriculaPos = sc.nextLine();
                    PosGraduado posGraduadoEncontrado = usuarios.buscarPosGraduado(matriculaPos);
                    if (posGraduadoEncontrado == null) {
                        System.out.println("PosGraduado não encontrado");
                    } else {
                        System.out.println(posGraduadoEncontrado.toString());
                    }
                    break;
                case 4:
                    System.out.println("Digite a matricula do Funcionário Administrativo que deseja buscar: ");
                    String matriculaFuncionario = sc.nextLine();
                    FuncionarioAdministrativo funcionarioEncontrado = usuarios.buscarFuncionario(matriculaFuncionario);
                    if (funcionarioEncontrado == null) {
                        System.out.println("Funcionario não encontrado");
                    } else {
                        System.out.println(funcionarioEncontrado.toString());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void buscarItem(Scanner sc, GerenciadorDeItens itens) {
        int respco = 1;
        while (respco != 0) {
            System.out.println("""
               Que item do acervo você gostaria de buscar? 
               [1] Pesquisar Livro
               [2] Pesquisar Revista
               [3] Pesquisar Cd
               [4] Pesquisar Dvd
               [0] Voltar
            """);
            respco = Integer.parseInt(sc.nextLine());
            switch (respco) {
                case 1:
                    System.out.println("Digite o título do livro que deseja buscar: ");
                    String tituloLivro = sc.nextLine();
                    Livro livroEncontrado = itens.buscarLivro(tituloLivro);
                    if (livroEncontrado == null) {
                        System.out.println("Livro não encontrado");
                    } else {
                        System.out.println(livroEncontrado.toString());
                    }
                    break;
                case 2:
                    System.out.println("Digite o título da revista que deseja buscar: ");
                    String tituloRevista = sc.nextLine();
                    Revista revistaEncontrada = itens.buscarRevista(tituloRevista);
                    if (revistaEncontrada == null) {
                        System.out.println("Revista não encontrado");
                    } else {
                        System.out.println(revistaEncontrada.toString());
                    }
                    break;
                case 3:
                    System.out.println("Digite o título do cd que deseja buscar: ");
                    String tituloCd = sc.nextLine();
                    Cd cdEncontrado = itens.buscarCd(tituloCd);
                    if (cdEncontrado == null) {
                        System.out.println("Cd não encontrado");
                    } else {
                        System.out.println(cdEncontrado.toString());
                    }
                    break;
                case 4:
                    System.out.println("Digite o título do dvd que deseja buscar: ");
                    String tituloDvd = sc.nextLine();
                    Dvd dvdEncontrado = itens.buscarDvd(tituloDvd);
                    if (dvdEncontrado == null) {
                        System.out.println("Dvd não encontrado");
                    } else {
                        System.out.println(dvdEncontrado.toString());
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void realizarEmprestimos(Scanner sc, GerenciadorDeUsuario usuarios, GerenciadorDeItens itens, GerenciadorEmprestimos emprestimos) {
        int resp = 1;
        while (resp != 0) {
            System.out.println("""
                Para qual tipo de usuário você deseja realizar um empréstimo? 
                [1] Aluno
                [2] Professor
                [3] Pós Graduado
                [4] Funcionário Administrativo
                [0] Voltar
            """);
            resp = Integer.parseInt(sc.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("Digite a Matricula do Aluno que deseja emprestar");
                    String matriculaAluno = sc.nextLine();
                    Aluno alunoEncontrado = usuarios.buscarAluno(matriculaAluno);
                    if (alunoEncontrado == null) {
                        System.out.println("\nAluno não encontrado\n");
                    }else if (!alunoEncontrado.getAtivo().equals("ativo")) {
                        System.out.println("\nAluno não pode fazer empréstimo pois está inativo\n");
                    } else {
                        EmprestimosEscolherItemAluno(sc, itens, emprestimos, alunoEncontrado);
                    } break;
                }
                case 2:{
                    System.out.println("Digite a Matricula do Professor que deseja emprestar");
                    String matriculaProfessor = sc.nextLine();
                    Professor professorEncontrado = usuarios.buscarProfessor(matriculaProfessor);
                    if (professorEncontrado == null) {
                        System.out.println("\nProfessor não encontrado\n");
                    }else if (!professorEncontrado.getAtivo().equals("ativo")) {
                        System.out.println("\nProfessor não pode fazer empréstimo pois está inativo\n");
                    } else {
                        EmprestimosEscolherItemProfessor(sc, itens, usuarios, emprestimos, professorEncontrado);
                    } break;
                }
                case 3:{
                    System.out.println("Digite a Matricula do Pós Graduado que deseja emprestar");
                    String matriculaAluno = sc.nextLine();
                    PosGraduado posGraduadoEncontrado = usuarios.buscarPosGraduado(matriculaAluno);
                    if (posGraduadoEncontrado == null) {
                        System.out.println("\nPós Graduado não encontrado\n");
                    }else if (!posGraduadoEncontrado.getAtivo().equals("ativo")) {
                        System.out.println("\nPós Graduado não pode fazer empréstimo pois está inativo\n");
                    } else {
                        EmprestimosEscolherItemPosGraduado(sc, itens, usuarios, emprestimos, posGraduadoEncontrado);
                    } break;
                }
                case 4:{
                    System.out.println("Digite a Matricula do Funcionário que deseja emprestar");
                    String matriculaFuncionario = sc.nextLine();
                    FuncionarioAdministrativo funcionarioEncontrado = usuarios.buscarFuncionario(matriculaFuncionario);
                    if (funcionarioEncontrado == null) {
                        System.out.println("\nFuncionario não encontrado\n");
                    }else if (!funcionarioEncontrado.getAtivo().equals("ativo")) {
                        System.out.println("\nFuncionario não pode fazer empréstimo pois está inativo\n");
                    } else {
                        EmprestimosEscolherItemFuncionario(sc, itens, usuarios, emprestimos, funcionarioEncontrado);
                    } break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }

    


    private static void EmprestimosEscolherItemAluno(Scanner sc, GerenciadorDeItens itens, GerenciadorEmprestimos emprestimos, Aluno alunoEncontrado) {
        int resp = 1;
        while (resp != 0) {
            System.out.println("""
                Qual item você deseja pegar emprestado 
                [1] Livro
                [2] Revista
                [3] Cd
                [4] Dvd
                [0] Voltar
            """);
            resp = Integer.parseInt(sc.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("Digite o titulo do livro que deseja emprestar");
                    String tituloLivro = sc.nextLine();
                    Livro livroEncontrado = itens.buscarLivro(tituloLivro);
                    if (livroEncontrado == null) {
                        System.out.println("Livro não encontrado");
                        break;
                    } 
                    else {
                        emprestimos.emprestarLivroParaAluno(alunoEncontrado, livroEncontrado);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                
                case 2:{
                    System.out.println("Digite o titulo da revista que deseja emprestar");
                    String tituloRevista = sc.nextLine();
                    Revista revistaEncontrada = itens.buscarRevista(tituloRevista);
                    if (revistaEncontrada == null) {
                        System.out.println("Revista não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarRevistaParaAluno(alunoEncontrado, revistaEncontrada);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 3:{
                    System.out.println("Digite o titulo do cd que deseja emprestar");
                    String tituloCd = sc.nextLine();
                    Cd cdEncontrado = itens.buscarCd(tituloCd);
                    if (cdEncontrado == null) {
                        System.out.println("Cd não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarCdParaAluno(alunoEncontrado, cdEncontrado);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 4:{
                    System.out.println("Digite o titulo do dvd que deseja emprestar");
                    String tituloDvd = sc.nextLine();
                    Dvd dvdEncontrada = itens.buscarDvd(tituloDvd);
                    if (dvdEncontrada == null) {
                        System.out.println("Dvd não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarDvdParaAluno(alunoEncontrado, dvdEncontrada);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }


    private static void EmprestimosEscolherItemProfessor(Scanner sc, GerenciadorDeItens itens, GerenciadorDeUsuario usuarios, GerenciadorEmprestimos emprestimos, Professor professorEncontrado) {
        int resp = 1;
        while (resp != 0) {
            System.out.println("""
                Qual item você deseja pegar emprestado 
                [1] Livro
                [2] Revista
                [3] Cd
                [4] Dvd
                [0] Voltar
            """);
            resp = Integer.parseInt(sc.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("Digite o titulo do livro que deseja emprestar");
                    String tituloLivro = sc.nextLine();
                    Livro livroEncontrado = itens.buscarLivro(tituloLivro);
                    if (livroEncontrado == null) {
                        System.out.println("Livro não encontrado");
                        break;
                    } else {
                        emprestimos.emprestarLivroParaProfessor(professorEncontrado, livroEncontrado);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                
                case 2:{
                    System.out.println("Digite o titulo da revista que deseja emprestar");
                    String tituloRevista = sc.nextLine();
                    Revista revistaEncontrada = itens.buscarRevista(tituloRevista);
                    if (revistaEncontrada == null) {
                        System.out.println("Revista não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarRevistaParaProfessor(professorEncontrado, revistaEncontrada);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 3:{
                    System.out.println("Digite o titulo do cd que deseja emprestar");
                    String tituloCd = sc.nextLine();
                    Cd cdEncontrado = itens.buscarCd(tituloCd);
                    if (cdEncontrado == null) {
                        System.out.println("Cd não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarCdParaProfessor(professorEncontrado, cdEncontrado);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 4:{
                    System.out.println("Digite o titulo do dvd que deseja emprestar");
                    String tituloDvd = sc.nextLine();
                    Dvd dvdEncontrada = itens.buscarDvd(tituloDvd);
                    if (dvdEncontrada == null) {
                        System.out.println("Dvd não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarDvdParaProfessor(professorEncontrado, dvdEncontrada);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }



    private static void EmprestimosEscolherItemPosGraduado(Scanner sc, GerenciadorDeItens itens, GerenciadorDeUsuario usuarios, GerenciadorEmprestimos emprestimos, PosGraduado posGraduadoEncontrado) {
        int resp = 1;
        while (resp != 0) {
            System.out.println("""
                Qual item você deseja pegar emprestado 
                [1] Livro
                [2] Revista
                [3] Cd
                [4] Dvd
                [0] Voltar
            """);
            resp = Integer.parseInt(sc.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("Digite o titulo do livro que deseja emprestar");
                    String tituloLivro = sc.nextLine();
                    Livro livroEncontrado = itens.buscarLivro(tituloLivro);
                    if (livroEncontrado == null) {
                        System.out.println("Livro não encontrado");
                        break;
                    } else {
                        emprestimos.emprestarLivroParaPosGraduado(posGraduadoEncontrado, livroEncontrado);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                
                case 2:{
                    System.out.println("Digite o titulo da revista que deseja emprestar");
                    String tituloRevista = sc.nextLine();
                    Revista revistaEncontrada = itens.buscarRevista(tituloRevista);
                    if (revistaEncontrada == null) {
                        System.out.println("Revista não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarRevistaParaPosGraduado(posGraduadoEncontrado, revistaEncontrada);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 3:{
                    System.out.println("Digite o titulo do cd que deseja emprestar");
                    String tituloCd = sc.nextLine();
                    Cd cdEncontrado = itens.buscarCd(tituloCd);
                    if (cdEncontrado == null) {
                        System.out.println("Cd não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarCdParaPosGraduado(posGraduadoEncontrado, cdEncontrado);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 4:{
                    System.out.println("Digite o titulo do dvd que deseja emprestar");
                    String tituloDvd = sc.nextLine();
                    Dvd dvdEncontrada = itens.buscarDvd(tituloDvd);
                    if (dvdEncontrada == null) {
                        System.out.println("Dvd não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarDvdParaPosGraduado(posGraduadoEncontrado, dvdEncontrada);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }


    private static void EmprestimosEscolherItemFuncionario(Scanner sc, GerenciadorDeItens itens, GerenciadorDeUsuario usuarios, GerenciadorEmprestimos emprestimos, FuncionarioAdministrativo funcionarioEncontrado) {
        int resp = 1;
        while (resp != 0) {
            System.out.println("""
                Qual item você deseja pegar emprestado 
                [1] Livro
                [2] Revista
                [3] Cd
                [4] Dvd
                [0] Voltar
            """);
            resp = Integer.parseInt(sc.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("Digite o titulo do livro que deseja emprestar");
                    String tituloLivro = sc.nextLine();
                    Livro livroEncontrado = itens.buscarLivro(tituloLivro);
                    if (livroEncontrado == null) {
                        System.out.println("Livro não encontrado");
                        break;
                    } else {
                        emprestimos.emprestarLivroParaFuncionario(funcionarioEncontrado, livroEncontrado);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                
                case 2:{
                    System.out.println("Digite o titulo da revista que deseja emprestar");
                    String tituloRevista = sc.nextLine();
                    Revista revistaEncontrada = itens.buscarRevista(tituloRevista);
                    if (revistaEncontrada == null) {
                        System.out.println("Revista não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarRevistaParaFuncionario(funcionarioEncontrado, revistaEncontrada);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 3:{
                    System.out.println("Digite o titulo do cd que deseja emprestar");
                    String tituloCd = sc.nextLine();
                    Cd cdEncontrado = itens.buscarCd(tituloCd);
                    if (cdEncontrado == null) {
                        System.out.println("Cd não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarCdParaFuncionario(funcionarioEncontrado, cdEncontrado);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 4:{
                    System.out.println("Digite o titulo do dvd que deseja emprestar");
                    String tituloDvd = sc.nextLine();
                    Dvd dvdEncontrada = itens.buscarDvd(tituloDvd);
                    if (dvdEncontrada == null) {
                        System.out.println("Dvd não encontrada");
                        break;
                    } else {
                        emprestimos.emprestarDvdParaFuncionario(funcionarioEncontrado, dvdEncontrada);
                        System.out.println("\n Empréstimo realizado com sucesso!\n");
                    } break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }



    private static void gerenciarItensAcervo(Scanner sc, GerenciadorDeItens itens) {
        int resp = 1;
        while (resp != 0) {
            System.out.println("""
                Qual tipo de item você gostaria de adicionar? 
                [1] Livro
                [2] Revista
                [3] Cd
                [4] Dvd
                [0] Voltar
            """);
            resp = Integer.parseInt(sc.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("Digite o isbn do livro: ");
                    String isbn = sc.nextLine();
                    System.out.println("Digite o titulo do livro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o nome do autor do livro: ");
                    String autor = sc.nextLine();
                    System.out.println("Digite o ano de Publicação do livro: ");
                    int anoPublicacao = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite o nome da editora: ");
                    String editora = sc.nextLine();
                    System.out.println("Digite o genero literário do livro: ");
                    String generoLiterario = sc.nextLine();
                    System.out.println("Digite o numero de páginas do livro: ");
                    int numeroPaginas = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite a sinopse do livro: ");
                    String sinopse = sc.nextLine();

                    Livro livros = new Livro(isbn, titulo, autor, editora, anoPublicacao, generoLiterario, numeroPaginas, sinopse);
                    itens.addLivro(livros);
                    System.out.println("\n Livro Cadastrado com sucesso!\n");
                }
                break;
                case 2: {
                    System.out.println("Digite o issn da revista: ");
                    String issn = sc.nextLine();
                    System.out.println("Digite o nome da revista: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o volume do livro: ");
                    int volume = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite o nome da editora: ");
                    String editora = sc.nextLine();
                    System.out.println("Digite a data de publicação da revista: ");
                    String dataPublicacao = sc.next();

                    Revista revistas = new Revista(issn, titulo, volume, editora, dataPublicacao);
                    itens.addRevista(revistas);
                    System.out.println("\n Revista Cadastrado com sucesso!\n");
                }
                break;
                case 3: {
                    System.out.println("Digite o nome do Cd: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o nome do artista do Cd: ");
                    String artista = sc.nextLine();
                    System.out.println("Quantas faixas tem o Cd? ");
                    int numFaixas = Integer.parseInt(sc.nextLine());
                    String[] faixas = new String[numFaixas];
                    System.out.println("Digite o nome das faixas do Cd: ");
                    for (int i = 0; i < numFaixas; i++) {
                        String faixa = sc.nextLine();
                        faixas[i] = faixa;

                    }

                    Cd cds = new Cd(titulo, artista, faixas);
                    itens.addCd(cds);
                    System.out.println("\nCd Cadastrado com sucesso!\n");
                }
                break;
                case 4: {
                    System.out.println("Digite o nome do Dvd: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o nome do diretor: ");
                    String diretor = sc.nextLine();
                    System.out.println("Digite a duracao do Dvd(em minutos): ");
                    int duracao = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite a classificacao indicativa do Dvd: ");
                    String classificacaoIndicativa = sc.nextLine();

                    Dvd dvds = new Dvd(titulo, diretor, duracao, classificacaoIndicativa);
                    itens.addDvd(dvds);
                    System.out.println("\nDvd Cadastrado com sucesso!\n");
                }
                break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private static void gerenciarUsuarios(Scanner sc, GerenciadorDeUsuario usuarios) {
        int resp = 1;
        while (resp != 0) {
            System.out.println("""
                Qual tipo de usuário você gostaria de adcionar? 
                [1] Aluno
                [2] Professor
                [3] Pos Graduado
                [4] Funcionário Administrativo
                [0] Voltar
            """);
            resp = Integer.parseInt(sc.nextLine());
            switch (resp) {
                case 1: {
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula do aluno: ");
                    String matricula = sc.nextLine();
                    System.out.println("Digite o curso do aluno: ");
                    String curso = sc.nextLine();

                    Aluno alunos = new Aluno(nome, matricula, curso);
                    usuarios.addAluno(alunos);
                    System.out.println("\n Aluno Cadastrado com sucesso!\n");
                }
                break;
                case 2: {
                    System.out.println("Digite o nome do professor: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula do professor: ");
                    String matricula = sc.nextLine();

                    Professor professores = new Professor(nome, matricula);
                    usuarios.addProfessor(professores);
                    System.out.println("\n Professor Cadastrado com sucesso!\n");
                }
                break;
                case 3: {
                    System.out.println("Digite o nome do pós graduado: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula do pós graduado: ");
                    String matricula = sc.nextLine();

                    PosGraduado posGraduados = new PosGraduado(nome, matricula);
                    usuarios.addPosGraduado(posGraduados);
                    System.out.println("\n pós graduado Cadastrado com sucesso!\n");
                }
                break;
                case 4: {
                    System.out.println("Digite o nome do Funcionário Administrativo: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula do Funcionário Administrativo: ");
                    String matricula = sc.nextLine();

                    FuncionarioAdministrativo funcionarios = new FuncionarioAdministrativo(nome, matricula);
                    usuarios.addFuncionarioAdministrativo(funcionarios);
                    System.out.println("\n Funcionário Administrativo Cadastrado com sucesso!\n");
                }
                break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

    }
}
