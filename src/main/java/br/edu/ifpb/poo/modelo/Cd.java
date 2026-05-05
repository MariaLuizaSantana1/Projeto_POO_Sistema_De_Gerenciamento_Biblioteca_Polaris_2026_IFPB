package br.edu.ifpb.poo.modelo;

import java.util.Arrays;

public class Cd {
    private String titulo;
    private String artista;
    private String[] listaFaixas;
    private String disponibilidade = "Disponivel";


    public Cd(String titulo, String artista, String[] listaFaixas){
        this.titulo = titulo;
        this.artista = artista;
        this.listaFaixas = listaFaixas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    public String getArtista() {
        return artista;
    }


    public void setListaFaixas(String[] listaFaixas) {
        this.listaFaixas = listaFaixas;
    }
    public String[] getListaFaixas() {
        return listaFaixas;
    }


    public String getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String toString(){
        return "\nTitulo: " + titulo + "\nArtista: " + artista + "\nFaixas: " + Arrays.toString(listaFaixas) + "\nDisponibilidade: " + disponibilidade;
    }
}
