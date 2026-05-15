/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemausuario.main;

import br.edu.etec.sistemausuario.model.NivelAcesso;
import br.edu.etec.sistemausuario.model.Usuario;

/**
 *
 * @author Johw Santos
 */
public class Main {

    public static void main(String[] args) {

        Usuario u1 = new Usuario("Admin", "1234", NivelAcesso.ADMIN);

        boolean autenticado = u1.autenticarSenha("1234");

        if (autenticado) {
            System.out.println("Usuario autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticacao.");
        }

        System.out.println("Nivel de acesso: " + u1.getNivel());
    }
}

