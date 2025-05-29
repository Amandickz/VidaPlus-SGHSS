/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Consulta;
import classes.Internacao;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class GerenciarProntuario {
    
    private int id;
    private String dataAtualizacao;
    private ArrayList<Consulta> consultas;
    private ArrayList<Internacao> internacaos;

    public GerenciarProntuario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(String dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public ArrayList<Internacao> getInternacaos() {
        return internacaos;
    }

    public void setInternacaos(ArrayList<Internacao> internacaos) {
        this.internacaos = internacaos;
    }

    @Override
    public String toString() {
        return "GerernciarProntuario{" + "id=" + id + ", dataAtualizacao=" + dataAtualizacao + ", consultas=" + consultas + ", internacaos=" + internacaos + '}';
    }
    
    
    
}
