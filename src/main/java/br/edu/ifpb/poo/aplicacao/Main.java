package br.edu.ifpb.poo.aplicacao;

import java.util.Scanner;

import br.edu.ifpb.poo.modelo.Aluno;
import br.edu.ifpb.poo.servico.GerenciadorDeUsuario;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta = 1;
        GerenciadorDeUsuario usuarios = new GerenciadorDeUsuario();
        while (resposta != 0) {
            System.out.println("""

                _____________Biblioteca Polaris____________
                [1] Gerenciar Itens do Acervo
                [2] Gerenciar Usuários
                [3] Operações
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
                    listarOperacoes();
                    break;
                case 4:
                    consultar(usuarios);
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



    
    private static void consultar(GerenciadorDeUsuario usuarios) {
            System.out.println("Alunos cadastrados: ");
            usuarios.listarAlunos();
    }

    private static void listarOperacoes() {
        System.out.println("Sem operações disponíveis");
    }

    private static void gerenciarItensAcervo() {
        System.out.println("Sem itens para gerenciar");

    }

    private static void gerenciarUsuarios(Scanner sc, GerenciadorDeUsuario usuarios) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Digite a matricula do aluno: ");
            int matricula = Integer.parseInt(sc.nextLine());
            System.out.println("Digite o curso do aluno: ");
            String curso = sc.nextLine();

            Aluno aluno1 = new Aluno(nome, matricula, curso);
            usuarios.addAluno(aluno1);
            System.out.println("\n Aluno Cadastrado com sucesso!");
    }
}


