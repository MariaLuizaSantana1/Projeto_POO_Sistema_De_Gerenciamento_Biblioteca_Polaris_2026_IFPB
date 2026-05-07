package br.edu.ifpb.poo.modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Emprestimo {
    private Object usuario;
    private Object item;
    private String nomeUsuario;
    private String matriculaUsuario;
    private String tituloItem;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private long diasAtraso = 0;
    private String statusEmprestimo = "Ativo";
    private String statusPrazo = "Em Dia";
    private String statusMulta = "Sem multa";


    public Emprestimo(Object usuario, Object item, String nomeUsuario, String tituloItem, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.usuario = usuario;
        this.item = item;
        this.nomeUsuario = nomeUsuario;
        this.tituloItem = tituloItem;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
    public Emprestimo(Object usuario, Object item, String nomeUsuario, String matriculaUsuario, String tituloItem, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.usuario = usuario;
        this.item = item;
        this.nomeUsuario = nomeUsuario;
        this.matriculaUsuario = matriculaUsuario;
        this.tituloItem = tituloItem;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }


    public void setUsuario(Object usuario) {
        this.usuario = usuario;
    }
    public Object getUsuario() {
        return usuario;
    }

    public void setItem(Object item) {
        this.item = item;
    }
    public Object getItem() {
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
    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
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
        return "Nome do Usuário do Impréstimo: " + nomeUsuario + "\nItem emprestado: " + tituloItem + "\nData de Empréstimo: " + dataEmprestimo + "\nData de Devolução: " + dataDevolucao +"\nStatus: "+ statusPrazo + "\nMulta: " + statusMulta+ "\nStatus do Empréstimo: " + statusEmprestimo;
    }
}
