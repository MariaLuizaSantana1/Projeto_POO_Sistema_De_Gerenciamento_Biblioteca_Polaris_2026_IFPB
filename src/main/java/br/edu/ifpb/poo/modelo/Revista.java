package br.edu.ifpb.poo.modelo;
import java.time.LocalDate;

public class Revista {
    private String issn;
    private String titulo;
    private int volume;
    private String editora;
    private LocalDate dataPublicacao;


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


    public LocalDate getDataPublicacao(){
        return dataPublicacao;
    }
    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }











}

