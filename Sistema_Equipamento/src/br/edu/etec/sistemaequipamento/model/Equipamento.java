/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemaequipamento.model;

/**
 *
 * @author Johw Santos
 */
public class Equipamento {
    private String nome;
    private String modelo;
    private TipoEquipamento tipo;

    public String getNome() {
        return nome;
    }

    public String getModelo() {
        return modelo;
    }

    public TipoEquipamento getTipo() {
        return tipo;
    }

    public Equipamento(String nome, String modelo, TipoEquipamento tipo) {
        this.nome = nome;
        this.modelo = modelo;
        this.tipo = tipo;
    }
    
    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Modelo: " + modelo);
        System.out.println("Tipo: " + tipo);
    }
    
    public void setTipo(TipoEquipamento tipo ){
        this.tipo = tipo;
    }
}
