package br.edu.ifpb.poo.modelo;

import java.util.Arrays;

import br.edu.ifpb.poo.ItemDoAcervo;

public class Cd extends ItemDoAcervo{
    private String artista;
    private String[] listaFaixas;
   

    public Cd(String artista, String[] listaFaixas){
        this.artista = artista;
        this.listaFaixas = listaFaixas;
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



    public String toString(){
        return "\nArtista: " + artista + "\nFaixas: " + Arrays.toString(listaFaixas);
    }
    
}
