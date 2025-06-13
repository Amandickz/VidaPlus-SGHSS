/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Agenda;
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
    
    public boolean addNovaData(String data, String hora){
        return true;
    }
    
}
