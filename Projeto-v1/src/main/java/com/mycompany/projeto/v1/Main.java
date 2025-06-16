/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import gerenciamento.GerenciamentoHospitalar;
import gerenciamento.GerenciarAgenda;
import interfaces.TelaInicial;
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
        
        new TelaInicialMedico(new GerenciarAgenda(), null).setVisible(true);

    }
}