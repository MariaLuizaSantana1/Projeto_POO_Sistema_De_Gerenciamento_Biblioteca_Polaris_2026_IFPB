package br.edu.ifpb.poo.controller;

import java.util.Scanner;

import br.edu.ifpb.poo.ui.TelaPrincipalUI;

public class GerenciadorDeInterface {
    private static final int RESPOSTA_MENU = 1;
    TelaPrincipalUI telaUi = new TelaPrincipalUI();
    Scanner sc = new Scanner(System.in);
    
    GerenciadorDeUsuario usuarios = new GerenciadorDeUsuario();
    GerenciadorDeItens itens = new GerenciadorDeItens();
    GerenciadorEmprestimos emprestimos = new GerenciadorEmprestimos();

    

    public static int getRespostaMenu() {
            return RESPOSTA_MENU;
        }

    public GerenciadorDeInterface(TelaPrincipalUI ui) {
        telaUi = ui;
    }

    public void execute(){
        int resposta = RESPOSTA_MENU;
        do{
            resposta = telaUi.iniciarMenuPrincipal();
            gerenciadorDeInterface(resposta);
        }
        while(resposta != RESPOSTA_MENU);
    }


    public void gerenciadorDeInterface(int resposta){
        switch (resposta) {
            case 1 -> telaUi.iniciarMenuGereciarItem();
            case 2 -> telaUi.iniciarMenuGerenciadorUsuarios();
            case 3 -> telaUi.iniciarMenuRealizarEmprestimo();
            case 4 -> telaUi.realizarDevolucao(emprestimos);
            case 5 -> telaUi.iniciarMenuConsultar();
            case 0 -> System.out.println("Você saiu.");
            default -> System.out.println("Opção inválida");
        }
    }
}
