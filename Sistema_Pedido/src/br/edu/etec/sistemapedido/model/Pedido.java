/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemapedido.model;

/**
 *
 * @author Johw Santos
 */
public class Pedido {
    
    private String cliente;
    private StatusPedido status;

    public Pedido(String Pedido, StatusPedido status) {
        this.cliente = Pedido;
        this.status = status;
    }
    
    public void exibirPedido(){
        
        System.out.println("Cliente: " + cliente);
        System.out.println("Status: " + status);
        System.out.println("Descricao: " + status.getDescricao());
        
    }
    
    public void alterarStatus(StatusPedido novoStatus){
        this.status = novoStatus;
    }
}
