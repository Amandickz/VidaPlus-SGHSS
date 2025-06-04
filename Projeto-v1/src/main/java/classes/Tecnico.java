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
public class Tecnico extends ProfissionalSaude{
    
    private String coren;
    private Estado ufCoren;
    private String dataEmissao;
    private String dataValidade;

    public Tecnico(String coren, Estado ufCoren, String dataEmissao, String dataValidade, TipoSanguineo tipoSanguineo, String dataAdmissao, String observaoes) {
        super(tipoSanguineo, dataAdmissao, observaoes);
        this.coren = coren;
        this.ufCoren = ufCoren;
        this.dataEmissao = dataEmissao;
        this.dataValidade = dataValidade;
    }

    public Tecnico(String coren, Estado ufCoren, String dataEmissao, String dataValidade, TipoSanguineo tipoSanguineo, String dataAdmissao, String observaoes, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdmissao, observaoes, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.coren = coren;
        this.ufCoren = ufCoren;
        this.dataEmissao = dataEmissao;
        this.dataValidade = dataValidade;
    }

    public Tecnico(String coren, Estado ufCoren, String dataEmissao, String dataValidade, TipoSanguineo tipoSanguineo, String dataAdmissao, String observaoes, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdmissao, observaoes, id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.coren = coren;
        this.ufCoren = ufCoren;
        this.dataEmissao = dataEmissao;
        this.dataValidade = dataValidade;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public Estado getUfCoren() {
        return ufCoren;
    }

    public void setUfCoren(Estado ufCoren) {
        this.ufCoren = ufCoren;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Tecnico{" + "coren=" + coren + ", ufCoren=" + ufCoren + ", dataEmissao=" + dataEmissao + ", dataValidade=" + dataValidade + '}';
    }
    
    
    
}
