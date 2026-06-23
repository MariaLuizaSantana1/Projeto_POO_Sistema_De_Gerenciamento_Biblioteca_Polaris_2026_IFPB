package br.edu.ifpb.poo.model;

public class Aluno extends Usuario {
    private String curso;

    public static final int MAX_ITENS_ALUNO = 3;
    public static final int PRAZO_ITENS_ALUNO = 7;
    public static final double VALOR_MULTA = 2.0;

    public Aluno(String nome, String matricula, String curso){
        super(nome, matricula);
        this.curso = curso;
    }

    public Aluno(String nome, String matricula, String curso, String ativo){
        super(nome, matricula, ativo);
        this.curso = curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCurso() {
        return curso;
    }

    public String toString(){
        return "Nome: " + this.getNome() + "\nMatricula: " + getMatricula() +"\nItens emprestados: "+ getItensEmprestados() + "\nStatus: " + getAtivo() +"\nCurso: " + curso;
    }
    //teste
}
