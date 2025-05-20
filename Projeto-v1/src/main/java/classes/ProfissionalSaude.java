/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Amanda
 */
public class ProfissionalSaude extends Pessoa{
    
    private String grupoSanguineo;
    private String dataAdminissao;

    public ProfissionalSaude(String grupoSanguineo, String dataAdminissao) {
        this.grupoSanguineo = grupoSanguineo;
        this.dataAdminissao = dataAdminissao;
    }

    public ProfissionalSaude(String grupoSanguineo, String dataAdminissao, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, char sexo, String nomeMae, String nomePai, String naturalidade, String uf, String nacionalidade, String raca, String telefone, String email) {
        super(cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email);
        this.grupoSanguineo = grupoSanguineo;
        this.dataAdminissao = dataAdminissao;
    }

    public ProfissionalSaude(String grupoSanguineo, String dataAdminissao, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, char sexo, String nomeMae, String nomePai, String naturalidade, String uf, String nacionalidade, String raca, String telefone, String email) {
        super(id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email);
        this.grupoSanguineo = grupoSanguineo;
        this.dataAdminissao = dataAdminissao;
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

    @Override
    public String toString() {
        return "ProfissionalSaude{" + "grupoSanguineo=" + grupoSanguineo + ", dataAdminissao=" + dataAdminissao + '}';
    }
    
    
    
}
