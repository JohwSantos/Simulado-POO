/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemazoologico.model;

/**
 *
 * @author Johw Santos
 */
public abstract class Animal {
    private String nome;
    private String idade;
    private Habitat habitat;

    public Animal(String nome, String idade, Habitat habitat) {
        this.nome = nome;
        this.idade = idade;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public String getIdade() {
        return idade;
    }

    public Habitat getHabitat() {
        return habitat;
    }
    
    public abstract void emitirSom();
    
    public void exibirInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("Habitat: " + habitat);
    }
}
