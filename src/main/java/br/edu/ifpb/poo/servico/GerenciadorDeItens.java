package br.edu.ifpb.poo.servico;

import java.util.ArrayList;

import br.edu.ifpb.poo.modelo.Cd;
import br.edu.ifpb.poo.modelo.Dvd;
import br.edu.ifpb.poo.modelo.Livro;
import br.edu.ifpb.poo.modelo.Revista;

public class GerenciadorDeItens {
    private ArrayList<Livro> listaLivros;
    private ArrayList<Revista> listaRevistas;
    private ArrayList<Cd> listaCds;
    private ArrayList<Dvd> listaDvds;

    public GerenciadorDeItens() {
        this.listaLivros = new ArrayList<>();
        this.listaRevistas = new ArrayList<>();
        this.listaCds = new ArrayList<>();
        this.listaDvds = new ArrayList<>();
    }


    public void addLivro(Livro livro){
        this.listaLivros.add(livro);
    }
    public void listarLivros(){
        for(Livro livro : this.listaLivros){
            System.out.println("-----------------");
            System.out.println(livro.toString());
        }
    }

    public void addRevista(Revista resista){
        this.listaRevistas.add(resista);
    }
    public void listarRevistas(){
        for(Revista resista : this.listaRevistas){
            System.out.println("-----------------");
            System.out.println(resista.toString());
        }
    }

    public void addCd(Cd cd){
        this.listaCds.add(cd);
    }
    public void listarCds(){
        for(Cd cd : this.listaCds){
            System.out.println("-----------------");
            System.out.println(cd.toString());
        }
    }

    public void addDvd(Dvd dvd){
        this.listaDvds.add(dvd);
    }
    public void listarDvds(){
        for(Dvd dvd : this.listaDvds){
            System.out.println("-----------------");
            System.out.println(dvd.toString());
        }
    }

    public Livro buscarLivro(String titulo){
        for (Livro livros : listaLivros) {
            if (livros.getTitulo().equals(titulo)){
                return livros;
            }           
        } return null;
    }

    public void buscarRevista(String titulo){
        for (Revista revista : listaRevistas) {
            if (revista.getTitulo().equals(titulo)){
                System.out.println("\nRevista encontrada: \n\n" + revista.toString());
            }
            else{
                System.out.println("\nRevista não encontrada\n");;
            }            
        }
    }


    public void buscarCd(String titulo){
        for (Cd cd : listaCds) {
            if (cd.getTitulo().equals(titulo)){
                System.out.println("\nCd encontrado: \n\n" + cd.toString());
            }
            else{
                System.out.println("\nCd não encontrado\n");;
            }            
        }
    }


    public void buscarDvd(String titulo){
        for (Dvd dvd : listaDvds) {
            if (dvd.getTitulo().equals(titulo)){
                System.out.println("\nDvd encontrado: \n\n" + dvd.toString());
            }
            else{
                System.out.println("\nDvd não encontrado\n");;
            }            
        }
    }
    
}

