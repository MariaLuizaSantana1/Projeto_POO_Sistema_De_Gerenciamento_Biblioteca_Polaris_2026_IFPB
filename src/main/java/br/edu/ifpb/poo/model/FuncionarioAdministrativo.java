package br.edu.ifpb.poo.model;

public class FuncionarioAdministrativo extends Usuario {
    public static final int MAX_ITENS_FUNCIONARIO = 2;
    public static final int PRAZO_ITENS_FUNCIONARIO = 10;
    public static final double VALOR_MULTA = 1.5;

    public FuncionarioAdministrativo(String nome, String matricula){
        super(nome, matricula); 
    }
    //teste
}
