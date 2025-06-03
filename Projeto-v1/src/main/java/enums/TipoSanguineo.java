/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Amanda
 */
public enum TipoSanguineo {
    
    A1("A+"),
    A2("A-"),
    B1("B+"),
    B2("B-"),
    O1("O+"),
    O2("O-"),
    AB1("AB+"),
    AB2("AB-");
    
    
    private String tipoSanguineo;


    TipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }
    
}
