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

    public Revista buscarRevista(String titulo){
        for (Revista revista : listaRevistas) {
            if (revista.getTitulo().equals(titulo)){
                return revista;
            }          
        }return null;
    }


    public Cd buscarCd(String titulo){
        for (Cd cd : listaCds) {
            if (cd.getTitulo().equals(titulo)){
                return cd;
            }           
        }return null;
    }


    public Dvd buscarDvd(String titulo){
        for (Dvd dvd : listaDvds) {
            if (dvd.getTitulo().equals(titulo)){
                return dvd;
            }            
        }return null;
    }

    public Livro validarLivroParaEmpréstimo(String titulo){
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equals(titulo) && livro.getDisponibilidade().equals("Disponivel")){
                return livro;
            } 
            else if (livro.getTitulo().equals(titulo) && !livro.getDisponibilidade().equals("Disponivel")) {
                System.out.println("Livro não disponivel");
                return null;
            }
        }
        System.out.println("Livro não encontrado");
        return null;
    }

    public Revista validarRevistaParaEmpréstimo(String titulo){
        for (Revista revista : listaRevistas) {
            if (revista.getTitulo().equals(titulo) && revista.getDisponibilidade().equals("Disponivel")){
                return revista;
            } 
            else if (revista.getTitulo().equals(titulo) && !revista.getDisponibilidade().equals("Disponivel")) {
                System.out.println("Revista não disponivel");
                return null;
            }
        }
        System.out.println("Revista não encontrado");
        return null;
    }

    public Dvd validarDvdParaEmpréstimo(String titulo){
        for (Dvd dvd : listaDvds) {
            if (dvd.getTitulo().equals(titulo) && dvd.getDisponibilidade().equals("Disponivel")){
                return dvd;
            } 
            else if (dvd.getTitulo().equals(titulo) && !dvd.getDisponibilidade().equals("Disponivel")) {
                System.out.println("Dvd não disponivel");
                return null;
            }
        }
        System.out.println("Dvd não encontrado");
        return null;
    }

    public Cd validarCdParaEmpréstimo(String titulo){
        for (Cd cd : listaCds) {
            if (cd.getTitulo().equals(titulo) && cd.getDisponibilidade().equals("Disponivel")){
                return cd;
            } 
            else if (cd.getTitulo().equals(titulo) && !cd.getDisponibilidade().equals("Disponivel")) {
                System.out.println("cd não disponivel");
                return null;
            }
        }
        System.out.println("Cd não encontrado");
        return null;
    }

}

