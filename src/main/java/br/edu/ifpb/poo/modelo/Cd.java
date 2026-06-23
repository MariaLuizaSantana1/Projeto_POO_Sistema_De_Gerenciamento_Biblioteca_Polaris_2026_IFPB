package br.edu.ifpb.poo.modelo;

import java.util.Arrays;

import br.edu.ifpb.poo.ItemDoAcervo;

public class Cd extends ItemDoAcervo{
    private String artista;
    private String[] listaFaixas;
   

    public Cd(String id, String titulo, String autor,String[] listaFaixas){
        super(id, titulo, autor);
        this.listaFaixas = listaFaixas;
    }

    public void setListaFaixas(String[] listaFaixas) {
        this.listaFaixas = listaFaixas;
    }
    public String[] getListaFaixas() {
        return listaFaixas;
    }



    public String toString(){
        return "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nDisponibilidade: " + getDisponibilidade() + "\nArtista: " + artista + "\nFaixas: " + Arrays.toString(listaFaixas);
    }
    
}
