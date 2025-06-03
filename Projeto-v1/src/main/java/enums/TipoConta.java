/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Amanda
 */
public enum TipoConta {
    
    A("ADMINISTRADOR"),
    P("PACIENTE"),
    M("MÉDICO"),
    E("ENFERMEIRO"),
    T("TÉCNICO"),
    F("FARMACÊUTICO");
    
    private String tipoConta;

    TipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }
    
}
