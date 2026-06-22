package br.edu.ifpb.poo.modelo;

import br.edu.ifpb.poo.ItemDoAcervo;

public class Revista extends ItemDoAcervo{
    private String issn;
    private int volume;
    private String editora;
    private String dataPublicacao;
    
    public Revista(String id, String titulo, String autor, String issn,int volume, String editora, String dataPublicacao){
        super(id, titulo, autor);
        this.issn = issn;
        this.volume = volume;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
    }

    public String getIssn(){
        return issn;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }

    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEditora(){
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getDataPublicacao(){
        return dataPublicacao;
    }
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String toString(){
        return "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nDisponibilidade: " + getDisponibilidade() + "\nISSN: " + issn +"\nEditora: " + editora;
    }

}

