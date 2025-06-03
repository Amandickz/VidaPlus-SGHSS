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
public class Medico extends ProfissionalSaude{
    
    private String crm;
    private String ufCRM;
    private String dataIncricao;
    private int especialidade;

    public Medico(String crm, String ufCRM, String dataIncricao, int especialidade, String grupoSanguineo, String dataAdminissao, String observaoes) {
        super(grupoSanguineo, dataAdminissao, observaoes);
        this.crm = crm;
        this.ufCRM = ufCRM;
        this.dataIncricao = dataIncricao;
        this.especialidade = especialidade;
    }

    public Medico(String crm, String ufCRM, String dataIncricao, int especialidade, String grupoSanguineo, String dataAdminissao, String observaoes, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(grupoSanguineo, dataAdminissao, observaoes, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.crm = crm;
        this.ufCRM = ufCRM;
        this.dataIncricao = dataIncricao;
        this.especialidade = especialidade;
    }

    public Medico(String crm, String ufCRM, String dataIncricao, int especialidade, String grupoSanguineo, String dataAdminissao, String observaoes, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(grupoSanguineo, dataAdminissao, observaoes, id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.crm = crm;
        this.ufCRM = ufCRM;
        this.dataIncricao = dataIncricao;
        this.especialidade = especialidade;
    }
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getUfCRM() {
        return ufCRM;
    }

    public void setUfCRM(String ufCRM) {
        this.ufCRM = ufCRM;
    }

    public String getDataIncricao() {
        return dataIncricao;
    }

    public void setDataIncricao(String dataIncricao) {
        this.dataIncricao = dataIncricao;
    }

    public int getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(int especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + ", ufCRM=" + ufCRM + ", dataIncricao=" + dataIncricao + ", especialidade=" + especialidade + '}';
    }
    
    
    
}
