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
        if(aluno.getItensEmprestados() < 3 && aluno.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(aluno, livro, hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados()+1);
            livro.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
        }
        else if(aluno.getItensEmprestados() == 3 && aluno.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }
        else{
            System.out.println("Aluno de matricula " + aluno.getMatricula() + " Não está ativo no sistema");
        }   
    }

    public void emprestarRevistaParaAluno(Aluno aluno, Revista revista){
        if(aluno.getItensEmprestados() < 3 && aluno.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(aluno.getNome(), revista.getTitulo(), hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }
        else if(aluno.getItensEmprestados() == 3 && aluno.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }
        else{
            System.out.println("Aluno de matricula " + aluno.getMatricula() + " Não está ativo no sistema");
        }        
    }

    public void emprestarCdParaAluno(Aluno aluno, Cd cd){
        if(!aluno.getAtivo().equals("ativo")){
            System.out.println("Aluno de matricula " + aluno.getMatricula() + " Não está ativo no sistema");
        }
        else if(aluno.getItensEmprestados() >= 3 && aluno.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }
        else{
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(aluno.getNome(), cd.getTitulo(), hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }       
    }

    public void emprestarDvdParaAluno(Aluno aluno, Dvd dvd){
        if(aluno.getItensEmprestados() < 3 && aluno.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(aluno.getNome(), dvd.getTitulo(), hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }
        else if(aluno.getItensEmprestados() == 3 && aluno.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }
        else{
            System.out.println("Aluno de matricula " + aluno.getMatricula() + " Não está ativo no sistema");
        }       
    }


    public void emprestarLivroParaProfessor(Professor professor, Livro livro){
        if(professor.getItensEmprestados() < 5 && professor.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(14);
            Emprestimo emprestimo = new Emprestimo(professor.getNome(), livro.getTitulo(), hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados()+1);
            listaEmprestimos.add(emprestimo);
        }
        else if(professor.getItensEmprestados() == 5 && professor.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + professor.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
        else{
            System.out.println("Usuário de matricula " + professor.getMatricula() + " Não está ativo no sistema");
        }
    }


    public void emprestarRevistaParaProfessor(Professor professor, Revista revista){
        if(professor.getItensEmprestados() < 5 && professor.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(professor.getNome(), revista.getTitulo(), hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }
        else if(professor.getItensEmprestados() == 5 && professor.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + professor.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        else{
            System.out.println("Professor de matricula " + professor.getMatricula() + " Não está ativo no sistema");
        }        
    }

    public void emprestarCdParaProfessor(Professor professor, Cd cd){
        if(!professor.getAtivo().equals("ativo")){
            System.out.println("Professor de matricula " + professor.getMatricula() + " Não está ativo no sistema");
        }
        else if(professor.getItensEmprestados() >= 5 && professor.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + professor.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        else{
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(professor.getNome(), cd.getTitulo(), hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }       
    }

    public void emprestarDvdParaProfessor(Professor professor, Dvd dvd){
        if(professor.getItensEmprestados() < 5 && professor.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(professor.getNome(), dvd.getTitulo(), hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }
        else if(professor.getItensEmprestados() == 5 && professor.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + professor.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        else{
            System.out.println("Aluno de matricula " + professor.getMatricula() + " Não está ativo no sistema");
        }       
    }




    public void emprestarLivroParaPosGraduado(PosGraduado posGraduado, Livro livro){
        if(posGraduado.getItensEmprestados() < 5 && posGraduado.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(14);
            Emprestimo emprestimo = new Emprestimo(posGraduado.getNome(), livro.getTitulo(), hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados()+1);
            listaEmprestimos.add(emprestimo);
        }
        else if(posGraduado.getItensEmprestados() == 5 && posGraduado.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
        else{
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + " Não está ativo no sistema");
        }
    }

    public void emprestarRevistaParaPosGraduado(PosGraduado posGraduado, Revista revista){
        if(posGraduado.getItensEmprestados() < 5 && posGraduado.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(posGraduado.getNome(), revista.getTitulo(), hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }
        else if(posGraduado.getItensEmprestados() == 5 && posGraduado.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        else{
            System.out.println("PosGraduado de matricula " + posGraduado.getMatricula() + " Não está ativo no sistema");
        }        
    }

    public void emprestarCdParaPosGraduado(PosGraduado posGraduado, Cd cd){
        if(!posGraduado.getAtivo().equals("ativo")){
            System.out.println("PosGraduado de matricula " + posGraduado.getMatricula() + " Não está ativo no sistema");
        }
        else if(posGraduado.getItensEmprestados() >= 5 && posGraduado.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        else{
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(posGraduado.getNome(), cd.getTitulo(), hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }       
    }

    public void emprestarDvdParaPosGraduado(PosGraduado posGraduado, Dvd dvd){
        if(posGraduado.getItensEmprestados() < 5 && posGraduado.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(posGraduado.getNome(), dvd.getTitulo(), hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }
        else if(posGraduado.getItensEmprestados() == 5 && posGraduado.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
        else{
            System.out.print("PosGraduado de matricula " + posGraduado.getMatricula() + " Não está ativo no sistema");
        }       
    }



    public void emprestarLivroParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Livro livro){
        if(funcionarioAdministrativo.getItensEmprestados() < 2 && funcionarioAdministrativo.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(10);
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo.getNome(), livro.getTitulo(), hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados()+1);
            listaEmprestimos.add(emprestimo);
        }
        else if(funcionarioAdministrativo.getItensEmprestados() == 2 && funcionarioAdministrativo.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + " já atingiu o limite máximo de 2 itens");
        }
        else{
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + " Não está ativo no sistema");
        }
    }

    public void emprestarRevistaParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Revista revista){
        if(funcionarioAdministrativo.getItensEmprestados() < 2 && funcionarioAdministrativo.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo.getNome(), revista.getTitulo(), hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }
        else if(funcionarioAdministrativo.getItensEmprestados() == 2 && funcionarioAdministrativo.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + "já atingiu o limite máximo de 2 itens");
        }
        else{
            System.out.println("Funcionario de matricula " + funcionarioAdministrativo.getMatricula() + " Não está ativo no sistema");
        }        
    }

    public void emprestarCdParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Cd cd){
        if(!funcionarioAdministrativo.getAtivo().equals("ativo")){
            System.out.println("Funcionario de matricula " + funcionarioAdministrativo.getMatricula() + " Não está ativo no sistema");
        }
        else if(funcionarioAdministrativo.getItensEmprestados() >= 2 && funcionarioAdministrativo.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + "já atingiu o limite máximo de 2 itens");
        }
        else{
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo.getNome(), cd.getTitulo(), hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }       
    }

    public void emprestarDvdParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Dvd dvd){
        if(funcionarioAdministrativo.getItensEmprestados() < 2 && funcionarioAdministrativo.getAtivo().equals("ativo")){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(7);
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo.getNome(), dvd.getTitulo(), hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() +1);
            listaEmprestimos.add(emprestimo);
        }
        else if(funcionarioAdministrativo.getItensEmprestados() == 2 && funcionarioAdministrativo.getAtivo().equals("ativo")){
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + "já atingiu o limite máximo de 2 itens");
        }
        else{
            System.out.println("Aluno de matricula " + funcionarioAdministrativo.getMatricula() + " Não está ativo no sistema");
        }       
    }



    public void registrarDevolução(String tituloItem){
        for(Emprestimo emprestimo : this.listaEmprestimos){
            if (emprestimo.getItem().equals(tituloItem)) {
                
            }
        }
    }

}
