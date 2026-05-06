package br.edu.ifpb.poo.modelo;

import java.time.LocalDate;


public class Emprestimo {
    private String nomeUsuario;
    private String item;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;
    private String statusEmprestimo = "Ativo";


    public Emprestimo(String nomeUsuario, String item, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.nomeUsuario = nomeUsuario;
        this.item = item;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public void setNome(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public String getNome() {
        return nomeUsuario;
    }

    public void setItem(String item) {
        this.item = item;
    }
    public String getItem() {
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
        return "Nome do Usuário do Impréstimo: " + nomeUsuario + "\nItem emprestado: " + item + "\nData de Empréstimo: " + dataEmprestimo + "\nData de Devolução: " + dataDevolucao + "\nStatus do Empréstimo: " + statusEmprestimo;
    }
}
