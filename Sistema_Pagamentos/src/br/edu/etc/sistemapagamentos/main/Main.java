/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etc.sistemapagamentos.main;

import br.edu.etc.sistemapagamentos.model.PagamentoCartao;
import br.edu.etc.sistemapagamentos.model.StatusPagamento;

/**
 *
 * @author Johw Santos
 */
public class Main {
    public static void main(String []args){
        PagamentoCartao p1 = new PagamentoCartao("8536", 1000, StatusPagamento.FALHA);
        p1.exibirStatus();
        System.out.println("\nVerificando Pagamento\n");
        p1.alterarStatus(StatusPagamento.CONCLUIDO);
        p1.exibirStatus();
        
    }
}
