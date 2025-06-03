/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Especialidades;
import enums.Estado;
import enums.Nacionalidade;
import enums.RacaCorEtnia;
import enums.Sexo;
import enums.TipoSanguineo;

/**
 *
 * @author Amanda
 */
public class Medico extends ProfissionalSaude{
    
    private String crm;
    private Estado ufCRM;
    private String dataIncricao;
    private Especialidades especialidade;

    public Medico(String crm, Estado ufCRM, String dataIncricao, Especialidades especialidade, TipoSanguineo tipoSanguineo, String dataAdminissao, String observaoes) {
        super(tipoSanguineo, dataAdminissao, observaoes);
        this.crm = crm;
        this.ufCRM = ufCRM;
        this.dataIncricao = dataIncricao;
        this.especialidade = especialidade;
    }

    public Medico(String crm, Estado ufCRM, String dataIncricao, Especialidades especialidade, TipoSanguineo tipoSanguineo, String dataAdminissao, String observaoes, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdminissao, observaoes, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.crm = crm;
        this.ufCRM = ufCRM;
        this.dataIncricao = dataIncricao;
        this.especialidade = especialidade;
    }

    public Medico(String crm, Estado ufCRM, String dataIncricao, Especialidades especialidade, TipoSanguineo tipoSanguineo, String dataAdminissao, String observaoes, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(tipoSanguineo, dataAdminissao, observaoes, id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
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

    public Estado getUfCRM() {
        return ufCRM;
    }

    public void setUfCRM(Estado ufCRM) {
        this.ufCRM = ufCRM;
    }

    public String getDataIncricao() {
        return dataIncricao;
    }

    public void setDataIncricao(String dataIncricao) {
        this.dataIncricao = dataIncricao;
    }

    public Especialidades getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidades especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" + "crm=" + crm + ", ufCRM=" + ufCRM + ", dataIncricao=" + dataIncricao + ", especialidade=" + especialidade + '}';
    }
    
    
    
}
