/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Agenda;
import classes.Consulta;
import classes.Medico;
import enums.IntervaloConsultas;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class GerenciamentoMedico {
    
    boolean loginCheck = false;
    Medico medico;
    GerenciarAgenda gerenciarAgenda = new GerenciarAgenda();
    GerenciarConsulta gerenciarConsulta = new GerenciarConsulta();
    ArrayList<Agenda> agenda = new ArrayList<>();
    ArrayList<Consulta> consultas = new ArrayList<>();

    public GerenciamentoMedico(Medico medico) {
        this.medico = medico;
        this.agenda = this.medico.getDatasAgenda();
        this.consultas = this.medico.getConsultasMarcadas();
        
        /*this.agenda.add(new Agenda(0, "17/06/2025", "17:00", false));
        
        for(Agenda a : this.agenda){
            System.out.println(a);
        }*/
    }

    public boolean isLoginCheck() {
        return loginCheck;
    }

    public void setLoginCheck(boolean loginCheck) {
        this.loginCheck = loginCheck;
    }
    
    public ArrayList<Agenda> getAgenda() {
        return agenda;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public Medico getMedico() {
        return medico;
    }
    
    public ArrayList<Agenda> consultasDia(String dataAtual){
        System.out.println("Data atual: " + dataAtual);
        ArrayList<Agenda> listaDeConsultas = new ArrayList<>();
        if(agenda != null){
            for(Agenda a : agenda){
                if(a.getData().equals(dataAtual)){
                    if(!a.isStatus()){
                        listaDeConsultas.add(a);
                    }
                }
            }
        }
        return listaDeConsultas;
    }
    
    public ArrayList<Agenda> criaNovasDatas(String data, String horaInicial, String horaFinal, IntervaloConsultas intervalo){
        ArrayList<Agenda> novasDatas = gerenciarAgenda.gerarNovasConsultas(data, horaInicial, horaFinal, intervalo);
        if(novasDatas.isEmpty()){
            return null;
        }
        return novasDatas;
    }
    
    public boolean addNovasDatas(ArrayList<Agenda> novasDatas){
        if(agenda != null){
            for(Agenda a : agenda){
                System.out.println(a);
            }
        }
        agenda = gerenciarAgenda.adicionarAgenda(getAgenda(), novasDatas);
        return true;
    }
    
}
