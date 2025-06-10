/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Anamnese;
import classes.AnamneseFeminina;
import classes.Paciente;
import enums.Sexo;

/**
 *
 * @author Amanda
 */
public class GerenciamentoPaciente {
    
    Paciente paciente;
    GerenciamentoHospitalar admHospitalar;
    Anamnese anamnese;
    AnamneseFeminina anamneseFeminina;

    public GerenciamentoPaciente(Paciente paciente, GerenciamentoHospitalar admHospitalar) {
        this.paciente = paciente;
        this.admHospitalar = admHospitalar;
    }
    
    public boolean novaAnamnese(Anamnese anamnese, AnamneseFeminina anamneseFeminina){
        
        return true;
    }
    
    public Sexo retornaSexo(){
        return paciente.getSexo();
    }
    
}
