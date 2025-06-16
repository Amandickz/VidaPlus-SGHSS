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
    
    public ArrayList<Agenda> gerarNovasConsultas(String data, String horaInicial, String horaFinal, IntervaloConsultas intervalo){
        ArrayList<Agenda> listaHorarios = new ArrayList<>();
        int tempo = 0, cont = 0;
        switch (intervalo) {
            case UM -> {
                tempo = 10;
            }
            case DOIS -> {
                tempo = 15;
            }
            case TRES -> {
                tempo = 30;
            }
            case QUATRO -> {
                tempo = 45;
            }
            case CINCO -> {
                tempo = 60; 
            }
            default -> throw new AssertionError();
        }
        String[] quebraInicio = horaInicial.split(":");
        String[] quebraFim = horaFinal.split(":");
        for(int i = Integer.parseInt(quebraInicio[0]); i < Integer.parseInt(quebraFim[0]); i++){//Contagem Hora
            for(int j = Integer.parseInt(quebraInicio[1]); j < 60; j = j + tempo){//Contagem Minutos
                Agenda consulta = new Agenda();
                consulta.setId(cont);
                consulta.setData(data);
                if(j < 9){
                    consulta.setHora(i + ":" + j + "0");
                } else {
                    consulta.setHora(i + ":" + j);
                }
                consulta.setStatus(false);
                listaHorarios.add(consulta);
                cont++;
            }
        }
        return listaHorarios;
    }
    
}
