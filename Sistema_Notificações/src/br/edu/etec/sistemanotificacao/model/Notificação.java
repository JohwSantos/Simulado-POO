/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemanotificacao.model;

/**
 *
 * @author Johw Santos
 */
public class Notificação {
    
    String destinatario;
    String mensagem;
    private TipoNotificação tipo;
    
    public Notificação(String destinatario, String mensagem, TipoNotificação tipo) {
        this.destinatario = destinatario;
        this.mensagem = mensagem;
        this.tipo = tipo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getMensagem() {
        return mensagem;
    }

    public TipoNotificação getTipo() {
        return tipo;
    }
    
    public void preparar(){
        System.out.println("Preparando notificacao" + destinatario);
    }
    
    public void enviar(){
        System.out.println("Enviando notificacao");
    }
}
