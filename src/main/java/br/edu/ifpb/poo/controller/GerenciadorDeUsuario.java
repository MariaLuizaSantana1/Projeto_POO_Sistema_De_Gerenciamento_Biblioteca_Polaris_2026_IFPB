package br.edu.ifpb.poo.controller;
import java.util.ArrayList;

import br.edu.ifpb.poo.model.Aluno;
import br.edu.ifpb.poo.model.FuncionarioAdministrativo;
import br.edu.ifpb.poo.model.PosGraduado;
import br.edu.ifpb.poo.model.Professor;
import br.edu.ifpb.poo.model.Usuario;

//Serve para listar, adcionar e remover usuário apenas
public class GerenciadorDeUsuario {
    private ArrayList<Usuario> listaUsuarios;
    private ArrayList<Aluno> listaAlunos;
    private ArrayList<Professor> listaProfessores;
    private ArrayList<PosGraduado> listaPosGraduados;
    private ArrayList<FuncionarioAdministrativo> listaFuncionariosAdministrativos;

    public GerenciadorDeUsuario() {
        this.listaUsuarios = new ArrayList<>();
        this.listaAlunos = new ArrayList<>();
        this.listaProfessores = new ArrayList<>();
        this.listaPosGraduados = new ArrayList<>();
        this.listaFuncionariosAdministrativos = new ArrayList<>();
    }


    public void addAluno(Aluno aluno){
        this.listaAlunos.add(aluno);
        this.listaUsuarios.add(aluno);
    }
    public void listarAlunos(){
        for(Aluno aluno : this.listaAlunos){
            System.out.println("-----------------");
            System.out.println(aluno.toString());
        }
    }

    public void addProfessor(Professor professor){
        this.listaProfessores.add(professor);
        this.listaUsuarios.add(professor);
    }
    public void listarProfessores(){
        for(Professor professor : this.listaProfessores){
            System.out.println("-----------------");
            System.out.println(professor);
        }
    }

    public void addPosGraduado(PosGraduado posGraduado){
        this.listaPosGraduados.add(posGraduado);
        this.listaUsuarios.add(posGraduado);
    }
    public void listarPosGraduados(){
        for(PosGraduado posGraduado : this.listaPosGraduados){
            System.out.println(posGraduado);
        }
    }

    public void addFuncionarioAdministrativo(FuncionarioAdministrativo funcionarioAdministrativo){
        this.listaFuncionariosAdministrativos.add(funcionarioAdministrativo);
        this.listaUsuarios.add(funcionarioAdministrativo);
    }
    public void listarFuncionariosAdministrativos(){
        for(FuncionarioAdministrativo funcionarioAdministrativo : this.listaFuncionariosAdministrativos){
            System.out.println(funcionarioAdministrativo);
        }
    }

    public Usuario buscarUsuario(String matricula){
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getMatricula().equals(matricula)){
                return usuario;
            }                  
        }return null; 
    }


    public boolean validarUsuarioParaEmpréstimo(String matricula){
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getMatricula().equals(matricula) && usuario.getAtivo().equals("ativo")){
                return true;
            } 
        }return false;
    }

    public boolean validarUsuarioParaCompra(String matricula){
        for (Usuario usuario : listaUsuarios) {
            if (usuario.getMatricula().equals(matricula) && usuario.getAtivo().equals("ativo")){
                return true;
            } 
        }return false;
    }

    
    
}
