/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Agenda;
import enums.IntervaloConsultas;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class GerenciarAgenda {
    
    ArrayList<Agenda> datasDisponiveis = new ArrayList<>();

    public GerenciarAgenda() {
    }

    public ArrayList<Agenda> getDatasDisponiveis() {
        return datasDisponiveis;
    }
    
    public ArrayList<Agenda> gerarNovasConsultas(String horaInicial, String horaFinal, IntervaloConsultas intervalo){
        String[] quebraInicio = horaInicial.split(":");
        String[] quebraFim = horaFinal.split(":");
        System.out.println();
        System.out.println("inicio parte 1: " + quebraInicio[0]);
        System.out.println("inicio parte 2: " + quebraInicio[1]);
        for(int i = Integer.parseInt(quebraInicio[0]); i < Integer.parseInt(quebraFim[0]); i++){//Contagem Hora
            for(int j = Integer.parseInt(quebraInicio[1]); j < 60; j = j + 15){//Contagem Minutos
                if(j < 9){
                    System.out.println(i + ":" + j + "0");
                } else {
                    System.out.println(i + ":" + j);
                }
            }
        }
        return null;
    }
    
}
