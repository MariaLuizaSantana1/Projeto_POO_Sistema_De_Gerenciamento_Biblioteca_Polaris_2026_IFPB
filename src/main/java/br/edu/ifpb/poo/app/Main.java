package br.edu.ifpb.poo.app;

import br.edu.ifpb.poo.controller.GerenciadorDeInterface;
import br.edu.ifpb.poo.ui.TelaPrincipalUI;


public class Main {

    public static void main(String[] args) {
        TelaPrincipalUI ui = new TelaPrincipalUI();
        GerenciadorDeInterface controlador = new GerenciadorDeInterface(ui);
        controlador.inicializadorDeDadosPadrao();
        controlador.execute();
    }
    
}
