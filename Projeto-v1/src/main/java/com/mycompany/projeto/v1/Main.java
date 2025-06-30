/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import classes.Medico;
import enums.Especialidades;
import enums.Estado;
import enums.Nacionalidade;
import enums.RacaCorEtnia;
import enums.Sexo;
import enums.TipoSanguineo;
import gerenciamento.GerenciamentoMedico;
import interfaces.TelaInicialMedico;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) {

        /*GerenciamentoHospitalar admHospitalar = new GerenciamentoHospitalar();
        admHospitalar.setAdministracao();
        
        new TelaInicial(admHospitalar).setVisible(true);*/
        
        Medico medico = new Medico("12345678-9", Estado.ACRE, "", Especialidades.UM, TipoSanguineo.A1, "", "", "", "Amanda", "", "", Sexo.F, "", "", "", Estado.ACRE, Nacionalidade.DOIS, RacaCorEtnia.UM, "", "", 0, 0);
        
        new TelaInicialMedico(new GerenciamentoMedico(medico)).setVisible(true);

    }
}