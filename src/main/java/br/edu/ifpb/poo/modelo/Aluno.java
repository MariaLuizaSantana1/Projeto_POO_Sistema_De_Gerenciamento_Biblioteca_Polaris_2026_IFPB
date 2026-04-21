package br.edu.ifpb.poo.modelo;

public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    private String ativo;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
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
}
