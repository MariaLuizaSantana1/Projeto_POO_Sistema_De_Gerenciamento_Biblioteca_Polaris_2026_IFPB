package br.edu.ifpb.poo.modelo;

public class FuncionarioAdministrativo {
    private String nome;
    private String matricula;
    private String ativo = "ativo";

    public FuncionarioAdministrativo(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
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


    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }
    public String getAtivo() {
        return ativo;
    }

    public String toString(){
        return "Nome: " + nome + "\nMatricula: " + matricula + "\nStatus: " + ativo;
    }
}
