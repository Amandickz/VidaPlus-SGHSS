/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import gerenciamento.GerenciamentoHospitalar;
import interfaces.TelaInicial;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) {
        
        GerenciamentoHospitalar admHospital = new GerenciamentoHospitalar();

        TelaInicial telaInicial = new TelaInicial(admHospital);
        telaInicial.setVisible(true);
      
    }
}
