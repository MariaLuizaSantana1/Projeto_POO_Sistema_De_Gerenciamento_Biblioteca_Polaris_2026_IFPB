package br.edu.ifpb.poo.servico;

import java.time.LocalDate;
import java.util.ArrayList;

import br.edu.ifpb.poo.modelo.Aluno;
import br.edu.ifpb.poo.modelo.Cd;
import br.edu.ifpb.poo.modelo.Dvd;
import br.edu.ifpb.poo.modelo.Emprestimo;
import br.edu.ifpb.poo.modelo.FuncionarioAdministrativo;
import br.edu.ifpb.poo.modelo.Livro;
import br.edu.ifpb.poo.modelo.PosGraduado;
import br.edu.ifpb.poo.modelo.Professor;
import br.edu.ifpb.poo.modelo.Revista;


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
        if(aluno.getItensEmprestados() < Aluno.MAX_ITENS_ALUNO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Aluno.PRAZO_ITENS_ALUNO);
            Emprestimo emprestimo = new Emprestimo(aluno, livro, hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados()+1);
            livro.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do livro " + livro.getTitulo() +" realizado com sucesso para aluno " + aluno.getNome() + " de matricula " + aluno.getMatricula());
        } else{
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }   
    }

    public void emprestarRevistaParaAluno(Aluno aluno, Revista revista){
        if(aluno.getItensEmprestados() < Aluno.MAX_ITENS_ALUNO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Aluno.PRAZO_ITENS_ALUNO);
            Emprestimo emprestimo = new Emprestimo(aluno, revista, hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados() +1);
            revista.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else{
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }        
    }

    public void emprestarCdParaAluno(Aluno aluno, Cd cd){
        if(aluno.getItensEmprestados() >= Aluno.MAX_ITENS_ALUNO){
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }
        else{
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Aluno.PRAZO_ITENS_ALUNO);
            Emprestimo emprestimo = new Emprestimo(aluno, cd, hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados() +1);
            cd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }       
    }

    public void emprestarDvdParaAluno(Aluno aluno, Dvd dvd){
        if(aluno.getItensEmprestados() < Aluno.MAX_ITENS_ALUNO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Aluno.PRAZO_ITENS_ALUNO);
            Emprestimo emprestimo = new Emprestimo(aluno, dvd, hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados() +1);
            dvd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else{
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }      
    }


    public void emprestarLivroParaProfessor(Professor professor, Livro livro){
        if(professor.getItensEmprestados() < Professor.MAX_ITENS_PROFESSOR ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Professor.PRAZO_LIVROS_PROFESSOR);
            Emprestimo emprestimo = new Emprestimo(professor, livro, hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados()+1);
            livro.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else{
            System.out.println("Usuário de matricula " + professor.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
    }


    public void emprestarRevistaParaProfessor(Professor professor, Revista revista){
        if(professor.getItensEmprestados() < Professor.MAX_ITENS_PROFESSOR ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Professor.PRAZO_OUTRAS_MIDIAS_PROFESSOR);
            Emprestimo emprestimo = new Emprestimo(professor, revista, hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados() +1);
            revista.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else {
            System.out.println("Usuário de matricula " + professor.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }       
    }

    public void emprestarCdParaProfessor(Professor professor, Cd cd){
        if(professor.getItensEmprestados() >= Professor.MAX_ITENS_PROFESSOR){
            System.out.println("Usuário de matricula " + professor.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        else{
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Professor.PRAZO_OUTRAS_MIDIAS_PROFESSOR);
            Emprestimo emprestimo = new Emprestimo(professor, cd, hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados() +1);
            cd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }       
    }

    public void emprestarDvdParaProfessor(Professor professor, Dvd dvd){
        if(professor.getItensEmprestados() < Professor.MAX_ITENS_PROFESSOR ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Professor.PRAZO_OUTRAS_MIDIAS_PROFESSOR);
            Emprestimo emprestimo = new Emprestimo(professor, dvd, hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados() +1);
            dvd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else {
            System.out.println("Usuário de matricula " + professor.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }       
    }




    public void emprestarLivroParaPosGraduado(PosGraduado posGraduado, Livro livro){
        if(posGraduado.getItensEmprestados() < PosGraduado.MAX_ITENS_POS_GRADUADO ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(PosGraduado.PRAZO_LIVROS_POS_GRADUADO);
            Emprestimo emprestimo = new Emprestimo(posGraduado, livro, hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados()+1);
            livro.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else{
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
    }

    public void emprestarRevistaParaPosGraduado(PosGraduado posGraduado, Revista revista){
        if(posGraduado.getItensEmprestados() < PosGraduado.MAX_ITENS_POS_GRADUADO ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(PosGraduado.PRAZO_OUTRAS_MIDIAS_POS_GRADUADO);
            Emprestimo emprestimo = new Emprestimo(posGraduado, revista, hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() +1);
            revista.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else {
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }        
    }

    public void emprestarCdParaPosGraduado(PosGraduado posGraduado, Cd cd){
        if(posGraduado.getItensEmprestados() >= PosGraduado.MAX_ITENS_POS_GRADUADO ){
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        else{
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(PosGraduado.PRAZO_OUTRAS_MIDIAS_POS_GRADUADO);
            Emprestimo emprestimo = new Emprestimo(posGraduado, cd, hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() +1);
            cd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }       
    }

    public void emprestarDvdParaPosGraduado(PosGraduado posGraduado, Dvd dvd){
        if(posGraduado.getItensEmprestados() < PosGraduado.MAX_ITENS_POS_GRADUADO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(PosGraduado.PRAZO_OUTRAS_MIDIAS_POS_GRADUADO);
            Emprestimo emprestimo = new Emprestimo(posGraduado, dvd, hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() +1);
            dvd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else {
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
      
    }




    public void emprestarLivroParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Livro livro){
        if(funcionarioAdministrativo.getItensEmprestados() < FuncionarioAdministrativo.MAX_ITENS_FUNCIONARIO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(FuncionarioAdministrativo.PRAZO_ITENS_FUNCIONARIO);
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo, livro, hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados()+1);
            livro.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else {
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + " já atingiu o limite máximo de 2 itens");
        }
    }

    public void emprestarRevistaParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Revista revista){
        if(funcionarioAdministrativo.getItensEmprestados() < FuncionarioAdministrativo.MAX_ITENS_FUNCIONARIO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(FuncionarioAdministrativo.PRAZO_ITENS_FUNCIONARIO);
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo.getNome(), revista, hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() +1);
            revista.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else {
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + "já atingiu o limite máximo de 2 itens");
        }        
    }

    public void emprestarCdParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Cd cd){
        if(funcionarioAdministrativo.getItensEmprestados() >= FuncionarioAdministrativo.MAX_ITENS_FUNCIONARIO){
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + "já atingiu o limite máximo de 2 itens");
        }
        else{
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(FuncionarioAdministrativo.PRAZO_ITENS_FUNCIONARIO);
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo, cd, hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() +1);
            cd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }       
    }

    public void emprestarDvdParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Dvd dvd){
        if(funcionarioAdministrativo.getItensEmprestados() < FuncionarioAdministrativo.MAX_ITENS_FUNCIONARIO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(FuncionarioAdministrativo.PRAZO_ITENS_FUNCIONARIO);
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo, dvd, hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() +1);
            dvd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else {
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + "já atingiu o limite máximo de 2 itens");
        }      
    }



    public void registrarDevolução(String tituloItem){
        for(Emprestimo emprestimo : this.listaEmprestimos){
            Object item = emprestimo.getItem();
            if (item instanceof Livro livro) {
                if (livro.getTitulo().equals(tituloItem)) {
                   livro.setDisponibilidade("Disponivel");
                   emprestimo.setStatusEmprestimo("Devolvido");
                }
            }else if (item instanceof Revista revista) {
                if (revista.getTitulo().equals(tituloItem)) {
                    revista.setDisponibilidade("Disponivel");
                    emprestimo.setStatusEmprestimo("Devolvido");
                 }
            }else if (item instanceof Cd cd) {
                if (cd.getTitulo().equals(tituloItem)) {
                    cd.setDisponibilidade("Disponivel");
                    emprestimo.setStatusEmprestimo("Devolvido");
                 }
            }else if (item instanceof Dvd dvd) {
                if (dvd.getTitulo().equals(tituloItem)) {
                    dvd.setDisponibilidade("Disponivel");
                    emprestimo.setStatusEmprestimo("Devolvido");
                 }
            }else{
                System.out.println("Empréstimo não encontrado");
            }
        }
    }

}
