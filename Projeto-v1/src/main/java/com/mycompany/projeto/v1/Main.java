/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import interfaces.TelaAdministrador;
import interfaces.TelaCadastroLeito;
import interfaces.TelaInicial;

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
        
        TelaAdministrador telaAdministrador = new TelaAdministrador();
        telaAdministrador.setVisible(true);
        
    }
}
