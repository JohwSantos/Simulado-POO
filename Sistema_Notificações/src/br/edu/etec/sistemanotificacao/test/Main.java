/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.etec.sistemanotificacao.test;

import br.edu.etec.sistemanotificacao.model.Email;
import br.edu.etec.sistemanotificacao.model.Notificação;
import br.edu.etec.sistemanotificacao.model.SMS;
import br.edu.etec.sistemanotificacao.model.TipoNotificação;

/**
 *
 * @author Johw Santos
 */
public class Main {
    public static void main(String[] args) {
        
        Notificação n1 = new SMS("\n11951262971",
                "Seu produto ja esta em rota para entrega em seu endereco",
                TipoNotificação.SMS);
        
        Notificação n2 = new Email("\njohwsantos@gmail.com",
                "Boa tarde, Jonathan "
                        + "\nSegue em anexo arquivos solicitados "
                            + "para analise."
                , TipoNotificação.EMAIL);
        
        n1.preparar();
        n1.enviar();
        System.out.println("\n----------\n");
        n2.preparar();
        n2.enviar();
    }
    
}
