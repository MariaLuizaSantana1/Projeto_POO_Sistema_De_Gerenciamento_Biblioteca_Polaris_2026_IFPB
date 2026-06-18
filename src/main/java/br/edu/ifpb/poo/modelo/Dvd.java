package br.edu.ifpb.poo.modelo;

import br.edu.ifpb.poo.ItemDoAcervo;

public class Dvd extends ItemDoAcervo{
    private String diretor;
    private int duracao;
    private String classificacaoIndicativa;
    

    public Dvd(String diretor, int duracao, String classificacaoIndicativa){
        this.diretor = diretor;
        this.duracao = duracao;
        this.classificacaoIndicativa = classificacaoIndicativa;
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


    public String toString(){
        return "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nDisponibilidade: " + getDisponibilidade() + "\nDiretor: " + diretor + "\nDuração: " + duracao +"min" + "\nClassificação indicativa: " + classificacaoIndicativa;
    }
    
}
