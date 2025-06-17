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

    public GerenciarAgenda() {
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
                consulta.setStatus(true);
                listaHorarios.add(consulta);
                cont++;
            }
        }
        return listaHorarios;
    }
    
    public ArrayList<Agenda> adicionarAgenda(ArrayList<Agenda> agendaAtual, ArrayList<Agenda> novosHorarios){
        if(agendaAtual == null){
            agendaAtual = new ArrayList<>();
            for(Agenda a : novosHorarios){
                agendaAtual.add(a);
            }
        } else {
            for(Agenda a : novosHorarios){
                a.setId(agendaAtual.size() + 1);
                agendaAtual.add(a);
            }
        }
        
        System.out.println();
        System.out.println("--- Agenda Médica ---");
        for(Agenda a : agendaAtual){
            System.out.println(a);
        }
        
        return agendaAtual;
    }
    
}
