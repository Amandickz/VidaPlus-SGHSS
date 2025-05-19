/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

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
    private int porte;
    private String email;
    private String telefone;
    private int situacaoCadastral;
    private String dataDaSituacao;
    private int indicadorMatriz;

    public Administracao() {
    }

    public Administracao(String cnpj, String dataDeAbertura, String razaoSocial, String nomeFantasia, int porte, String email, String telefone, int situacaoCadastral, String dataDaSituacao, int indicadorMatriz) {
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
    }

    public Administracao(int id, String cnpj, String dataDeAbertura, String razaoSocial, String nomeFantasia, int porte, String email, String telefone, int situacaoCadastral, String dataDaSituacao, int indicadorMatriz) {
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

    public int getPorte() {
        return porte;
    }

    public void setPorte(int porte) {
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

    public int getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public void setSituacaoCadastral(int situacaoCadastral) {
        this.situacaoCadastral = situacaoCadastral;
    }

    public String getDataDaSituacao() {
        return dataDaSituacao;
    }

    public void setDataDaSituacao(String dataDaSituacao) {
        this.dataDaSituacao = dataDaSituacao;
    }

    public int getIndicadorMatriz() {
        return indicadorMatriz;
    }

    public void setIndicadorMatriz(int indicadorMatriz) {
        this.indicadorMatriz = indicadorMatriz;
    }

    @Override
    public String toString() {
        return "Administracao{" + "id=" + id + ", cnpj=" + cnpj + ", dataDeAbertura=" + dataDeAbertura + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia + ", porte=" + porte + ", email=" + email + ", telefone=" + telefone + ", situacaoCadastral=" + situacaoCadastral + ", dataDaSituacao=" + dataDaSituacao + ", indicadorMatriz=" + indicadorMatriz + '}';
    }
    
}
