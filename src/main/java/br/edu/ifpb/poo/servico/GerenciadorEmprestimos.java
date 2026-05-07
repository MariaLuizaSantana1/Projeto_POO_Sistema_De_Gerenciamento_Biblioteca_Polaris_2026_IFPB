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
            String tituloItem = livro.getTitulo();
            String nomeUsuario = aluno.getNome();
            Emprestimo emprestimo = new Emprestimo(aluno, livro, nomeUsuario, tituloItem, hoje, devolucao);
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
            String tituloItem = revista.getTitulo();
            String nomeUsuario = aluno.getNome();
            Emprestimo emprestimo = new Emprestimo(aluno, revista, nomeUsuario, tituloItem, hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados() +1);
            revista.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do revista " + revista.getTitulo() +" realizado com sucesso para aluno " + aluno.getNome() + " de matricula " + aluno.getMatricula());
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
            String tituloItem = cd.getTitulo();
            String nomeUsuario = aluno.getNome();
            Emprestimo emprestimo = new Emprestimo(aluno, cd, nomeUsuario, tituloItem, hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados() +1);
            cd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do cd " + cd.getTitulo() +" realizado com sucesso para aluno " + aluno.getNome() + " de matricula " + aluno.getMatricula());
        }       
    }

    public void emprestarDvdParaAluno(Aluno aluno, Dvd dvd){
        if(aluno.getItensEmprestados() < Aluno.MAX_ITENS_ALUNO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Aluno.PRAZO_ITENS_ALUNO);
            String tituloItem = dvd.getTitulo();
            String nomeUsuario = aluno.getNome();
            Emprestimo emprestimo = new Emprestimo(aluno, dvd, nomeUsuario, tituloItem, hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados() +1);
            dvd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do dvd " + dvd.getTitulo() +" realizado com sucesso para aluno " + aluno.getNome() + " de matricula " + aluno.getMatricula());
        }
        else{
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }      
    }


    public void emprestarLivroParaProfessor(Professor professor, Livro livro){
        if(professor.getItensEmprestados() < Professor.MAX_ITENS_PROFESSOR ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Professor.PRAZO_LIVROS_PROFESSOR);
            String tituloItem = livro.getTitulo();
            String nomeUsuario = professor.getNome();
            Emprestimo emprestimo = new Emprestimo(professor, livro, nomeUsuario, tituloItem, hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados()+1);
            livro.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do livro " + livro.getTitulo() +" realizado com sucesso para aluno " + professor.getNome() + " de matricula " + professor.getMatricula());
        }
        else{
            System.out.println("Usuário de matricula " + professor.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
    }


    public void emprestarRevistaParaProfessor(Professor professor, Revista revista){
        if(professor.getItensEmprestados() < Professor.MAX_ITENS_PROFESSOR ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Professor.PRAZO_OUTRAS_MIDIAS_PROFESSOR);
            String tituloItem = revista.getTitulo();
            String nomeUsuario = professor.getNome();
            Emprestimo emprestimo = new Emprestimo(professor, revista, nomeUsuario, tituloItem, hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados() +1);
            revista.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo da revista " + revista.getTitulo() +" realizado com sucesso para aluno " + professor.getNome() + " de matricula " + professor.getMatricula());
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
            String tituloItem = cd.getTitulo();
            String nomeUsuario = professor.getNome();
            Emprestimo emprestimo = new Emprestimo(professor, cd, nomeUsuario, tituloItem, hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados() +1);
            cd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do cd " + cd.getTitulo() +" realizado com sucesso para aluno " + professor.getNome() + " de matricula " + professor.getMatricula());
        }       
    }

    public void emprestarDvdParaProfessor(Professor professor, Dvd dvd){
        if(professor.getItensEmprestados() < Professor.MAX_ITENS_PROFESSOR ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Professor.PRAZO_OUTRAS_MIDIAS_PROFESSOR);
            String tituloItem = dvd.getTitulo();
            String nomeUsuario = professor.getNome();
            Emprestimo emprestimo = new Emprestimo(professor, dvd, nomeUsuario, tituloItem, hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados() +1);
            dvd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do dvd " + dvd.getTitulo() +" realizado com sucesso para aluno " + professor.getNome() + " de matricula " + professor.getMatricula());
        }
        else {
            System.out.println("Usuário de matricula " + professor.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }       
    }




    public void emprestarLivroParaPosGraduado(PosGraduado posGraduado, Livro livro){
        if(posGraduado.getItensEmprestados() < PosGraduado.MAX_ITENS_POS_GRADUADO ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(PosGraduado.PRAZO_LIVROS_POS_GRADUADO);
            String tituloItem = livro.getTitulo();
            String nomeUsuario = posGraduado.getNome();
            Emprestimo emprestimo = new Emprestimo(posGraduado, livro, nomeUsuario, tituloItem, hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados()+1);
            livro.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do livro " + livro.getTitulo() +" realizado com sucesso para aluno " + posGraduado.getNome() + " de matricula " + posGraduado.getMatricula());
        }
        else{
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
    }

    public void emprestarRevistaParaPosGraduado(PosGraduado posGraduado, Revista revista){
        if(posGraduado.getItensEmprestados() < PosGraduado.MAX_ITENS_POS_GRADUADO ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(PosGraduado.PRAZO_OUTRAS_MIDIAS_POS_GRADUADO);
            String tituloItem = revista.getTitulo();
            String nomeUsuario = posGraduado.getNome();
            Emprestimo emprestimo = new Emprestimo(posGraduado, revista, nomeUsuario, tituloItem, hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() +1);
            revista.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo da revista " + revista.getTitulo() +" realizado com sucesso para aluno " + posGraduado.getNome() + " de matricula " + posGraduado.getMatricula());
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
            String tituloItem = cd.getTitulo();
            String nomeUsuario = posGraduado.getNome();
            Emprestimo emprestimo = new Emprestimo(posGraduado, cd, nomeUsuario, tituloItem, hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() +1);
            cd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do cd " + cd.getTitulo() +" realizado com sucesso para aluno " + posGraduado.getNome() + " de matricula " + posGraduado.getMatricula());
        }       
    }

    public void emprestarDvdParaPosGraduado(PosGraduado posGraduado, Dvd dvd){
        if(posGraduado.getItensEmprestados() < PosGraduado.MAX_ITENS_POS_GRADUADO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(PosGraduado.PRAZO_OUTRAS_MIDIAS_POS_GRADUADO);
            String tituloItem = dvd.getTitulo();
            String nomeUsuario = posGraduado.getNome();
            Emprestimo emprestimo = new Emprestimo(posGraduado, dvd, nomeUsuario, tituloItem, hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() +1);
            dvd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do dvd " + dvd.getTitulo() +" realizado com sucesso para aluno " + posGraduado.getNome() + " de matricula " + posGraduado.getMatricula());
        }
        else {
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + "já atingiu o limite máximo de 5 itens");
        }
      
    }




    public void emprestarLivroParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Livro livro){
        if(funcionarioAdministrativo.getItensEmprestados() < FuncionarioAdministrativo.MAX_ITENS_FUNCIONARIO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(FuncionarioAdministrativo.PRAZO_ITENS_FUNCIONARIO);
            String tituloItem = livro.getTitulo();
            String nomeUsuario = funcionarioAdministrativo.getNome();
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo, livro, nomeUsuario, tituloItem, hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados()+1);
            livro.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do livro " + livro.getTitulo() +" realizado com sucesso para aluno " + funcionarioAdministrativo.getNome() + " de matricula " + funcionarioAdministrativo.getMatricula());
        }
        else {
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + " já atingiu o limite máximo de 2 itens");
        }
    }

    public void emprestarRevistaParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Revista revista){
        if(funcionarioAdministrativo.getItensEmprestados() < FuncionarioAdministrativo.MAX_ITENS_FUNCIONARIO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(FuncionarioAdministrativo.PRAZO_ITENS_FUNCIONARIO);
            String tituloItem = revista.getTitulo();
            String nomeUsuario = funcionarioAdministrativo.getNome();
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo.getNome(), revista, nomeUsuario, tituloItem, hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() +1);
            revista.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo da revista " + revista.getTitulo() +" realizado com sucesso para aluno " + funcionarioAdministrativo.getNome() + " de matricula " + funcionarioAdministrativo.getMatricula());
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
            String tituloItem = cd.getTitulo();
            String nomeUsuario = funcionarioAdministrativo.getNome();
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo, cd, nomeUsuario, tituloItem, hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() +1);
            cd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do cd " + cd.getTitulo() +" realizado com sucesso para aluno " + funcionarioAdministrativo.getNome() + " de matricula " + funcionarioAdministrativo.getMatricula());
        }       
    }

    public void emprestarDvdParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, Dvd dvd){
        if(funcionarioAdministrativo.getItensEmprestados() < FuncionarioAdministrativo.MAX_ITENS_FUNCIONARIO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(FuncionarioAdministrativo.PRAZO_ITENS_FUNCIONARIO);
            String tituloItem = dvd.getTitulo();
            String nomeUsuario = funcionarioAdministrativo.getNome();
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo, dvd, nomeUsuario, tituloItem, hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() +1);
            dvd.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do dvd " + dvd.getTitulo() +" realizado com sucesso para aluno " + funcionarioAdministrativo.getNome() + " de matricula " + funcionarioAdministrativo.getMatricula());
        }
        else {
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + "já atingiu o limite máximo de 2 itens");
        }      
    }

    



    public void registrarDevolução(String tituloItem){
        for(Emprestimo emprestimo : this.listaEmprestimos){
            if (emprestimo.getTituloItem().equals(tituloItem)) {
                Object item = emprestimo.getItem();
                Object usuario = emprestimo.getUsuario();
                long dias = emprestimo.calcularAtraso();
                if (item instanceof Livro livro) {
                       livro.setDisponibilidade("Disponivel");
                       emprestimo.setStatusEmprestimo("Devolvido");
                }else if (item instanceof Revista revista) {
                        revista.setDisponibilidade("Disponivel");
                        emprestimo.setStatusEmprestimo("Devolvido");
                }else if (item instanceof Cd cd) {
                        cd.setDisponibilidade("Disponivel");
                        emprestimo.setStatusEmprestimo("Devolvido");
                }else if (item instanceof Dvd dvd) {
                        dvd.setDisponibilidade("Disponivel");
                        emprestimo.setStatusEmprestimo("Devolvido");
                }
                if (usuario instanceof Aluno aluno) {
                    aluno.setItensEmprestados(aluno.getItensEmprestados() -1);
                    double multa = dias * Aluno.VALOR_MULTA;
                    if (multa > 0){
                        System.out.println("Devolução Concluída com sucesso! Multa de: R$" + multa);
                    } else{
                        System.out.println("Devolução em dia concluída com sucesso!");
                    }break;
                }
                else if (usuario instanceof Professor professor) {
                    professor.setItensEmprestados(professor.getItensEmprestados() -1);
                    double multa = dias * Professor.VALOR_MULTA;
                    if (multa > 0){
                        System.out.println("Devolução Concluída com sucesso! Multa de: R$" + multa);
                    } else{
                        System.out.println("Devolução em dia concluída com sucesso!");
                    }break;
                }
                else if (usuario instanceof PosGraduado posGraduado) {
                    posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() -1);
                    double multa = dias * PosGraduado.VALOR_MULTA;
                    if (multa > 0){
                        System.out.println("Devolução Concluída com sucesso! Multa de: R$" + multa);
                    } else{
                        System.out.println("Devolução em dia concluída com sucesso!");
                    }break;
                }
                else if (usuario instanceof FuncionarioAdministrativo funcionarioAdministrativo) {
                    funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() -1);
                    double multa = dias * FuncionarioAdministrativo.VALOR_MULTA;
                    if (multa > 0){
                        System.out.println("Devolução Concluída com sucesso! Multa de: R$" + multa);
                    } else{
                        System.out.println("Devolução em dia concluída com sucesso!");
                    }break;
                }
            } 
        }
    }

}
