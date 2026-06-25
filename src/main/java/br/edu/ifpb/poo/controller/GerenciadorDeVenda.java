package br.edu.ifpb.poo.controller;
import java.time.LocalDate;
import java.util.ArrayList;

import br.edu.ifpb.poo.model.JogoTabuleiro;
import br.edu.ifpb.poo.model.Usuario;
import br.edu.ifpb.poo.model.Venda;

public class GerenciadorDeVenda {
 private ArrayList<Venda> listaVendas;


    public GerenciadorDeVenda() {
        this.listaVendas = new ArrayList<>();
    }

     public void addEmprestimo(Venda venda){
        this.listaVendas.add(venda);
    }

     public void listaVendas(){
        for(Venda venda : this.listaVendas){
            System.out.println("-----------------");
            System.out.println(venda.toString());
        }
    }

    public void listarVendasPorItem(String titulo){
        for(Venda venda : this.listaVendas){
            if (venda.getnomeJogo().equals(titulo)) {
                System.out.println("-----------------");
                System.out.println(venda.toString());
            }
        }
    }


    public void venderJogoParaUsuario(Usuario usuario, JogoTabuleiro jogoTabuleiro){
            LocalDate hoje = LocalDate.now();
            String nomeJogo = jogoTabuleiro.getNome();
            String nomeUsuario = usuario.getNome();
            String matricula = usuario.getMatricula();
            String preco = jogoTabuleiro.getPreco();
            Venda venda = new Venda(usuario, jogoTabuleiro, nomeUsuario, matricula, nomeJogo, hoje, preco);
            jogoTabuleiro.setQuantidade(jogoTabuleiro.getQuantidade()-1);
            listaVendas.add(venda);
            System.out.println("Venda do jogo de Tabuleiro " + jogoTabuleiro.getNome() +" realizado com sucesso para usuario " + usuario.getNome() + " de matricula " + usuario.getMatricula());
    }

}

