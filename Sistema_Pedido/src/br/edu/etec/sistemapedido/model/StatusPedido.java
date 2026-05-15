/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemapedido.model;

/**
 *
 * @author Johw Santos
 */
public enum StatusPedido {
    
    AGUARDANDO("Aguardando pagamento"),
    PAGO("Pagamento realizado"),
    ENVIADO("Produto enviado"),
    CANCELADO("Pedido cancelado");
    
    private String descricao;

    private StatusPedido(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
