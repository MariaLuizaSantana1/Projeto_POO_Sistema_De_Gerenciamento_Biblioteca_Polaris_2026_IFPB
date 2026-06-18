package br.edu.ifpb.poo.modelo;

public class LivroFisico extends Livro{
    private int numeroPaginas;


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
