package br.edu.ifpb.poo.aplicacao;

import java.util.Scanner;

import br.edu.ifpb.poo.modelo.Aluno;
import br.edu.ifpb.poo.modelo.FuncionarioAdministrativo;
import br.edu.ifpb.poo.modelo.PosGraduado;
import br.edu.ifpb.poo.modelo.Professor;
import br.edu.ifpb.poo.servico.GerenciadorDeItens;
import br.edu.ifpb.poo.servico.GerenciadorDeUsuario;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta = 1;
        GerenciadorDeUsuario usuarios = new GerenciadorDeUsuario();
        GerenciadorDeItens itens = new GerenciadorDeItens();
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
                    gerenciarItensAcervo();
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
        System.out.println("""
            O que você gostaria de consultar? 
            [1] Usuários
            [2] Itens do Acervo
            [0] Voltar
        """);
        int respconsult = Integer.parseInt(sc.nextLine());
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

    private static void realizarEmprestimos() {
        System.out.println("Sem operações disponíveis");
    }

    private static void gerenciarItensAcervo() {
        System.out.println("Sem itens para gerenciar");

    }

    private static void gerenciarUsuarios(Scanner sc, GerenciadorDeUsuario usuarios) {
    
        System.out.println("""
            Qual tipo de usuário você gostaria de adcionar? 
            [1] Aluno
            [2] Professor
            [3] Pos Graduado
            [4] Funcionário Administrativo
            [0] Voltar
        """);
        int resp = Integer.parseInt(sc.nextLine());
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
                System.out.println("\n Aluno Cadastrado com sucesso!");
            }
            break;
            case 2: {
                System.out.println("Digite o nome do professor: ");
                String nome = sc.nextLine();
                System.out.println("Digite a matricula do professor: ");
                String matricula = sc.nextLine();

                Professor professores = new Professor(nome, matricula);
                usuarios.addProfessor(professores);
                System.out.println("\n Professor Cadastrado com sucesso!");
            }
            break;
            case 3:
                {
                    System.out.println("Digite o nome do pós graduado: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula do pós graduado: ");
                    String matricula = sc.nextLine();
    
                    PosGraduado posGraduados = new PosGraduado(nome, matricula);
                    usuarios.addPosGraduado(posGraduados);
                    System.out.println("\n pós graduado Cadastrado com sucesso!");
                }
                break;
            case 4:
                {
                    System.out.println("Digite o nome do Funcionário Administrativo: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula do Funcionário Administrativo: ");
                    String matricula = sc.nextLine();
    
                    FuncionarioAdministrativo funcionarios = new FuncionarioAdministrativo(nome, matricula);
                    usuarios.addFuncionarioAdministrativo(funcionarios);
                    System.out.println("\n Funcionário Administrativo Cadastrado com sucesso!");
                }
                break;
            case 0:
                break;
            default:
                System.out.println("Opção inválida");
        }

    }
}
