/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import enums.TipoLeito;
import gerenciamento.GerenciamentoHospitalar;
import interfaces.TelaInicialAdministrador;
import interfaces.TelaCadastroLeito;
import interfaces.TelaInicial;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) {
        
        /*TelaInicial telaInicial = new TelaInicial();
        telaInicial.setLocationRelativeTo(null);
        telaInicial.setVisible(true);*/
        
        /*TelaCadastroLeito telaLeito = new TelaCadastroLeito();
        telaLeito.setLocationRelativeTo(null);
        telaLeito.setVisible(true);*/
        
        
        GerenciamentoHospitalar admHospital = new GerenciamentoHospitalar();
        TelaInicialAdministrador telaAdministrador = new TelaInicialAdministrador(admHospital);
        telaAdministrador.setVisible(true);
        
        /*for(TipoLeito tl : TipoLeito.values()){
            System.out.println(tl.getTipoLeito());
        }*/
        
    }
}
