/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Amanda
 */
public enum CadastroPaciente {
    
    UM("ATIVO"),
    DOIS("EM ESPERA"),
    TRES("INATIVO");
    
    private String cadastroPaciente;

    private CadastroPaciente(String cadastroPaciente) {
        this.cadastroPaciente = cadastroPaciente;
    }

    public String getCadastroPaciente() {
        return cadastroPaciente;
    }
        
}
