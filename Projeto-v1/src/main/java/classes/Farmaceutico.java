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
public class Farmaceutico extends ProfissionalSaude{
    
    private String crf;
    private String ufCRF;
    private String categoriaProfissional;
    private String instituicaoDiploma;
    private String dataConclusao;
    private String dataExpedicao;

    public Farmaceutico(String crf, String ufCRF, String categoriaProfissional, String instituicaoDiploma, String dataConclusao, String dataExpedicao, TipoSanguineo tipoSanguineo, String dataAdminissao, String observaoes) {
        super(tipoSanguineo, dataAdminissao, observaoes);
        this.crf = crf;
        this.ufCRF = ufCRF;
        this.categoriaProfissional = categoriaProfissional;
        this.instituicaoDiploma = instituicaoDiploma;
        this.dataConclusao = dataConclusao;
        this.dataExpedicao = dataExpedicao;
    }

    public Farmaceutico(String crf, String ufCRF, String categoriaProfissional, String instituicaoDiploma, String dataConclusao, String dataExpedicao, TipoSanguineo tipoSanguineo, String dataAdminissao, String observaoes, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdminissao, observaoes, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.crf = crf;
        this.ufCRF = ufCRF;
        this.categoriaProfissional = categoriaProfissional;
        this.instituicaoDiploma = instituicaoDiploma;
        this.dataConclusao = dataConclusao;
        this.dataExpedicao = dataExpedicao;
    }

    public Farmaceutico(String crf, String ufCRF, String categoriaProfissional, String instituicaoDiploma, String dataConclusao, String dataExpedicao, TipoSanguineo tipoSanguineo, String dataAdminissao, String observaoes, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdminissao, observaoes, id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.crf = crf;
        this.ufCRF = ufCRF;
        this.categoriaProfissional = categoriaProfissional;
        this.instituicaoDiploma = instituicaoDiploma;
        this.dataConclusao = dataConclusao;
        this.dataExpedicao = dataExpedicao;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
    }

    public String getUfCRF() {
        return ufCRF;
    }

    public void setUfCRF(String ufCRF) {
        this.ufCRF = ufCRF;
    }

    public String getCategoriaProfissional() {
        return categoriaProfissional;
    }

    public void setCategoriaProfissional(String categoriaProfissional) {
        this.categoriaProfissional = categoriaProfissional;
    }

    public String getInstituicaoDiploma() {
        return instituicaoDiploma;
    }

    public void setInstituicaoDiploma(String instituicaoDiploma) {
        this.instituicaoDiploma = instituicaoDiploma;
    }

    public String getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getDataExpedicao() {
        return dataExpedicao;
    }

    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    @Override
    public String toString() {
        return "Farmaceutico{" + "crf=" + crf + ", ufCRF=" + ufCRF + ", categoriaProfissional=" + categoriaProfissional + ", instituicaoDiploma=" + instituicaoDiploma + ", dataConclusao=" + dataConclusao + ", dataExpedicao=" + dataExpedicao + '}';
    }
    
    
    
}
