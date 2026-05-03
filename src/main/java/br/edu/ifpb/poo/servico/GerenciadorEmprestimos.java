package br.edu.ifpb.poo.servico;

import java.time.LocalDate;
import java.util.ArrayList;

import br.edu.ifpb.poo.modelo.Aluno;
import br.edu.ifpb.poo.modelo.Emprestimo;
import br.edu.ifpb.poo.modelo.Livro;

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

    public void emprestarParaAluno(Aluno aluno, Livro livro){
        if(aluno.getItensEmprestados() == 3){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(aluno.getNome(), livro.getIsbn(), hoje, devolucao);
            aluno.setItensEmprestados(+1);
            listaEmprestimos.add(emprestimo);

        }
        else{
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        
    }

    public void emprestarParaProfessor(){
        
    }

    public void emprestarParaPosGraduado(){
        
    }

    public void emprestarParaFuncionario(){
        
    }
}
