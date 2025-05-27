/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Amanda
 */
public class SinalVital {
    
    private int id;
    private int pressaoSistolica;
    private int pressaoDiastolica;
    private int frequenciaCardiaca;
    private double temperatura;
    private double peso;
    private int altura;
    private double imc;
    private String anotacoes;

    public SinalVital() {
    }

    public SinalVital(int pressaoSistolica, int pressaoDiastolica, int frequenciaCardiaca, double temperatura, double peso, int altura, double imc, String anotacoes) {
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.temperatura = temperatura;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.anotacoes = anotacoes;
    }

    public SinalVital(int id, int pressaoSistolica, int pressaoDiastolica, int frequenciaCardiaca, double temperatura, double peso, int altura, double imc, String anotacoes) {
        this.id = id;
        this.pressaoSistolica = pressaoSistolica;
        this.pressaoDiastolica = pressaoDiastolica;
        this.frequenciaCardiaca = frequenciaCardiaca;
        this.temperatura = temperatura;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.anotacoes = anotacoes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPressaoSistolica() {
        return pressaoSistolica;
    }

    public void setPressaoSistolica(int pressaoSistolica) {
        this.pressaoSistolica = pressaoSistolica;
    }

    public int getPressaoDiastolica() {
        return pressaoDiastolica;
    }

    public void setPressaoDiastolica(int pressaoDiastolica) {
        this.pressaoDiastolica = pressaoDiastolica;
    }

    public int getFrequenciaCardiaca() {
        return frequenciaCardiaca;
    }

    public void setFrequenciaCardiaca(int frequenciaCardiaca) {
        this.frequenciaCardiaca = frequenciaCardiaca;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    @Override
    public String toString() {
        return "SinalVital{" + "id=" + id + ", pressaoSistolica=" + pressaoSistolica + ", pressaoDiastolica=" + pressaoDiastolica + ", frequenciaCardiaca=" + frequenciaCardiaca + ", temperatura=" + temperatura + ", peso=" + peso + ", altura=" + altura + ", imc=" + imc + ", anotacoes=" + anotacoes + '}';
    }
    
    
    
}
