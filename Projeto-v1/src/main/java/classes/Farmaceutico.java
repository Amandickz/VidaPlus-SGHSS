/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

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

    public Farmaceutico(String crf, String ufCRF, String categoriaProfissional, String instituicaoDiploma, String dataConclusao, String dataExpedicao, String grupoSanguineo, String dataAdminissao) {
        super(grupoSanguineo, dataAdminissao);
        this.crf = crf;
        this.ufCRF = ufCRF;
        this.categoriaProfissional = categoriaProfissional;
        this.instituicaoDiploma = instituicaoDiploma;
        this.dataConclusao = dataConclusao;
        this.dataExpedicao = dataExpedicao;
    }

    public Farmaceutico(String crf, String ufCRF, String categoriaProfissional, String instituicaoDiploma, String dataConclusao, String dataExpedicao, String grupoSanguineo, String dataAdminissao, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, char sexo, String nomeMae, String nomePai, String naturalidade, String uf, String nacionalidade, String raca, String telefone, String email) {
        super(grupoSanguineo, dataAdminissao, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email);
        this.crf = crf;
        this.ufCRF = ufCRF;
        this.categoriaProfissional = categoriaProfissional;
        this.instituicaoDiploma = instituicaoDiploma;
        this.dataConclusao = dataConclusao;
        this.dataExpedicao = dataExpedicao;
    }

    public Farmaceutico(String crf, String ufCRF, String categoriaProfissional, String instituicaoDiploma, String dataConclusao, String dataExpedicao, String grupoSanguineo, String dataAdminissao, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, char sexo, String nomeMae, String nomePai, String naturalidade, String uf, String nacionalidade, String raca, String telefone, String email) {
        super(grupoSanguineo, dataAdminissao, id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email);
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
