/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Amanda
 */
public enum Matriz {
    
    UM("MATRIZ"),
    DOIS("FILIAL");
    
    private String matriz;

    Matriz(String matriz) {
        this.matriz = matriz;
    }

    public String getMatriz() {
        return matriz;
    }
    
    
    
}
