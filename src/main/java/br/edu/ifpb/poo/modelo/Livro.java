package br.edu.ifpb.poo.modelo;

import br.edu.ifpb.poo.ItemDoAcervo;

public class Livro extends ItemDoAcervo{
    private String isbn;
    private String editora;
    private int anoPublicacao;
    private String generoLiterario;
    private String sinopse;
  

    public Livro(String id, String titulo, String autor,String editora, int anoPublicacao, String generoLiterario, String sinopse){
        super(id, titulo, autor);
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.generoLiterario = generoLiterario;
        this.sinopse = sinopse;
    }


    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora(){
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getGeneroLiterario(){
        return generoLiterario;
    }
    public void setGeneroLiterario(String generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    public String getSinopse(){
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }


    public String toString(){
        return "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nDisponibilidade: " + getDisponibilidade() + "\nAno de Publicação: " + anoPublicacao + "\nSinopse: " + sinopse;
    }

}