/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Amanda
 */
public class Exame {
    
    private int id;
    private int tipo;
    private String resultado;
    private String laudo;
    private String dataExame;
    private String horaExame;

    public Exame() {
    }

    public Exame(int tipo, String resultado, String laudo, String dataExame, String horaExame) {
        this.tipo = tipo;
        this.resultado = resultado;
        this.laudo = laudo;
        this.dataExame = dataExame;
        this.horaExame = horaExame;
    }

    public Exame(int id, int tipo, String resultado, String laudo, String dataExame, String horaExame) {
        this.id = id;
        this.tipo = tipo;
        this.resultado = resultado;
        this.laudo = laudo;
        this.dataExame = dataExame;
        this.horaExame = horaExame;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getLaudo() {
        return laudo;
    }

    public void setLaudo(String laudo) {
        this.laudo = laudo;
    }

    public String getDataExame() {
        return dataExame;
    }

    public void setDataExame(String dataExame) {
        this.dataExame = dataExame;
    }

    public String getHoraExame() {
        return horaExame;
    }

    public void setHoraExame(String horaExame) {
        this.horaExame = horaExame;
    }

    @Override
    public String toString() {
        return "Exame{" + "id=" + id + ", tipo=" + tipo + ", resultado=" + resultado + ", laudo=" + laudo + ", dataExame=" + dataExame + ", horaExame=" + horaExame + '}';
    }
    
    
    
}
