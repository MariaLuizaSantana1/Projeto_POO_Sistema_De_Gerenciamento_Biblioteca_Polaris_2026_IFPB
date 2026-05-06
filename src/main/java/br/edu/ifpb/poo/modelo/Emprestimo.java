package br.edu.ifpb.poo.modelo;

import java.time.LocalDate;


public class Emprestimo {
    private Object usuario;
    private Object item;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private String statusEmprestimo = "Ativo";


    public Emprestimo(Object usuario, Object item, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.usuario = usuario;
        this.item = item;
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

    public String toString(){
        return "Nome do Usuário do Impréstimo: " + usuario + "\nItem emprestado: " + item + "\nData de Empréstimo: " + dataEmprestimo + "\nData de Devolução: " + dataDevolucao + "\nStatus do Empréstimo: " + statusEmprestimo;
    }
}
