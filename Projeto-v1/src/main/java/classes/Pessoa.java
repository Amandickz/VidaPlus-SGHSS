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
public class Pessoa {
    
    private int id;
    private String cpf;
    private String nomeCompleto;
    private String nomeSocial;
    private String dataNascimento;
    private Sexo sexo;
    private String nomeMae;
    private String nomePai;
    private String naturalidade;
    private Estado uf;
    private Nacionalidade nacionalidade;
    private RacaCorEtnia raca;
    private String telefone;
    private String email;
    private int idEndereco;
    private int idLogin;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.nomeSocial = nomeSocial;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.naturalidade = naturalidade;
        this.uf = uf;
        this.nacionalidade = nacionalidade;
        this.raca = raca;
        this.telefone = telefone;
        this.email = email;
        this.idEndereco = idEndereco;
        this.idLogin = idLogin;
    }

    public Pessoa(int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        this.id = id;
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.nomeSocial = nomeSocial;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.naturalidade = naturalidade;
        this.uf = uf;
        this.nacionalidade = nacionalidade;
        this.raca = raca;
        this.telefone = telefone;
        this.email = email;
        this.idEndereco = idEndereco;
        this.idLogin = idLogin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public Estado getUf() {
        return uf;
    }

    public void setUf(Estado uf) {
        this.uf = uf;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public RacaCorEtnia getRaca() {
        return raca;
    }

    public void setRaca(RacaCorEtnia raca) {
        this.raca = raca;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        return "Pessoa{" + "id=" + id + ", cpf=" + cpf + ", nomeCompleto=" + nomeCompleto + ", nomeSocial=" + nomeSocial + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", naturalidade=" + naturalidade + ", uf=" + uf + ", nacionalidade=" + nacionalidade + ", raca=" + raca + ", telefone=" + telefone + ", email=" + email + ", idEndereco=" + idEndereco + ", idLogin=" + idLogin + '}';
    }
    
    
    
}
