/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import classes.Administracao;
import classes.Endereco;
import classes.Login;
import enums.Estado;
import enums.Matriz;
import enums.Porte;
import enums.SituacaoCadastral;
import enums.TipoConta;
import gerenciamento.GerenciamentoHospitalar;
import interfaces.TelaInicial;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) {
        
        /*TelaInicial telaInicial = new TelaInicial();
        telaInicial.setLocationRelativeTo(null);
        telaInicial.setVisible(true);*/
        
        GerenciamentoHospitalar admHospital = new GerenciamentoHospitalar();
        
        /*Administracao administracao = new Administracao();
        administracao.setId(1);
        administracao.setCnpj("11.111.111/0001-11");
        administracao.setDataDeAbertura("05/06/2025");
        administracao.setRazaoSocial("Hospital da UNINTER LTDA");
        administracao.setNomeFantasia("Hospital UNINTER Cuidados Básicos e Intensivos");
        administracao.setPorte(Porte.TRES);
        administracao.setEmail("hospital@uninter.com");
        administracao.setTelefone("(11) 11111-1111");
        administracao.setSituacaoCadastral(SituacaoCadastral.CINCO);
        administracao.setDataDaSituacao("05/06/2025");
        administracao.setIndicadorMatriz(Matriz.UM);
        
        Login login = new Login();
        login.setUsuario(administracao.getCnpj());
        login.setSenha("admin");
        login.setTipoConta(TipoConta.A);
        login = admHospital.retornaLoginComID(login);
        admHospital.cadastraLogin(login);
        
        administracao.setIdLogin(login.getId());
        
        Endereco endereco = new Endereco();
        endereco.setCep("11111-111");
        endereco.setLogradouro("Rua Teste");
        endereco.setNumero(111);
        endereco.setComplemento("Prédio Verde");
        endereco.setBairro("Divino");
        endereco.setMunicipio("Palmas");
        endereco.setUf(Estado.PARANÁ);
        endereco = admHospital.retornaEnderecoComID(endereco);
        admHospital.cadastraEndereco(endereco);
        
        administracao.setIdEndereco(endereco.getId());
        
        admHospital.setAdministracao(administracao);*/
        
        TelaInicial telaInicial = new TelaInicial(admHospital);
        telaInicial.setVisible(true);
        
        /*TelaInicialAdministrador telaAdministrador = new TelaInicialAdministrador(admHospital);
        telaAdministrador.setVisible(true);*/        
    }
}
