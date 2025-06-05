/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.DisponibilidadeLeito;
import enums.TipoLeito;

/**
 *
 * @author Amanda
 */
public class Leito {
    
    private int id;
    private int numero;
    private TipoLeito tipo;
    private int capacidade;
    private double valor;
    private DisponibilidadeLeito disponibilidade;
    private String observacoes;

    public Leito() {
    }

    public Leito(int numero, TipoLeito tipo, int capacidade, double valor, DisponibilidadeLeito disponibilidade, String observacoes) {
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valor = valor;
        this.disponibilidade = disponibilidade;
        this.observacoes = observacoes;
    }

    public Leito(int id, int numero, TipoLeito tipo, int capacidade, double valor, DisponibilidadeLeito disponibilidade, String observacoes) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.valor = valor;
        this.disponibilidade = disponibilidade;
        this.observacoes = observacoes;
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

    public TipoLeito getTipo() {
        return tipo;
    }

    public void setTipo(TipoLeito tipo) {
        this.tipo = tipo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public DisponibilidadeLeito getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(DisponibilidadeLeito disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "Leito{" + "id=" + id + ", numero=" + numero + ", tipo=" + tipo + ", capacidade=" + capacidade + ", valor=" + valor + ", disponibilidade=" + disponibilidade + ", observacoes=" + observacoes + '}';
    }
    
    
    
}
