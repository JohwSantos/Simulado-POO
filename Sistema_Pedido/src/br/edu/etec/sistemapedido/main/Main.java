/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemapedido.main;

import br.edu.etec.sistemapedido.model.Pedido;
import br.edu.etec.sistemapedido.model.StatusPedido;

/**
 *
 * @author Johw Santos
 */
public class Main {
    public static void main(String []args){
    
        Pedido p1 = new Pedido("Maria", StatusPedido.AGUARDANDO);
        
        p1.exibirPedido();
        
        System.out.println("\nAlterando Status ...\n");
        
        p1.alterarStatus(StatusPedido.PAGO);
        
        p1.exibirPedido();
        
    }
}
