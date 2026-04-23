package br.edu.ifpb.poo.modelo;

public class Dvd {
    private String diretor;
    private int duracao;
    private char classificacaoIndicativa;



    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getDiretor() {
        return diretor;
    }


    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getDuracao() {
        return duracao;
    }


    public void setClassificacaoIndicativa(char classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
    public char getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }
}
