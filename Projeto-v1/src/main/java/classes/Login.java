/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.TipoConta;

/**
 *
 * @author Amanda
 */
public class Login {
    
    private int id;
    private String usuario;
    private String senha;
    private TipoConta tipoConta;

    public Login() {
    }

    public Login(String usuario, String senha, TipoConta tipoConta) {
        this.usuario = usuario;
        this.senha = senha;
        this.tipoConta = tipoConta;
    }

    public Login(int id, String usuario, String senha, TipoConta tipoConta) {
        this.id = id;
        this.usuario = usuario;
        this.senha = senha;
        this.tipoConta = tipoConta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "Login{" + "id=" + id + ", usuario=" + usuario + ", senha=" + senha + ", tipoConta=" + tipoConta + '}';
    }
    
    

}
