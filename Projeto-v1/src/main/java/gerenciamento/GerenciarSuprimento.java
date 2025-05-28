/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.ProfissionalSaude;
import classes.Suprimento;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class GerenciarSuprimento {
    
    private int id;
    private String dataRetirada;
    private String horaRetirada;
    private ProfissionalSaude solicitante;
    private ProfissionalSaude atendente;
    private ArrayList<Suprimento> suprimentos;
    private String observacao;

    public GerenciarSuprimento() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataRetirada() {
        return dataRetirada;
    }

    public void setDataRetirada(String dataRetirada) {
        this.dataRetirada = dataRetirada;
    }

    public String getHoraRetirada() {
        return horaRetirada;
    }

    public void setHoraRetirada(String horaRetirada) {
        this.horaRetirada = horaRetirada;
    }

    public ProfissionalSaude getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(ProfissionalSaude solicitante) {
        this.solicitante = solicitante;
    }

    public ProfissionalSaude getAtendente() {
        return atendente;
    }

    public void setAtendente(ProfissionalSaude atendente) {
        this.atendente = atendente;
    }

    public ArrayList<Suprimento> getSuprimentos() {
        return suprimentos;
    }

    public void setSuprimentos(ArrayList<Suprimento> suprimentos) {
        this.suprimentos = suprimentos;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        return "GerenciarSuprimento{" + "id=" + id + ", dataRetirada=" + dataRetirada + ", horaRetirada=" + horaRetirada + ", solicitante=" + solicitante + ", atendente=" + atendente + ", suprimentos=" + suprimentos + ", observacao=" + observacao + '}';
    }
    
}
