package br.edu.ifpb.poo.modelo;

public class Dvd {
    private String titulo;
    private String diretor;
    private int duracao;
    private String classificacaoIndicativa;
    private String disponibilidade = "Disponivel";

    public Dvd(String titulo, String diretor, int duracao, String classificacaoIndicativa){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.classificacaoIndicativa = classificacaoIndicativa;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }


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


    public void setClassificacaoIndicativa(String classificacaoIndicativa) {
        this.classificacaoIndicativa = classificacaoIndicativa;
    }
    public String getClassificacaoIndicativa() {
        return classificacaoIndicativa;
    }

    public String getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }



    public String toString(){
        return "\nTitulo: " + titulo + "\nDiretor: " + diretor + "\nDuração: " + duracao +"min" + "\nClassificação indicativa: " + classificacaoIndicativa + "\nDisponibilidade: " + disponibilidade;
    }


}
