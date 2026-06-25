package br.edu.ifpb.poo.controller;


import br.edu.ifpb.poo.ui.TelaPrincipalUI;

public class GerenciadorDeInterface {
    private static final int RESPOSTA_MENU = 1;
    TelaPrincipalUI telaUi = new TelaPrincipalUI();
    
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
            telaUi.limpeTela();
            resposta = telaUi.iniciarMenuPrincipal();
            menuSecundario(resposta);
            break;
        }
        while(resposta != RESPOSTA_MENU);
    }


    public void menuSecundario(int resposta){
        switch (resposta) {
            case 1 :{
                int resposta2 = RESPOSTA_MENU;
               do{
                 resposta2 = telaUi.iniciarMenuGereciarItem();
                 gerenciadorItens(resposta2);
               }
               while(resposta2 != RESPOSTA_MENU);
            }
            case 2: {
                int resposta2 = RESPOSTA_MENU;
               do{
                 resposta2 = telaUi.iniciarMenuGerenciadorUsuarios();
                 menuSecundario(resposta2);
               }
               while(resposta2 != RESPOSTA_MENU);
            }
            case 3: {
                int resposta2 = RESPOSTA_MENU;
               do{
                 telaUi.iniciarMenuRealizarEmprestimo();
                 gerenciadorEmprestimo(resposta2);
               }
               while(resposta2 != RESPOSTA_MENU);
                }
            case 4: { 
                telaUi.realizarDevolucao(emprestimos);}
            case 5: { 
                 telaUi.iniciarMenuConsultar();
                 gerenciadorConsultar();
            }
            case 0: { 
                System.out.println("Você saiu.");
                break;
            }
            default :{ 
                System.out.println("Opção inválida");
            }
        }
    }

    public void gerenciadorItens(int resposta2){
        telaUi.gerenciarItensAcervo(itens);
    }

    public void gerenciadorEmprestimo(int resposta2){
        telaUi.realizarEmprestimos(usuarios, itens, emprestimos);
    }

    public void gerenciadorConsultar(){
        telaUi.consultar(usuarios, itens, emprestimos);
        execute();
    }
}
