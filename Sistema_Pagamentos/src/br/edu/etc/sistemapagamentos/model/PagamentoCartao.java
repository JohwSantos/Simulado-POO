/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etc.sistemapagamentos.model;

/**
 *
 * @author Johw Santos
 */
public class PagamentoCartao extends Pagamento{

    public String getNumCartao() {
        return numCartao;
    }
    
    private String numCartao;

    public PagamentoCartao(String numCartao, double valor, StatusPagamento status) {
        super(valor, status);
        this.numCartao = numCartao;
    }
    @Override
    public void processarPagamento(){
        System.out.println("Processando Pagamento");
    }
    @Override
    public void exibirStatus(){
        super.exibirStatus();
        System.out.println("Valor de Pagamento: " + getValor());
        System.out.println("Status de Pagamento: " + getStatus());
        System.out.println("Ultimos 4 digitos do cartao: " + getNumCartao());
    }
    
    
}
