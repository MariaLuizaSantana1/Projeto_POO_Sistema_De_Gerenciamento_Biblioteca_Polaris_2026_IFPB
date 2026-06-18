package br.edu.ifpb.poo;

public class Usuario {
    private String nome;
    private String matricula;
    private int itensEmprestados = 0;
    private String ativo = "ativo";


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


    public void setItensEmprestados(int itensEmprestados) {
        this.itensEmprestados = itensEmprestados;
    }
    public int getItensEmprestados() {
        return itensEmprestados;
    }


    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    public String getAtivo() {
        return ativo;
    }

    public String toString(){
        return "Nome: " + nome + "\nMatricula: " + matricula +"\nItens emprestados: "+ itensEmprestados + "\nStatus: " + ativo;
    }
}
