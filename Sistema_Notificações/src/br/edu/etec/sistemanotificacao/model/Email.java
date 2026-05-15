/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemanotificacao.model;

/**
 *
 * @author Johw Santos
 */
public class Email extends Notificação{
    
    public Email(String destinatario, String mensagem, TipoNotificação tipo) {
        super(destinatario, mensagem, tipo);
    }
    @Override
    public void enviar(){
        System.out.println("Enviando EMAIL para: " + destinatario);
        System.out.println("Mensagem: " + mensagem);
    }
}
