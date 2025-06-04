/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Endereco;
import classes.Enfermeiro;
import classes.Leito;
import classes.Login;
import classes.Medico;
import classes.Pessoa;
import classes.ProfissionalSaude;
import enums.TiposLeitos;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class GerenciamentoHospitalar {
    
    ArrayList<Leito> leitos = new ArrayList<>();
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    ArrayList<Endereco> enderecos = new ArrayList<>();
    ArrayList<Login> logins = new ArrayList<>();
    ArrayList<ProfissionalSaude> profissionais = new ArrayList<>();
    ArrayList<Medico> medicos = new ArrayList<>();
    ArrayList<Enfermeiro> enfermeiros = new ArrayList<>();

    public GerenciamentoHospitalar() {
    }
    
    //Gerenciamento de Pessoas
    public ArrayList<Pessoa> getPessoas(){
        return pessoas;
    }

    public Pessoa retornaIdPessoa(Pessoa pessoa) {
        pessoa.setId(pessoas.size() + 1);
        return pessoa;
    }
    
    //Gerenciamento do Profissional de Saúde - Médico
    public ArrayList<Medico> getMedicos(){
        return medicos;
    }
    
    public boolean cadastraMedico(Medico medico, Endereco endereco, Login login){
        Pessoa pessoa = new Pessoa(medico.getId(), medico.getCpf(), medico.getNomeCompleto(), medico.getNomeSocial(),
                medico.getDataNascimento(), medico.getSexo(), medico.getNomeMae(), medico.getNomePai(), medico.getNaturalidade(),
                medico.getUf(), medico.getNacionalidade(), medico.getRaca(), medico.getTelefone(), medico.getEmail(),
                medico.getIdEndereco(), medico.getIdLogin());
        ProfissionalSaude profissional = new ProfissionalSaude(medico.getTipoSanguineo(), medico.getDataAdmissao(), medico.getObservaoes());
        pessoas.add(pessoa);
        enderecos.add(endereco);
        logins.add(login);
        profissionais.add(profissional);
        medicos.add(medico);
        System.out.println();
        System.out.println("------Cadastrado Agora------");
        System.out.println(pessoa);
        System.out.println(endereco);
        System.out.println(login);
        System.out.println(profissional);
        System.out.println(medico);
        System.out.println();
        return true;
    }
    
    //Gerenciamento do Profissional de Saúde - Enfermeiro
    public ArrayList<Enfermeiro> getEnfermeiros() {
        return enfermeiros;
    }
    
    public boolean cadastraEnfermeiro(Enfermeiro enfermeiro, Endereco endereco, Login login){
        Pessoa pessoa = new Pessoa(enfermeiro.getId(), enfermeiro.getCpf(), enfermeiro.getNomeCompleto(), enfermeiro.getNomeSocial(),
                enfermeiro.getDataNascimento(), enfermeiro.getSexo(), enfermeiro.getNomeMae(), enfermeiro.getNomePai(), enfermeiro.getNaturalidade(),
                enfermeiro.getUf(), enfermeiro.getNacionalidade(), enfermeiro.getRaca(), enfermeiro.getTelefone(), enfermeiro.getEmail(),
                enfermeiro.getIdEndereco(), enfermeiro.getIdLogin());
        ProfissionalSaude profissional = new ProfissionalSaude(enfermeiro.getTipoSanguineo(), enfermeiro.getDataAdmissao(), enfermeiro.getObservaoes());
        pessoas.add(pessoa);
        enderecos.add(endereco);
        logins.add(login);
        profissionais.add(profissional);
        enfermeiros.add(enfermeiro);
        System.out.println();
        System.out.println("------Cadastrado Agora------");
        System.out.println(pessoa);
        System.out.println(endereco);
        System.out.println(login);
        System.out.println(profissional);
        System.out.println(enfermeiro);
        System.out.println();
        return true;
    }

    //Gerenciamento de Login
    public Login retornaIdLogin(Login login){
        login.setId(logins.size() + 1);
        return login;
    }
    
    //Gerenciamento de Endereço
    public Endereco retornaIdEndereco(Endereco endereco){
        endereco.setId(enderecos.size() + 1);
        return endereco;
    }
    
    //Gerenciamento de Leito
    public ArrayList<Leito> getLeitos(){
        return leitos;
    }
    
    public boolean cadastrarNovoLeito(Leito leito){        
        if(!leitos.isEmpty()){
            for(Leito l : leitos){
                if(l.getNumero() == leito.getNumero()){
                    return false;
                }
            }
        }
        
        leito.setId(leitos.size() + 1);
        leitos.add(leito);
        return true;
    }
    
    public String disponibilidade(boolean status){
        if(status == true){
           return "DISPONÍVEL";
        }
        return "NÃO DISPONÍVEL";
    }
    
    public String tipoLeito(int tipo){
        switch (tipo) {
            case 1 -> {
                return TiposLeitos.UM.getTipoLeito();
            }
            case 2 -> {
                return TiposLeitos.DOIS.getTipoLeito();
            }
            case 3 -> {
                return TiposLeitos.TRES.getTipoLeito();
            }
            case 4 -> {
                return TiposLeitos.QUATRO.getTipoLeito();
            }
            case 5 -> {
                return TiposLeitos.CINCO.getTipoLeito();
            }
            case 6 -> {
                return TiposLeitos.SEIS.getTipoLeito();
            }
            case 7 -> {
                return TiposLeitos.SETE.getTipoLeito();
            }
            case 8 -> {
                return TiposLeitos.OITO.getTipoLeito();
            }
            case 9 -> {
                return TiposLeitos.NOVE.getTipoLeito();
            }
            default -> throw new AssertionError();
        }
    }
    
}
