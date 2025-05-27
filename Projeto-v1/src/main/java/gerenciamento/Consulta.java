/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

/**
 *
 * @author Amanda
 */
public class Consulta {
    
    private int tipo;
    private String queixaPrincipal;
    private String sintomas;
    private String historicoMedico;
    private String historicoFamiliar;

    public Consulta() {
    }

    public Consulta(int tipo, String queixaPrincipal, String sintomas, String historicoMedico, String historicoFamiliar) {
        this.tipo = tipo;
        this.queixaPrincipal = queixaPrincipal;
        this.sintomas = sintomas;
        this.historicoMedico = historicoMedico;
        this.historicoFamiliar = historicoFamiliar;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getQueixaPrincipal() {
        return queixaPrincipal;
    }

    public void setQueixaPrincipal(String queixaPrincipal) {
        this.queixaPrincipal = queixaPrincipal;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getHistoricoMedico() {
        return historicoMedico;
    }

    public void setHistoricoMedico(String historicoMedico) {
        this.historicoMedico = historicoMedico;
    }

    public String getHistoricoFamiliar() {
        return historicoFamiliar;
    }

    public void setHistoricoFamiliar(String historicoFamiliar) {
        this.historicoFamiliar = historicoFamiliar;
    }

    @Override
    public String toString() {
        return "Consulta{" + "tipo=" + tipo + ", queixaPrincipal=" + queixaPrincipal + ", sintomas=" + sintomas + ", historicoMedico=" + historicoMedico + ", historicoFamiliar=" + historicoFamiliar + '}';
    }
    
    
    
}
