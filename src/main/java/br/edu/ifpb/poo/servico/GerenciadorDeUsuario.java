package br.edu.ifpb.poo.servico;
import java.util.ArrayList;

import br.edu.ifpb.poo.modelo.Aluno;
import br.edu.ifpb.poo.modelo.FuncionarioAdministrativo;
import br.edu.ifpb.poo.modelo.PosGraduado;
import br.edu.ifpb.poo.modelo.Professor;

//Serve para listar, adcionar e remover usuário apenas
public class GerenciadorDeUsuario {
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Professor> listaProfessores;
    private ArrayList<PosGraduado> listaPosGraduados;
    private ArrayList<FuncionarioAdministrativo> listaFuncionariosAdministrativos;

    public GerenciadorDeUsuario() {
        this.listaAlunos = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
        this.listaPosGraduados = new ArrayList<>();
        this.listaFuncionariosAdministrativos = new ArrayList<>();
    }


    public void addAluno(Aluno aluno){
        this.listaAlunos.add(aluno);
    }
    public void listarAlunos(){
        for(Aluno aluno : this.listaAlunos){
            System.out.println("-----------------");
            System.out.println(aluno.toString());
        }
    }

    public void addProfessor(Professor professor){
        this.listaProfessores.add(professor);
    }
    public void listarProfessores(){
        for(Professor professor : this.listaProfessores){
            System.out.println("-----------------");
            System.out.println(professor);
        }
    }

    public void addPosGraduado(PosGraduado posGraduado){
        this.listaPosGraduados.add(posGraduado);
    }
    public void listarPosGraduados(){
        for(PosGraduado posGraduado : this.listaPosGraduados){
            System.out.println(posGraduado);
        }
    }

    public void addFuncionarioAdministrativo(FuncionarioAdministrativo funcionarioAdministrativo){
        this.listaFuncionariosAdministrativos.add(funcionarioAdministrativo);
    }
    public void listarFuncionariosAdministrativos(){
        for(FuncionarioAdministrativo funcionarioAdministrativo : this.listaFuncionariosAdministrativos){
            System.out.println(funcionarioAdministrativo);
        }
    }
    
}
