/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.SinalVital;

/**
 *
 * @author Amanda
 */
public class GerenciarSVInternacao {
    
    private int id;
    private String dataChecagem;
    private String horaChecagem;
    private SinalVital sinalVital;

    public GerenciarSVInternacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataChecagem() {
        return dataChecagem;
    }

    public void setDataChecagem(String dataChecagem) {
        this.dataChecagem = dataChecagem;
    }

    public String getHoraChecagem() {
        return horaChecagem;
    }

    public void setHoraChecagem(String horaChecagem) {
        this.horaChecagem = horaChecagem;
    }

    public SinalVital getSinalVital() {
        return sinalVital;
    }

    public void setSinalVital(SinalVital sinalVital) {
        this.sinalVital = sinalVital;
    }

    @Override
    public String toString() {
        return "GerenciarSVInternacao{" + "id=" + id + ", dataChecagem=" + dataChecagem + ", horaChecagem=" + horaChecagem + ", sinalVital=" + sinalVital + '}';
    }
    
    
    
}
