/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etc.sistemapagamentos.model;

/**
 *
 * @author Johw Santos
 */
public enum StatusPagamento {
    
    PENDENTE("Pagamento pendente"),
    PROCESSANDO("Processando Pagamento"),
    CONCLUIDO("Pagamento Concluido"),
    FALHA("Falha no Pagamento");
    
    private String descricao;

    StatusPagamento(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
}
