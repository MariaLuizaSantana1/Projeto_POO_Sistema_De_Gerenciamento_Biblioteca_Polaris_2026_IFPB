package br.edu.ifpb.poo;
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
        }
    }
}