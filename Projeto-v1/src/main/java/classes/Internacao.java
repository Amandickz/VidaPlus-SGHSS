/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Amanda
 */
public class Internacao {
    
    private int id;
    private String dataInternacao;
    private String motivoInternacao;
    private String diagnosticoInicial;
    private String planoTratamento;
    private boolean status;
    private String dataAlta;

    public Internacao() {
    }

    public Internacao(String dataInternacao, String motivoInternacao, String diagnosticoInicial, String planoTratamento, boolean status, String dataAlta) {
        this.dataInternacao = dataInternacao;
        this.motivoInternacao = motivoInternacao;
        this.diagnosticoInicial = diagnosticoInicial;
        this.planoTratamento = planoTratamento;
        this.status = status;
        this.dataAlta = dataAlta;
    }

    public Internacao(int id, String dataInternacao, String motivoInternacao, String diagnosticoInicial, String planoTratamento, boolean status, String dataAlta) {
        this.id = id;
        this.dataInternacao = dataInternacao;
        this.motivoInternacao = motivoInternacao;
        this.diagnosticoInicial = diagnosticoInicial;
        this.planoTratamento = planoTratamento;
        this.status = status;
        this.dataAlta = dataAlta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDataInternacao() {
        return dataInternacao;
    }

    public void setDataInternacao(String dataInternacao) {
        this.dataInternacao = dataInternacao;
    }

    public String getMotivoInternacao() {
        return motivoInternacao;
    }

    public void setMotivoInternacao(String motivoInternacao) {
        this.motivoInternacao = motivoInternacao;
    }

    public String getDiagnosticoInicial() {
        return diagnosticoInicial;
    }

    public void setDiagnosticoInicial(String diagnosticoInicial) {
        this.diagnosticoInicial = diagnosticoInicial;
    }

    public String getPlanoTratamento() {
        return planoTratamento;
    }

    public void setPlanoTratamento(String planoTratamento) {
        this.planoTratamento = planoTratamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }

    @Override
    public String toString() {
        return "Internacao{" + "id=" + id + ", dataInternacao=" + dataInternacao + ", motivoInternacao=" + motivoInternacao + ", diagnosticoInicial=" + diagnosticoInicial + ", planoTratamento=" + planoTratamento + ", status=" + status + ", dataAlta=" + dataAlta + '}';
    }
    
    
    
}
