package br.edu.ifpb.poo.aplicacao;
import java.util.Scanner;

import br.edu.ifpb.poo.modelo.Aluno;
import br.edu.ifpb.poo.servico.GerenciadorDeUsuario;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta = 1;
        GerenciadorDeUsuario usuarios1 = new GerenciadorDeUsuario();
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
             switch (resposta){
                case 1 -> System.out.println("Sem itens para gerenciar");
                case 2 -> {
                    System.out.println("Digite o nome do aluno: ");
                    String nome = sc.nextLine();
                    System.out.println("Digite a matricula do aluno: ");
                    int matricula = Integer.parseInt(sc.nextLine());
                    System.out.println("Digite o curso do aluno: ");
                    String curso = sc.nextLine();
                    
                    Aluno aluno1 = new Aluno(nome, matricula, curso);
                    usuarios1.addAluno(aluno1);
                    System.out.println("\n Aluno Cadastrado com sucesso!");
                }
                case 3 -> System.out.println("Sem operações disponíveis");
                case 4 -> {
                    System.out.println("Alunos cadastrados: ");
                    usuarios1.listarAlunos();
                }
                case 0 -> System.out.println("Você saiu.");
                default -> System.out.println("Opção inválida");
             }
        }
        sc.close();
    }
}