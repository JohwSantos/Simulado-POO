/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemaequipamento.main;

import br.edu.etec.sistemaequipamento.model.Computador;
import br.edu.etec.sistemaequipamento.model.TipoEquipamento;

/**
 *
 * @author Johw Santos
 */
public class Main {
    public static void main(String []args){
    
        Computador c1 = new Computador("Dell",
                "G15", 
                TipoEquipamento.NOTEBOOK,
                "Intel Core i5");
        
        c1.exibirDados();
        
        System.out.println("\nTrocar tipo de Equipamento\n");
        
        c1.setTipo(TipoEquipamento.COMPUTADOR);
        
        c1.exibirDados();
    }
    
}
