package br.edu.ifpb.poo.modelo;

public class Aluno {
    private String nome;
    private String matricula;
    private String curso;
    private String ativo = "ativo";


    public Aluno(String nome, String matricula, String curso){
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }


    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    public String getAtivo() {
        return ativo;
    }

    public String toString(){
        return "Nome: " + nome + "\nMatricula: " + matricula + "\nCurso: " + curso + "\nStatus: " + ativo;
    }
}
