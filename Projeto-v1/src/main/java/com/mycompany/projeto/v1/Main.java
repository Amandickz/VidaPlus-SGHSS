/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import gerenciamento.GerenciamentoHospitalar;
import interfaces.TelaInicial;
import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o horário inicial:");
        int inicial = scan.nextInt();
        System.out.println("Digite o horário final:");
        int hfinal = scan.nextInt();
        System.out.println("Digite o intervalo de minutos entre uma consulta e outra:");
        int intervalo = scan.nextInt();
        
        System.out.println();
        System.out.println("---- Tabela de Horas ----");
        for(int i = inicial; i <= hfinal; i++){
            for(int j = 00; j < 60; j = j + intervalo){
                System.out.println(i + ":" + j);
            }
        }
        
        /*GerenciamentoHospitalar admHospital = new GerenciamentoHospitalar();

        TelaInicial telaInicial = new TelaInicial(admHospital);
        telaInicial.setVisible(true);*/
      
    }
}
