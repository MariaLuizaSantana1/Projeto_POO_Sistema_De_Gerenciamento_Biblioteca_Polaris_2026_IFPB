package br.edu.ifpb.poo.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Emprestimo {
    private Usuario usuario;
    private ItemDoAcervo item;
    private String nomeUsuario;
    private String matriculaUsuario;
    private String tituloItem;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private String statusEmprestimo = "Ativo";
    private String statusPrazo = "Em Dia";
    private String statusMulta = "Sem multa";


    public Emprestimo(Usuario usuario, ItemDoAcervo item, String nomeUsuario, String tituloItem, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.usuario = usuario;
        this.item = item;
        this.nomeUsuario = nomeUsuario;
        this.tituloItem = tituloItem;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
    public Emprestimo(Usuario usuario, ItemDoAcervo item, String nomeUsuario, String matriculaUsuario, String tituloItem, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.usuario = usuario;
        this.item = item;
        this.nomeUsuario = nomeUsuario;
        this.matriculaUsuario = matriculaUsuario;
        this.tituloItem = tituloItem;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
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

    public void setTituloItem(String tituloItem) {
        this.tituloItem = tituloItem;
    }
    public String getTituloItem() {
        return tituloItem;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public String getDataEmprestimo() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataEmprestimoFormatada = dataEmprestimo.format(formatador);
        return dataEmprestimoFormatada;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public String getDataDevolucao() {
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataDevolucaoFormatada = dataDevolucao.format(formatador);
        return dataDevolucaoFormatada;
    }

    public void setStatusEmprestimo(String statusEmprestimo) {
        this.statusEmprestimo = statusEmprestimo;
    }
    public String getStatusEmprestimo() {
        return statusEmprestimo;
    }






    public void setStatusPrazo(String statusPrazo) {
        this.statusPrazo = statusPrazo;
    }
    public String getStatusPrazo() {
        return statusPrazo;
    }

    public void setStatusMulta(String statusMulta) {
        this.statusMulta = statusMulta;
    }
    public String getStatusMulta() {
        return statusMulta;
    }


    
    public long calcularAtraso(){
        LocalDate hoje = LocalDate.now();
        long diasAtrasados = ChronoUnit.DAYS.between(dataDevolucao, hoje);
        if (diasAtrasados > 0) {
            return diasAtrasados;
        }
        else{
             return 0;
        }
        
    }



    public String toString(){
        return "Nome do Usuário do Impréstimo: " + nomeUsuario + "\nItem emprestado: " + tituloItem + "\nData de Empréstimo: " + getDataEmprestimo() + "\nData de Devolução: " + getDataDevolucao() +"\nStatus: "+ statusPrazo + "\nMulta: " + statusMulta+ "\nStatus do Empréstimo: " + statusEmprestimo;
    }

}
