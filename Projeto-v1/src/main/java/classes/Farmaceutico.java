/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.CategoriaProfissional;
import enums.Estado;
import enums.Nacionalidade;
import enums.RacaCorEtnia;
import enums.Sexo;
import enums.TipoSanguineo;

/**
 *
 * @author Amanda
 */
public class Farmaceutico extends ProfissionalSaude{
    
    private String crf;
    private Estado ufCRF;
    private CategoriaProfissional categoriaProfissional;
    private String dataFormacao;
    private String dataExpedicao;

    public Farmaceutico(String crf, Estado ufCRF, CategoriaProfissional categoriaProfissional, String dataFormacao, String dataExpedicao, TipoSanguineo tipoSanguineo, String dataAdmissao, String observaoes) {
        super(tipoSanguineo, dataAdmissao, observaoes);
        this.crf = crf;
        this.ufCRF = ufCRF;
        this.categoriaProfissional = categoriaProfissional;
        this.dataFormacao = dataFormacao;
        this.dataExpedicao = dataExpedicao;
    }

    public Farmaceutico(String crf, Estado ufCRF, CategoriaProfissional categoriaProfissional, String dataFormacao, String dataExpedicao, TipoSanguineo tipoSanguineo, String dataAdmissao, String observaoes, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdmissao, observaoes, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.crf = crf;
        this.ufCRF = ufCRF;
        this.categoriaProfissional = categoriaProfissional;
        this.dataFormacao = dataFormacao;
        this.dataExpedicao = dataExpedicao;
    }

    public Farmaceutico(String crf, Estado ufCRF, CategoriaProfissional categoriaProfissional, String dataFormacao, String dataExpedicao, TipoSanguineo tipoSanguineo, String dataAdmissao, String observaoes, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdmissao, observaoes, id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.crf = crf;
        this.ufCRF = ufCRF;
        this.categoriaProfissional = categoriaProfissional;
        this.dataFormacao = dataFormacao;
        this.dataExpedicao = dataExpedicao;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public Estado getUfCRF() {
        return ufCRF;
    }

    public void setUfCRF(Estado ufCRF) {
        this.ufCRF = ufCRF;
    }

    public CategoriaProfissional getCategoriaProfissional() {
        return categoriaProfissional;
    }

    public void setCategoriaProfissional(CategoriaProfissional categoriaProfissional) {
        this.categoriaProfissional = categoriaProfissional;
    }

    public String getDataFormacao() {
        return dataFormacao;
    }

    public void setDataFormacao(String dataFormacao) {
        this.dataFormacao = dataFormacao;
    }

    public String getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    @Override
    public String toString() {
        return "Farmaceutico{" + "crf=" + crf + ", ufCRF=" + ufCRF + ", categoriaProfissional=" + categoriaProfissional + ", dataFormacao=" + dataFormacao + ", dataExpedicao=" + dataExpedicao + '}';
    }
    
    
}
