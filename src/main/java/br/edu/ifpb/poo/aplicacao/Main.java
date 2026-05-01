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

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta = 1;
        GerenciadorDeUsuario usuarios = new GerenciadorDeUsuario();
        GerenciadorDeItens itens = new GerenciadorDeItens();
        
        Livro livroDefault = new Livro("13768126382", "O Senhor dos Anéis",
         "J.R.R.Tolkien", "Harper Collins", 2020, "Fantasia",
         1100, "Frodo Bolseiro embarca numa missão com seu seus amigos hobbits,\nseu guia Gandalf, elfos, um anão e humanos para levar o Um Anel para a\nMontanha da Perdição e salvar a Terra Média.");
        itens.addLivro(livroDefault);

        Aluno alunoDefault = new Aluno("Anna", "2024137368", "Sistemas");
        usuarios.addAluno(alunoDefault);

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
                    realizarEmprestimos();
                    break;
                case 4:
                    consultar(sc, usuarios, itens);
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

    private static void consultar(Scanner sc, GerenciadorDeUsuario usuarios, GerenciadorDeItens itens) {

        int respconsult = 1;
        while (respconsult != 0) {
            System.out.println("""
               O que você gostaria de consultar? 
               [1] Usuários
               [2] Itens do Acervo
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
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }



    private static void realizarEmprestimos() {
        System.out.println("Sem operações disponíveis");
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
                    for (int i=0; i < numFaixas; i++) {
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
