/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemazoologico.model;

/**
 *
 * @author Johw Santos
 */
public class Golfinho extends Animal{

    public Golfinho(String nome, String idade, Habitat habitat) {
        super(nome, idade, habitat);
    }

    @Override
    public void emitirSom() {
        System.out.println("O Golfinho emite um som");
    }
    
}
