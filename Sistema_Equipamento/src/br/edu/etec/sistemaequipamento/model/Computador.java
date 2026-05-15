/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemaequipamento.model;

/**
 *
 * @author Johw Santos
 */
public class Computador extends Equipamento{
    
    private String processador;

    public String getProcessador() {
        return processador;
    }

    public Computador(String nome, String modelo, TipoEquipamento tipo, String processador) {
        super(nome, modelo, tipo);
        this.processador = processador;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Processador: " + processador);
    }
}
