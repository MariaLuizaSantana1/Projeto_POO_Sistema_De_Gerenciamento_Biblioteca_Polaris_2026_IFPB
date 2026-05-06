package br.edu.ifpb.poo.modelo;

public class FuncionarioAdministrativo {
    private String nome;
    private String matricula;
    private int itensEmprestados = 0;
    private String ativo = "ativo";

    public static final int MAX_ITENS_FUNCIONARIO = 2;


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
        return "Nome: " + nome + "\nMatricula: " + matricula +"\nItens emprestados:"+ itensEmprestados + "\nStatus: " + ativo;
    }
}
