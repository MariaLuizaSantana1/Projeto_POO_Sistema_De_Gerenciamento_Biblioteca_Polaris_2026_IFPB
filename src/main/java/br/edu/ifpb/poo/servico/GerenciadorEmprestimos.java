package br.edu.ifpb.poo.servico;

import java.util.ArrayList;

import br.edu.ifpb.poo.modelo.Emprestimo;

public class GerenciadorEmprestimos {
    private ArrayList<Emprestimo> listaEmprestimos;


    public GerenciadorEmprestimos() {
        this.listaEmprestimos = new ArrayList<>();
    }

     public void addEmprestimo(Emprestimo emprestimo){
        this.listaEmprestimos.add(emprestimo);
    }

     public void listaEmprestimos(){
        for(Emprestimo emprestimo : this.listaEmprestimos){
            System.out.println("-----------------");
            System.out.println(emprestimo.toString());
        }
    }
}
