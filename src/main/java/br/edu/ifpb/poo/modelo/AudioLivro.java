package br.edu.ifpb.poo.modelo;

public class AudioLivro extends Livro{
    private int duracao;

    
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public int getDuracao() {
        return duracao;
    }


    public String toString(){
        return "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor()+ "\nDuração em Minutos: " + duracao + "\nDisponibilidade: " + getDisponibilidade() + "\nAno de Publicação: " + getAnoPublicacao() + "\nSinopse: " + getSinopse();
    }
}
