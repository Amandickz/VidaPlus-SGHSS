/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.Matriz;
import enums.Porte;
import enums.SituacaoCadastral;

/**
 *
 * @author Amanda
 */
public class Administracao {
    
    private int id;
    private String cnpj;
    private String dataDeAbertura;
    private String razaoSocial;
    private String nomeFantasia;
    private Porte porte;
    private String email;
    private String telefone;
    private SituacaoCadastral situacaoCadastral;
    private String dataDaSituacao;
    private Matriz indicadorMatriz;
    private int idEndereco;
    private int idLogin;

    public Administracao() {
    }

    public Administracao(String cnpj, String dataDeAbertura, String razaoSocial, String nomeFantasia, Porte porte, String email, String telefone, SituacaoCadastral situacaoCadastral, String dataDaSituacao, Matriz indicadorMatriz, int idEndereco, int idLogin) {
        this.cnpj = cnpj;
        this.dataDeAbertura = dataDeAbertura;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.porte = porte;
        this.email = email;
        this.telefone = telefone;
        this.situacaoCadastral = situacaoCadastral;
        this.dataDaSituacao = dataDaSituacao;
        this.indicadorMatriz = indicadorMatriz;
        this.idEndereco = idEndereco;
        this.idLogin = idLogin;
    }

    public Administracao(int id, String cnpj, String dataDeAbertura, String razaoSocial, String nomeFantasia, Porte porte, String email, String telefone, SituacaoCadastral situacaoCadastral, String dataDaSituacao, Matriz indicadorMatriz, int idEndereco, int idLogin) {
        this.id = id;
        this.cnpj = cnpj;
        this.dataDeAbertura = dataDeAbertura;
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.porte = porte;
        this.email = email;
        this.telefone = telefone;
        this.situacaoCadastral = situacaoCadastral;
        this.dataDaSituacao = dataDaSituacao;
        this.indicadorMatriz = indicadorMatriz;
        this.idEndereco = idEndereco;
        this.idLogin = idLogin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(String dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Porte getPorte() {
        return porte;
    }

    public void setPorte(Porte porte) {
        this.porte = porte;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public SituacaoCadastral getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(SituacaoCadastral situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public String getDataDaSituacao() {
        return dataDaSituacao;
    }

    public void setDataDaSituacao(String dataDaSituacao) {
        this.dataDaSituacao = dataDaSituacao;
    }

    public Matriz getIndicadorMatriz() {
        return indicadorMatriz;
    }

    public void setIndicadorMatriz(Matriz indicadorMatriz) {
        this.indicadorMatriz = indicadorMatriz;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    @Override
    public String toString() {
        return "Administracao{" + "id=" + id + ", cnpj=" + cnpj + ", dataDeAbertura=" + dataDeAbertura + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", porte=" + porte + ", email=" + email + ", telefone=" + telefone + ", situacaoCadastral=" + situacaoCadastral + ", dataDaSituacao=" + dataDaSituacao + ", indicadorMatriz=" + indicadorMatriz + ", idEndereco=" + idEndereco + ", idLogin=" + idLogin + '}';
    }    
    
}
