package br.edu.ifpb.poo.modelo;

import br.edu.ifpb.poo.ItemDoAcervo;

public class Dvd extends ItemDoAcervo{
    private int duracao;
    private String classificacaoIndicativa;
    

    public Dvd(String id, String titulo, String autor, int duracao, String classificacaoIndicativa){
        super(id, titulo, autor);
        this.duracao = duracao;
        this.classificacaoIndicativa = classificacaoIndicativa;
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
        return "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nDisponibilidade: " + getDisponibilidade() + "\nDuração: " + duracao +"min" + "\nClassificação indicativa: " + classificacaoIndicativa;
    }
    
}
