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
public class Enfermeiro extends ProfissionalSaude{
    
    private String coren;
    private Estado ufCOREN;
    private String dataEmissao;

    public Enfermeiro(String coren, Estado ufCOREN, String dataEmissao, TipoSanguineo tipoSanguineo, String dataAdmissao, String observaoes) {
        super(tipoSanguineo, dataAdmissao, observaoes);
        this.coren = coren;
        this.ufCOREN = ufCOREN;
        this.dataEmissao = dataEmissao;
    }

    public Enfermeiro(String coren, Estado ufCOREN, String dataEmissao, TipoSanguineo tipoSanguineo, String dataAdmissao, String observaoes, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdmissao, observaoes, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.coren = coren;
        this.ufCOREN = ufCOREN;
        this.dataEmissao = dataEmissao;
    }

    public Enfermeiro(String coren, Estado ufCOREN, String dataEmissao, TipoSanguineo tipoSanguineo, String dataAdmissao, String observaoes, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdmissao, observaoes, id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.coren = coren;
        this.ufCOREN = ufCOREN;
        this.dataEmissao = dataEmissao;
    }

    public String getCoren() {
        return coren;
    }

    public void setCoren(String coren) {
        this.coren = coren;
    }

    public Estado getUfCOREN() {
        return ufCOREN;
    }

    public void setUfCOREN(Estado ufCOREN) {
        this.ufCOREN = ufCOREN;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Override
    public String toString() {
        return "Enfermeiro{" + "coren=" + coren + ", ufCOREN=" + ufCOREN + ", dataEmissao=" + dataEmissao + '}';
    }

    
    
}
