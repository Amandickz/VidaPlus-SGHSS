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
public class Paciente extends Pessoa{
    
    private String cartaoSus;
    private String ocupacao;

    public Paciente(String cartaoSus, String ocupacao) {
        this.cartaoSus = cartaoSus;
        this.ocupacao = ocupacao;
    }

    public Paciente(String cartaoSus, String ocupacao, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco) {
        super(cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco);
        this.cartaoSus = cartaoSus;
        this.ocupacao = ocupacao;
    }

    public Paciente(String cartaoSus, String ocupacao, int id, String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, Sexo sexo, String nomeMae, String nomePai, String naturalidade, Estado uf, Nacionalidade nacionalidade, RacaCorEtnia raca, String telefone, String email, int idEndereco) {
        super(id, cpf, nomeCompleto, nomeSocial, dataNascimento, sexo, nomeMae, nomePai, naturalidade, uf, nacionalidade, raca, telefone, email, idEndereco);
        this.cartaoSus = cartaoSus;
        this.ocupacao = ocupacao;
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

    @Override
    public String toString() {
        return "Paciente{" + "cartaoSus=" + cartaoSus + ", ocupacao=" + ocupacao + '}';
    }
    
    
    
}
