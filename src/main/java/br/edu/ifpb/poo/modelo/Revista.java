package br.edu.ifpb.poo.modelo;

public class Revista {
    private String issn;
    private String titulo;
    private int volume;
    private String editora;
    private String dataPublicacao;
    private String disponibilidade = "Disponivel";

    public Revista(String issn, String titulo,int volume, String editora, String dataPublicacao){
        this.issn = issn;
        this.titulo = titulo;
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


    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    public String toString(){
        return "\nISSN " + issn + "\nTitulo: " + titulo + "\nEditora: " + editora + "\nDisponibilidade: " + disponibilidade;
    }





}

