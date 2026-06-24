package br.edu.ifpb.poo.controller;

import java.util.Scanner;

import br.edu.ifpb.poo.ui.TelaPrincipalUI;

public class GerenciadorDeInterface {
    private int resposta = 1;
    TelaPrincipalUI ui = new TelaPrincipalUI();
    Scanner sc = new Scanner(System.in);
    
    GerenciadorDeUsuario usuarios = new GerenciadorDeUsuario();
    GerenciadorDeItens itens = new GerenciadorDeItens();
    GerenciadorEmprestimos emprestimos = new GerenciadorEmprestimos();

    public void gerenciadorDeInterface(){
    while (resposta != 0) {
        ui.iniciarMenuPrincipal();
        switch (resposta) {
            case 1:
                ui.gerenciarItensAcervo(sc, itens);
                break;
            case 2:
                ui.gerenciarUsuarios(sc, usuarios);
                break;
            case 3:
                ui.realizarEmprestimos(sc, usuarios, itens, emprestimos);
                break;
            case 4:
                ui.realizarDevolucao(sc, emprestimos);
                break;
            case 5:
                ui.consultar(sc, usuarios, itens, emprestimos);
                break;
            case 0:
                System.out.println("Você saiu.");
                break;
            default:
                System.out.println("Opção inválida");
        }}
    }
}
