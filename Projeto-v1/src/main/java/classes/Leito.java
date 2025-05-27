/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Amanda
 */
public class Leito {
    
    private int id;
    private int numero;
    private int tipo;
    private double valor;
    private boolean status;
    private String anotacoes;

    public Leito() {
    }

    public Leito(int numero, int tipo, double valor, boolean status, String anotacoes) {
        this.numero = numero;
        this.tipo = tipo;
        this.valor = valor;
        this.status = status;
        this.anotacoes = anotacoes;
    }

    public Leito(int id, int numero, int tipo, double valor, boolean status, String anotacoes) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.valor = valor;
        this.status = status;
        this.anotacoes = anotacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    @Override
    public String toString() {
        return "Leito{" + "id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", valor=" + valor + ", status=" + status + ", anotacoes=" + anotacoes + '}';
    }
    
    
    
}
