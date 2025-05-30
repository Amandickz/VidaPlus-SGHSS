/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import enums.TiposLeitos;
import gerenciamento.AdministrarHospital;
import interfaces.TelaAdministrador;
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
        
        
        AdministrarHospital admHospital = new AdministrarHospital();
        TelaAdministrador telaAdministrador = new TelaAdministrador(admHospital);
        telaAdministrador.setVisible(true);
        
        /*for(TiposLeitos tl : TiposLeitos.values()){
            System.out.println(tl.getTipoLeito());
        }*/
        
    }
}
