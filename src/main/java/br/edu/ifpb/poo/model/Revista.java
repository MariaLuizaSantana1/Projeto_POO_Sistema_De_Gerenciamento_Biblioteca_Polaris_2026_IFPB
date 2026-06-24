package br.edu.ifpb.poo.model;

public class Revista extends ItemDoAcervo{
    private String issn;
    private int volume;
    private Editora editora;
    private String dataPublicacao;
    
    public Revista(String id, String titulo, String autor, int volume, Editora editora, String dataPublicacao){
        super(id, titulo, autor);
        this.volume = volume;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
    }

    public String getIssn(){
        return issn;
    }
    public void setIssn(String issn) {
        this.issn = issn;
    }

    public int getVolume(){
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Editora getEditora(){
        return editora;
    }
    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public String getDataPublicacao(){
        return dataPublicacao;
    }
    public void setDataPublicacao(String dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String toString(){
        return "\nId: " + getId() + "\nTitulo: " + getTitulo() + "\nAutor: " + getAutor() + "\nDisponibilidade: " + getDisponibilidade() + "\nISSN: " + issn +"\nEditora: " + editora;
    }

}

