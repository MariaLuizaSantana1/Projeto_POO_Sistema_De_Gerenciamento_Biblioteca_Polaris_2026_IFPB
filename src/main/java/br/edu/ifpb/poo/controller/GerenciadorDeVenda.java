package br.edu.ifpb.poo.controller;
import java.util.ArrayList;

import br.edu.ifpb.poo.model.Venda;

public class GerenciadorDeVenda {
 private ArrayList<Venda> listaVendas;


    public GerenciadorDeVenda() {
        this.listaVendas = new ArrayList<>();
    }

     public void addEmprestimo(Venda emprestimo){
        this.listaVendas.add(emprestimo);
    }

     public void listaVendas(){
        for(Venda emprestimo : this.listaVendas){
            System.out.println("-----------------");
            System.out.println(emprestimo.toString());
        }
    }

    public void listarVendasPorItem(String titulo){
        for(Venda emprestimo : this.listaVendas){
            if (emprestimo.getnomeJogo().equals(titulo)) {
                System.out.println("-----------------");
                System.out.println(emprestimo.toString());
            }
        }
    }
}

