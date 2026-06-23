package br.edu.ifpb.poo.model;

public class LivroFisico extends Livro{
    private int numeroPaginas;


    public LivroFisico(String id, String titulo, String autor,String editora, int anoPublicacao, String generoLiterario, String sinopse, int numeroPaginas){
        super(id, titulo, autor, editora, anoPublicacao, generoLiterario, sinopse);
        this.numeroPaginas = numeroPaginas;
    }


    public int getNumeroPaginas(){
        return numeroPaginas;
    }
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    

    public String toString(){
        return "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor()+ "\nNúmero de Páginas: " + numeroPaginas + "\nDisponibilidade: " + getDisponibilidade() + "\nAno de Publicação: " + getAnoPublicacao() + "\nSinopse: " + getSinopse();
    }

}
