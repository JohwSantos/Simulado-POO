/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemazoologico.main;

import br.edu.etec.sistemazoologico.model.Animal;
import br.edu.etec.sistemazoologico.model.Arara;
import br.edu.etec.sistemazoologico.model.Golfinho;
import br.edu.etec.sistemazoologico.model.Habitat;
import br.edu.etec.sistemazoologico.model.Leao;

/**
 *
 * @author Johw Santos
 */
public class Main {
    public static void main (String []args){
        
        Animal a1 = new Leao("Simba", "15", Habitat.TERRESTRE);
        Animal a2 = new Golfinho("Dolphin", "10", Habitat.AQUATICO);
        Animal a3 = new Arara("Ze", "8", Habitat.AEREO);
        
        System.out.println("\n-----Zoologico-----\n");
        a1.exibirInfo();
        a1.emitirSom();
        System.out.println("\n--------\n");
        a2.exibirInfo();
        a2.emitirSom();
        System.out.println("\n--------\n");
        a3.exibirInfo();
        a3.emitirSom();
    }
}
