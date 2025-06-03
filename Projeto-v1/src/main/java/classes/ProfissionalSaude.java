/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Estado;
import enums.Nacionalidade;
import enums.RacaCorEtnia;
import enums.Sexo;
import enums.TipoSanguineo;

/**
 *
 * @author Amanda
 */
public class ProfissionalSaude extends Pessoa{
    
    private TipoSanguineo tipoSanguineo;
    private String dataAdminissao;
    private String observaoes;

    public ProfissionalSaude(TipoSanguineo tipoSanguineo, String dataAdminissao, String observaoes) {
        this.tipoSanguineo = tipoSanguineo;
        this.dataAdminissao = dataAdminissao;
        this.observaoes = observaoes;
    }

    public ProfissionalSaude(TipoSanguineo tipoSanguineo, String dataAdminissao, String observaoes, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.tipoSanguineo = tipoSanguineo;
        this.dataAdminissao = dataAdminissao;
        this.observaoes = observaoes;
    }

    public ProfissionalSaude(TipoSanguineo tipoSanguineo, String dataAdminissao, String observaoes, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.tipoSanguineo = tipoSanguineo;
        this.dataAdminissao = dataAdminissao;
        this.observaoes = observaoes;
    }

    public TipoSanguineo getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(TipoSanguineo tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
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
        return "ProfissionalSaude{" + "tipoSanguineo=" + tipoSanguineo + ", dataAdminissao=" + dataAdminissao + ", observaoes=" + observaoes + '}';
    }

    
    
}
