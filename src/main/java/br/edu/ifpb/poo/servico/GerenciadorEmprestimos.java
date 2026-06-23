package br.edu.ifpb.poo.servico;

import java.time.LocalDate;
import java.util.ArrayList;

import br.edu.ifpb.poo.ItemDoAcervo;
import br.edu.ifpb.poo.modelo.Aluno;
import br.edu.ifpb.poo.modelo.Emprestimo;
import br.edu.ifpb.poo.modelo.FuncionarioAdministrativo;
import br.edu.ifpb.poo.modelo.PosGraduado;
import br.edu.ifpb.poo.modelo.Professor;


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

    public void listarEmprestimosPorItem(String titulo){
        for(Emprestimo emprestimo : this.listaEmprestimos){
            if (emprestimo.getTituloItem().equals(titulo)) {
                System.out.println("-----------------");
                System.out.println(emprestimo.toString());
            }
        }
    }


    
    public void emprestarItemParaAluno(Aluno aluno, ItemDoAcervo item){
        if(aluno.getItensEmprestados() < Aluno.MAX_ITENS_ALUNO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Aluno.PRAZO_ITENS_ALUNO);
            String tituloItem = item.getTitulo();
            String nomeUsuario = aluno.getNome();
            String matricula = aluno.getMatricula();
            Emprestimo emprestimo = new Emprestimo(aluno, item, nomeUsuario, matricula, tituloItem, hoje, devolucao);
            aluno.setItensEmprestados(aluno.getItensEmprestados()+1);
            item.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do item " + item.getTitulo() +" realizado com sucesso para aluno " + aluno.getNome() + " de matricula " + aluno.getMatricula());
        } else{
            System.out.println("Usuário de matricula " + aluno.getMatricula() + "já atingiu o limite máximo de 3 itens");
        }   
    }



    public void emprestarItemParaProfessor(Professor professor, ItemDoAcervo item){
        if(professor.getItensEmprestados() < Professor.MAX_ITENS_PROFESSOR ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(Professor.PRAZO_LIVROS_PROFESSOR);
            String tituloItem = item.getTitulo();
            String nomeUsuario = professor.getNome();
            String matricula = professor.getMatricula();
            Emprestimo emprestimo = new Emprestimo(professor, item, nomeUsuario, matricula, tituloItem, hoje, devolucao);
            professor.setItensEmprestados(professor.getItensEmprestados()+1);
            item.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do item " + item.getTitulo() +" realizado com sucesso para professor " + professor.getNome() + " de matricula " + professor.getMatricula());
        }
        else{
            System.out.println("Usuário de matricula " + professor.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
    }


    public void emprestarItemParaPosGraduado(PosGraduado posGraduado, ItemDoAcervo item){
        if(posGraduado.getItensEmprestados() < PosGraduado.MAX_ITENS_POS_GRADUADO ){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(PosGraduado.PRAZO_LIVROS_POS_GRADUADO);
            String tituloItem = item.getTitulo();
            String nomeUsuario = posGraduado.getNome();
            String matricula = posGraduado.getMatricula();
            Emprestimo emprestimo = new Emprestimo(posGraduado, item, nomeUsuario, matricula, tituloItem, hoje, devolucao);
            posGraduado.setItensEmprestados(posGraduado.getItensEmprestados()+1);
            item.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do item " + item.getTitulo() +" realizado com sucesso para pós graduado " + posGraduado.getNome() + " de matricula " + posGraduado.getMatricula());
        }
        else{
            System.out.println("Usuário de matricula " + posGraduado.getMatricula() + " já atingiu o limite máximo de 5 itens");
        }
    }



    public void emprestarItemParaFuncionario(FuncionarioAdministrativo funcionarioAdministrativo, ItemDoAcervo item){
        if(funcionarioAdministrativo.getItensEmprestados() < FuncionarioAdministrativo.MAX_ITENS_FUNCIONARIO){
            LocalDate hoje = LocalDate.now();
            LocalDate devolucao = hoje.plusDays(FuncionarioAdministrativo.PRAZO_ITENS_FUNCIONARIO);
            String tituloItem = item.getTitulo();
            String nomeUsuario = funcionarioAdministrativo.getNome();
            String matricula = funcionarioAdministrativo.getMatricula();
            Emprestimo emprestimo = new Emprestimo(funcionarioAdministrativo, item, nomeUsuario, matricula, tituloItem, hoje, devolucao);
            funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados()+1);
            item.setDisponibilidade("Emprestado");
            listaEmprestimos.add(emprestimo);
            System.out.println("Empréstimo do item " + item.getTitulo() +" realizado com sucesso para funcionário " + funcionarioAdministrativo.getNome() + " de matricula " + funcionarioAdministrativo.getMatricula());
        }
        else {
            System.out.println("Usuário de matricula " + funcionarioAdministrativo.getMatricula() + " já atingiu o limite máximo de 2 itens");
        }
    }

    




    public void registrarDevolução(String tituloItem){
        for(Emprestimo emprestimo : this.listaEmprestimos){
            if (emprestimo.getTituloItem().equals(tituloItem) && emprestimo.getStatusEmprestimo().equals("Ativo") ) {
                ItemDoAcervo item = emprestimo.getItem();
                Object usuario = emprestimo.getUsuario();
                long dias = emprestimo.calcularAtraso();
                item.setDisponibilidade("Disponivel");
                emprestimo.setStatusEmprestimo("Devolvido");
                if (usuario instanceof Aluno aluno) {
                    aluno.setItensEmprestados(aluno.getItensEmprestados() -1);
                    double multa = dias * Aluno.VALOR_MULTA;
                    if (multa > 0){
                        emprestimo.setStatusMulta("Pendente");
                        System.out.println("Devolução Concluída com sucesso!\nAtraso de " + dias+" dias\n Multa de: R$" + multa);
                    } else{
                        System.out.println("Devolução em dia concluída com sucesso!");
                    }break;
                }
                else if (usuario instanceof Professor professor) {
                    professor.setItensEmprestados(professor.getItensEmprestados() -1);
                    double multa = dias * Professor.VALOR_MULTA;
                    if (multa > 0){
                        System.out.println("Devolução Concluída com sucesso!\nAtraso de " + dias+" dias\n Multa de: R$" + multa);
                        emprestimo.setStatusMulta("Pendente");
                    } else{
                        System.out.println("Devolução em dia concluída com sucesso!");
                    }break;
                }
                else if (usuario instanceof PosGraduado posGraduado) {
                    posGraduado.setItensEmprestados(posGraduado.getItensEmprestados() -1);
                    double multa = dias * PosGraduado.VALOR_MULTA;
                    if (multa > 0){
                        System.out.println("Devolução Concluída com sucesso!\nAtraso de " + dias+" dias\n Multa de: R$" + multa);
                        emprestimo.setStatusMulta("Pendente");
                    } else{
                        System.out.println("Devolução em dia concluída com sucesso!");
                    }break;
                }
                else if (usuario instanceof FuncionarioAdministrativo funcionarioAdministrativo) {
                    funcionarioAdministrativo.setItensEmprestados(funcionarioAdministrativo.getItensEmprestados() -1);
                    double multa = dias * FuncionarioAdministrativo.VALOR_MULTA;
                    if (multa > 0){
                        emprestimo.setStatusMulta("Pendente");
                        System.out.println("Devolução Concluída com sucesso!\nAtraso de " + dias+" dias\n Multa de: R$" + multa);
                    } else{
                        System.out.println("Devolução em dia concluída com sucesso!");
                    }break;
                } 
            } else{
                System.out.println("Emprestimo não encontrado");

            }
        }
    }



    public void pagarMulta(String tituloItem){
        for(Emprestimo emprestimo : this.listaEmprestimos){
            if (emprestimo.getTituloItem().equals(tituloItem) && emprestimo.getStatusMulta().equals("Pendente") ) {
                emprestimo.setStatusMulta("Pago");
            }
        }
    }

}
