/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etc.sistemapagamentos.model;

/**
 *
 * @author Johw Santos
 */
public abstract class Pagamento {
    
    private double valor;
    StatusPagamento status;
    
    public Pagamento(double valor, StatusPagamento status) {
        this.valor = valor;
        this.status = StatusPagamento.PENDENTE;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public StatusPagamento getStatus() {
        return status;
    }

    public void setStatus(StatusPagamento status) {
        this.status = status;
    }
    
    public void processarPagamento(){
        System.out.println("");
    }
    
    public void exibirStatus(){
    
    }
    public void alterarStatus(StatusPagamento novoStatus){
        this.status = novoStatus;
    }
}
