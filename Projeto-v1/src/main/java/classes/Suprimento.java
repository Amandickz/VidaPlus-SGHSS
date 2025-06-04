/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.TipoSuprimento;

/**
 *
 * @author Amanda
 */
public class Suprimento {
    
    private int id;
    private TipoSuprimento tipo;
    private String nome;
    private int quantidadeEstoque;
    private int valorUnitario;

    public Suprimento() {
    }

    public Suprimento(TipoSuprimento tipo, String nome, int quantidadeEstoque, int valorUnitario) {
        this.tipo = tipo;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
    }

    public Suprimento(int id, TipoSuprimento tipo, String nome, int quantidadeEstoque, int valorUnitario) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoSuprimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoSuprimento tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(int valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Suprimento{" + "id=" + id + ", tipo=" + tipo + ", nome=" + nome + ", quantidadeEstoque=" + quantidadeEstoque + ", valorUnitario=" + valorUnitario + '}';
    }
    
    
    
}
