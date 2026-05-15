/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.sistemausuario.model;

/**
 *
 * @author Johw Santos
 */
public class Usuario {

    private String login;
    private String senha;
    private NivelAcesso nivel;
    private boolean ativo;

    public Usuario(String login, String senha, NivelAcesso nivel) {
        this.login = login;
        this.senha = senha;
        this.nivel = nivel;
        this.ativo = true;
    }

    public boolean autenticarSenha(String senha) {
        return this.senha.equals(senha) && ativo;
    }

    public void desativar() {
        ativo = false;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public String getLogin() {
        return login;
    }

    public void exibirInfo() {
        System.out.println("Usuario: " + getLogin());
        System.out.println("Senha: " + senha);
        System.out.println("Nivel de Acesso: " + getNivel());
    }
}