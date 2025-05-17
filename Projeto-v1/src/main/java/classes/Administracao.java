/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Amanda
 */
public class Administracao {
    
    private int id;
    private String cnpj;
    private String dataDeAbertura;
    private String razaoSocial;

    public Administracao() {
    }

    public Administracao(int id, String cnpj, String dataDeAbertura, String razaoSocial) {
        this.id = id;
        this.cnpj = cnpj;
        this.dataDeAbertura = dataDeAbertura;
        this.razaoSocial = razaoSocial;
    }

    public Administracao(String cnpj, String dataDeAbertura, String razaoSocial) {
        this.cnpj = cnpj;
        this.dataDeAbertura = dataDeAbertura;
        this.razaoSocial = razaoSocial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Administracao{" + "id=" + id + ", cnpj=" + cnpj + ", dataDeAbertura=" + dataDeAbertura + ", razaoSocial=" + razaoSocial + '}';
    }    
    
}
