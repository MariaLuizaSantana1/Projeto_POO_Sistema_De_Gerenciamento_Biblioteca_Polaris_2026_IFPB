package br.edu.ifpb.poo.model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Venda {
    private Usuario usuario;
    private ItemDoAcervo item;
    private String nomeUsuario;
    private String matriculaUsuario;
    private String nomeJogo;
    private LocalDate dataVenda;
    private String preco;


    public Venda(Usuario usuario, ItemDoAcervo item, String nomeUsuario, String nomeJogo, LocalDate dataVenda, String preco){
        this.usuario = usuario;
        this.item = item;
        this.nomeUsuario = nomeUsuario;
        this.nomeJogo = nomeJogo;
        this.dataVenda = dataVenda;
        this.preco = preco;
        
    }
    public Venda(Usuario usuario, ItemDoAcervo item, String nomeUsuario, String matriculaUsuario, String nomeJogo, LocalDate dataVenda, String preco){
        this.usuario = usuario;
        this.item = item;
        this.nomeUsuario = nomeUsuario;
        this.matriculaUsuario = matriculaUsuario;
        this.nomeJogo = nomeJogo;
        this.dataVenda = dataVenda;
        this.preco = preco;
        
    }


    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Usuario getUsuario() {
        return usuario;
    }

    public void setItem(ItemDoAcervo item) {
        this.item = item;
    }
    public ItemDoAcervo getItem() {
        return item;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setMatriculaUsuario(String matriculaUsuario) {
        this.matriculaUsuario = matriculaUsuario;
    }
    public String getMatriculaUsuario() {
        return matriculaUsuario;
    }

    public void setnomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }
    public String getnomeJogo() {
        return nomeJogo;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }
    public String getDataVenda() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataVendaFormatada = dataVenda.format(formatador);
        return dataVendaFormatada;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }


    public String toString(){
        return "Nome do Usuário da compra: " + nomeUsuario + "\nItem vendido: " + nomeJogo + "\nData de Venda: " + getDataVenda() + "\nPreço: " + preco;
    }

    

}


