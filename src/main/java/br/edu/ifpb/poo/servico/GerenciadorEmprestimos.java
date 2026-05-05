package br.edu.ifpb.poo.servico;

import java.time.LocalDate;
import java.util.ArrayList;

import br.edu.ifpb.poo.modelo.Aluno;
import br.edu.ifpb.poo.modelo.Professor;
import br.edu.ifpb.poo.modelo.PosGraduado;
import br.edu.ifpb.poo.modelo.FuncionarioAdministrativo;
import br.edu.ifpb.poo.modelo.Emprestimo;
import br.edu.ifpb.poo.modelo.Livro;
import br.edu.ifpb.poo.modelo.PosGraduado;

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

    public void emprestarLivroParaAluno(Aluno aluno, Livro livro){
        if(aluno.getItensEmprestados() < 3 && aluno.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(aluno.getNome(), livro.getIsbn(), hoje, devolucao);
            aluno.setItensEmprestados(+1);
            listaEmprestimos.add(emprestimo);
        }
        else if(aluno.getItensEmprestados() == 3 && aluno.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        else{
            System.out.println("Aluno de matricula " + aluno.getMatricula() + " Não está ativo no sistema");
        }
        
    }

    public void emprestarLivroParaProfessor(Professor professor, Livro livro){
        if(professor.getItensEmprestados() < 5 && professor.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(14);
            Emprestimo emprestimo = new Emprestimo(professor.getNome(), livro.getIsbn(), hoje, devolucao);
            professor.setItensEmprestados(+1);
            listaEmprestimos.add(emprestimo);
        }
        else if(professor.getItensEmprestados() == 5 && professor.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + professor.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
        else{
            System.out.println("Usuário de matricula " + professor.getMatricula() + " Não está ativo no sistema");
        }
    }

    public void emprestarLivroParaPosGraduado(PosGraduado posGraduado, Livro livro){
        if(posGraduado.getItensEmprestados() < 5 && posGraduado.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(14);
            Emprestimo emprestimo = new Emprestimo(posGraduado.getNome(), livro.getIsbn(), hoje, devolucao);
            posGraduado.setItensEmprestados(+1);
            listaEmprestimos.add(emprestimo);
        }
        else if(posGraduado.getItensEmprestados() == 5 && posGraduado.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
        else{
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + " Não está ativo no sistema");
        }
    }

    public void emprestarLivroParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Livro livro){
        if(funcionarioAdministrativo.getItensEmprestados() < 2 && funcionarioAdministrativo.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(10);
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo.getNome(), livro.getIsbn(), hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(+1);
            listaEmprestimos.add(emprestimo);
        }
        else if(funcionarioAdministrativo.getItensEmprestados() == 2 && funcionarioAdministrativo.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + " já atingiu o limite máximo de 2 itens");
        }
        else{
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + " Não está ativo no sistema");
        }
    }
}
