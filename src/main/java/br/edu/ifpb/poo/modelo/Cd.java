package br.edu.ifpb.poo.modelo;

public class Cd {
    private String artista;
    private String[] listaFaixas;

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
}
