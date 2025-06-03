/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Estado;
import enums.Nacionalidade;
import enums.RacaCorEtnia;
import enums.Sexo;

/**
 *
 * @author Amanda
 */
public class ProfissionalSaude extends Pessoa{
    
    private String grupoSanguineo;
    private String dataAdminissao;
    private String observaoes;

    public ProfissionalSaude(String grupoSanguineo, String dataAdminissao, String observaoes) {
        this.grupoSanguineo = grupoSanguineo;
        this.dataAdminissao = dataAdminissao;
        this.observaoes = observaoes;
    }

    public ProfissionalSaude(String grupoSanguineo, String dataAdminissao, String observaoes, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.grupoSanguineo = grupoSanguineo;
        this.dataAdminissao = dataAdminissao;
        this.observaoes = observaoes;
    }

    public ProfissionalSaude(String grupoSanguineo, String dataAdminissao, String observaoes, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.grupoSanguineo = grupoSanguineo;
        this.dataAdminissao = dataAdminissao;
        this.observaoes = observaoes;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public String getDataAdminissao() {
        return dataAdminissao;
    }

    public void setDataAdminissao(String dataAdminissao) {
        this.dataAdminissao = dataAdminissao;
    }

    public String getObservaoes() {
        return observaoes;
    }

    public void setObservaoes(String observaoes) {
        this.observaoes = observaoes;
    }

    @Override
    public String toString() {
        return "ProfissionalSaude{" + "grupoSanguineo=" + grupoSanguineo + ", dataAdminissao=" + dataAdminissao + ", observaoes=" + observaoes + '}';
    }
    
    
    
}
