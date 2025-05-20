/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

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
    private char sexo;
    private String nomeMae;
    private String nomePai;
    private String naturalidade;
    private String uf;
    private String nacionalidade;
    private String raca;
    private String telefone;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, char sexo, String nomeMae, String nomePai, String naturalidade, String uf, String nacionalidade, String raca, String telefone, String email) {
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
    }

    public Pessoa(int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, char sexo, String nomeMae, String nomePai, String naturalidade, String uf, String nacionalidade, String raca, String telefone, String email) {
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
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

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
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

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", cpf=" + cpf + ", nomeCompleto=" + nomeCompleto + ", nomeSocial=" + nomeSocial + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", naturalidade=" + naturalidade + ", uf=" + uf + ", nacionalidade=" + nacionalidade + ", raca=" + raca + ", telefone=" + telefone + ", email=" + email + '}';
    }
    
    
    
}
