package br.edu.ifpb.poo.model;

public class AudioLivro extends Livro{
    private String duracao;


    public AudioLivro(String id, String titulo, String autor, Editora editora, int anoPublicacao, String generoLiterario, String duracao, String sinopse){
        super(id, titulo, autor, editora, anoPublicacao, generoLiterario, sinopse);
        this.duracao = duracao;
    }
    
    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    public String getDuracao() {
        return duracao;
    }


    public String toString(){
        return "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor()+ "\nDuração em Minutos: " + duracao + "\nDisponibilidade: " + getDisponibilidade() + "\nAno de Publicação: " + getAnoPublicacao() + "\nSinopse: " + getSinopse();
    }
}
