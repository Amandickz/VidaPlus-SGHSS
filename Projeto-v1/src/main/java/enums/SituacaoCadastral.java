/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Amanda
 */
public enum SituacaoCadastral {
    
    UM("NULO"),
    DOIS("ATIVA"),
    TRES("SUSPENSA"),
    QUATRO("INAPTA"),
    CINCO("ATIVA NÃO REGULAR"),
    OITO("BAIXADA");
    
    private String situacaoCadastral;

    SituacaoCadastral(String situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }
    
}
