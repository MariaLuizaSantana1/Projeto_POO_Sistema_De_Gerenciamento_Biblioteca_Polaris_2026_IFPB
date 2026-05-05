package br.edu.ifpb.poo.modelo;

public class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private String editora;
    private int anoPublicacao;
    private String generoLiterario;
    private int numeroPaginas;
    private String sinopse;
    private String disponibilidade = "Disponivel";

    public Livro(String isbn, String titulo, String autor, String editora, int anoPublicacao, String generoLiterario, int numeroPaginas, String sinopse){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.generoLiterario = generoLiterario;
        this.numeroPaginas = numeroPaginas;
        this.sinopse = sinopse;
    }


    public String getIsbn(){
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
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


    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    
    public String getSinopse(){
        return sinopse;
    }
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getDisponibilidade(){
        return disponibilidade;
    }
    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }


    public String toString(){
        return "Titulo: " + titulo + "\nAutor: " + autor + "\nAno de Publicação: " + anoPublicacao + "\nSinopse: " + sinopse + "\nDisponibilidade: " + disponibilidade;
    }

}
