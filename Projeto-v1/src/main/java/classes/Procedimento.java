/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Amanda
 */
public class Procedimento {
    
    private int id;
    private char tipo;
    private int suprimento;
    private int quantidade;
    private String anotacoes;
    private String dataProcedimento;
    private String horaProcedimento;

    public Procedimento() {
    }

    public Procedimento(char tipo, int suprimento, int quantidade, String anotacoes, String dataProcedimento, String horaProcedimento) {
        this.tipo = tipo;
        this.suprimento = suprimento;
        this.quantidade = quantidade;
        this.anotacoes = anotacoes;
        this.dataProcedimento = dataProcedimento;
        this.horaProcedimento = horaProcedimento;
    }

    public Procedimento(int id, char tipo, int suprimento, int quantidade, String anotacoes, String dataProcedimento, String horaProcedimento) {
        this.id = id;
        this.tipo = tipo;
        this.suprimento = suprimento;
        this.quantidade = quantidade;
        this.anotacoes = anotacoes;
        this.dataProcedimento = dataProcedimento;
        this.horaProcedimento = horaProcedimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getSuprimento() {
        return suprimento;
    }

    public void setSuprimento(int suprimento) {
        this.suprimento = suprimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getDataProcedimento() {
        return dataProcedimento;
    }

    public void setDataProcedimento(String dataProcedimento) {
        this.dataProcedimento = dataProcedimento;
    }

    public String getHoraProcedimento() {
        return horaProcedimento;
    }

    public void setHoraProcedimento(String horaProcedimento) {
        this.horaProcedimento = horaProcedimento;
    }

    @Override
    public String toString() {
        return "Procedimento{" + "id=" + id + ", tipo=" + tipo + ", suprimento=" + suprimento + ", quantidade=" + quantidade + ", anotacoes=" + anotacoes + ", dataProcedimento=" + dataProcedimento + ", horaProcedimento=" + horaProcedimento + '}';
    }

    
    
}
