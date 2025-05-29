/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

/**
 *
 * @author Amanda
 */
public class GerenciarInterncao {
    
    private int id;
    private String evolucao;
    private int estado;
    private String sataChecagem;
    private String observacoes;

    public GerenciarInterncao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEvolucao() {
        return evolucao;
    }

    public void setEvolucao(String evolucao) {
        this.evolucao = evolucao;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getSataChecagem() {
        return sataChecagem;
    }

    public void setSataChecagem(String sataChecagem) {
        this.sataChecagem = sataChecagem;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "GerenciarInterncao{" + "id=" + id + ", evolucao=" + evolucao + ", estado=" + estado + ", sataChecagem=" + sataChecagem + ", observacoes=" + observacoes + '}';
    }
    
    
    
}
