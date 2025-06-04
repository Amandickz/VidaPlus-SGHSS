/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Endereco;
import classes.Leito;
import classes.Login;
import classes.Medico;
import classes.Pessoa;
import enums.TiposLeitos;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class AdministrarHospital {
    
    ArrayList<Leito> leitos = new ArrayList<>();
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    ArrayList<Endereco> enderecos = new ArrayList<>();
    ArrayList<Login> logins = new ArrayList<>();
    ArrayList<Medico> medicos = new ArrayList<>();

    public AdministrarHospital() {
    }
    
    //Gerenciamento de Pessoas
    public Pessoa retornaIdPessoa(Pessoa pessoa){
        pessoa.setId(pessoas.size() + 1);
        return pessoa;
    }
    
    //Gerenciamento do Profissional de Saúde
    
    //Gerenciamento do Profissional de Saúde - Médico
    public boolean cadastraMedico(Medico medico, Endereco endereco, Login login){
        Pessoa pessoa = new Pessoa(medico.getId(), medico.getCpf(), medico.getNomeCompleto(), medico.getNomeSocial(),
                medico.getDataNascimento(), medico.getSexo(), medico.getNomeMae(), medico.getNomePai(), medico.getNaturalidade(),
                medico.getUf(), medico.getNacionalidade(), medico.getRaca(), medico.getTelefone(), medico.getEmail(),
                medico.getIdEndereco(), medico.getIdLogin());
        pessoas.add(pessoa);
        enderecos.add(endereco);
        logins.add(login);
        medicos.add(medico);
        System.out.println("------Cadastrado Agora------");
        System.out.println(pessoa);
        System.out.println(endereco);
        System.out.println(login);
        System.out.println(medico);
        return true;
    }
    
    public ArrayList<Medico> medicosCadastrados(){
        return medicos;
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
    
    public ArrayList<Leito> leitosCadastrados(){
        return leitos;
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
