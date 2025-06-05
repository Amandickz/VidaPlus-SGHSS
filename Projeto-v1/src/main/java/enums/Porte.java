/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Amanda
 */
public enum Porte {
    
    UM("MICROEMPRESA"),
    TRES("EMPRESA DE PEQUENO PORTE"),
    CINCO("DEMAIS");
    
    private String porte;

    Porte(String porte) {
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }
    
    
    
}
