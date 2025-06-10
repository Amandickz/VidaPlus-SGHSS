/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Paciente;
import enums.Sexo;

/**
 *
 * @author Amanda
 */
public class GerenciamentoPaciente {
    
    Paciente paciente;

    public GerenciamentoPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public boolean novaAnamnese(){
        
        return true;
    }
    
    public Sexo retornaSexo(){
        return paciente.getSexo();
    }
    
}
