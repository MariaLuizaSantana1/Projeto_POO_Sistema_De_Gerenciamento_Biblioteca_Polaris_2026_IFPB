package br.edu.ifpb.poo;

public class ItemDoAcervo {
    private String id;
    private String titulo;
    private String autor;
    private String disponibilidade = "Disponivel";

    public ItemDoAcervo(String id, String titulo, String autor){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getId(){
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }


    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String toString(){
        return "\nId: " + id + "\nTitulo: " + titulo + "\nAutor: " + autor + "\nDisponibilidade: " + disponibilidade;
    }
}
