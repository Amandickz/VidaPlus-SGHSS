/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Amanda
 */
public enum RacaCorEtnia {
    
    UM("BRANCA"),
    DOIS("PRETA"),
    TRES("PARDA"),
    QUATRO("AMARELA"),
    CINCO("INDÍGENA");
    
    private String racaCorEtnia;

    RacaCorEtnia(String racaCorEtnia) {
        this.racaCorEtnia = racaCorEtnia;
    }

    public String getRacaCorEtnia() {
        return racaCorEtnia;
    }

    
    
}
