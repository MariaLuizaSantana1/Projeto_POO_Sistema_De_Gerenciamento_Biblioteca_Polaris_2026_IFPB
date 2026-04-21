package br.edu.ifpb.poo.aplicacao;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta = 1;
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
             switch (resposta){
                case 1 -> System.out.println("Sem itens para gerenciar");
                case 2 -> System.out.println("Sem usuários cadastrados");
                case 3 -> System.out.println("Sem operações disponíveis");
                case 4 -> System.out.println("Sem consultas disponíveis");
                case 0 -> System.out.println("Você saiu.");
                default -> System.out.println("Opção inválida");
             }
        }
        sc.close();
    }
}