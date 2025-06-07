
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Amanda
 */
public enum Nacionalidade {
    
    UM("BRASILEIRO"),
    DOIS("ESTRANGEIRO"),
    TRES("NATURALIZADO");
    
    private String nacionalidades;

    Nacionalidade(String nacionalidades) {
        this.nacionalidades = nacionalidades;
    }

    public String getNacionalidades() {
        return nacionalidades;
    }
    
}
