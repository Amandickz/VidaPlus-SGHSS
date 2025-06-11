/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.CadastroPaciente;
import enums.Estado;
import enums.Nacionalidade;
import enums.RacaCorEtnia;
import enums.Sexo;

/**
 *
 * @author Amanda
 */
public class Paciente extends Pessoa{
    
    private String cartaoSus;
    private String ocupacao;
    private CadastroPaciente cadastro;
    private Anamnese anamnese;

    public Paciente(String cartaoSus, String ocupacao, CadastroPaciente cadastro, Anamnese anamnese) {
        this.cartaoSus = cartaoSus;
        this.ocupacao = ocupacao;
        this.cadastro = cadastro;
        this.anamnese = anamnese;
    }

    public Paciente(String cartaoSus, String ocupacao, CadastroPaciente cadastro, Anamnese anamnese, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.cartaoSus = cartaoSus;
        this.ocupacao = ocupacao;
        this.cadastro = cadastro;
        this.anamnese = anamnese;
    }

    public Paciente(String cartaoSus, String ocupacao, CadastroPaciente cadastro, Anamnese anamnese, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco, int idLogin) {
        super(id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco, idLogin);
        this.cartaoSus = cartaoSus;
        this.ocupacao = ocupacao;
        this.cadastro = cadastro;
        this.anamnese = anamnese;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public CadastroPaciente getCadastro() {
        return cadastro;
    }

    public void setCadastro(CadastroPaciente cadastro) {
        this.cadastro = cadastro;
    }

    public Anamnese getAnamnese() {
        return anamnese;
    }

    public void setAnamnese(Anamnese anamnese) {
        this.anamnese = anamnese;
    }

    @Override
    public String toString() {
        return "Paciente{" + "cartaoSus=" + cartaoSus + ", ocupacao=" + ocupacao + ", cadastro=" + cadastro + ", anamnese=" + anamnese + '}';
    }
}
