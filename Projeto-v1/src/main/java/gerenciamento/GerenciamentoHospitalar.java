/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Endereco;
import classes.Enfermeiro;
import classes.Farmaceutico;
import classes.Leito;
import classes.Login;
import classes.Medico;
import classes.Pessoa;
import classes.ProfissionalSaude;
import classes.Suprimento;
import classes.Tecnico;
import enums.TipoLeito;
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
    ArrayList<Tecnico> tecnicos = new ArrayList<>();
    ArrayList<Farmaceutico> farmaceuticos = new ArrayList<>();
    ArrayList<Suprimento> suprimentos = new ArrayList<>();

    public GerenciamentoHospitalar() {
    }
    
    //Gerenciamento de Pessoas
    public ArrayList<Pessoa> getPessoas(){
        return pessoas;
    }

    public Pessoa retornaPessoaComID(Pessoa pessoa) {
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
    
    //Gerenciamento do Profissional de Saúde - Técnico em Enfermagem
    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }
    
    public boolean cadastraTecnico(Tecnico tecnico, Endereco endereco, Login login){
        Pessoa pessoa = new Pessoa(tecnico.getId(), tecnico.getCpf(), tecnico.getNomeCompleto(), tecnico.getNomeSocial(),
                tecnico.getDataNascimento(), tecnico.getSexo(), tecnico.getNomeMae(), tecnico.getNomePai(), tecnico.getNaturalidade(),
                tecnico.getUf(), tecnico.getNacionalidade(), tecnico.getRaca(), tecnico.getTelefone(), tecnico.getEmail(),
                tecnico.getIdEndereco(), tecnico.getIdLogin());
        ProfissionalSaude profissional = new ProfissionalSaude(tecnico.getTipoSanguineo(), tecnico.getDataAdmissao(), tecnico.getObservaoes());
        pessoas.add(pessoa);
        enderecos.add(endereco);
        logins.add(login);
        profissionais.add(profissional);
        tecnicos.add(tecnico);
        System.out.println();
        System.out.println("------Cadastrado Agora------");
        System.out.println(pessoa);
        System.out.println(endereco);
        System.out.println(login);
        System.out.println(profissional);
        System.out.println(tecnico);
        System.out.println();
        return true;
    }
    
    //Gerenciamento do Profissional de Saúde - Farmaceutico
    public ArrayList<Farmaceutico> getFarmaceuticos() {
        return farmaceuticos;
    }
    
    public boolean cadastraFarmaceutico(Farmaceutico farmaceutico, Endereco endereco, Login login){
        Pessoa pessoa = new Pessoa(farmaceutico.getId(), farmaceutico.getCpf(), farmaceutico.getNomeCompleto(), farmaceutico.getNomeSocial(),
                farmaceutico.getDataNascimento(), farmaceutico.getSexo(), farmaceutico.getNomeMae(), farmaceutico.getNomePai(), farmaceutico.getNaturalidade(),
                farmaceutico.getUf(), farmaceutico.getNacionalidade(), farmaceutico.getRaca(), farmaceutico.getTelefone(), farmaceutico.getEmail(),
                farmaceutico.getIdEndereco(), farmaceutico.getIdLogin());
        ProfissionalSaude profissional = new ProfissionalSaude(farmaceutico.getTipoSanguineo(), farmaceutico.getDataAdmissao(), farmaceutico.getObservaoes());
        pessoas.add(pessoa);
        enderecos.add(endereco);
        logins.add(login);
        profissionais.add(profissional);
        farmaceuticos.add(farmaceutico);
        System.out.println();
        System.out.println("------Cadastrado Agora------");
        System.out.println(pessoa);
        System.out.println(endereco);
        System.out.println(login);
        System.out.println(profissional);
        System.out.println(farmaceutico);
        System.out.println();
        return true;
    }    

    //Gerenciamento de Login
    public Login retornaLoginComID(Login login){
        login.setId(logins.size() + 1);
        return login;
    }
    
    //Gerenciamento de Endereço
    public Endereco retornaEnderecoComID(Endereco endereco){
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
                return TipoLeito.UM.getTipoLeito();
            }
            case 2 -> {
                return TipoLeito.DOIS.getTipoLeito();
            }
            case 3 -> {
                return TipoLeito.TRES.getTipoLeito();
            }
            case 4 -> {
                return TipoLeito.QUATRO.getTipoLeito();
            }
            case 5 -> {
                return TipoLeito.CINCO.getTipoLeito();
            }
            case 6 -> {
                return TipoLeito.SEIS.getTipoLeito();
            }
            case 7 -> {
                return TipoLeito.SETE.getTipoLeito();
            }
            case 8 -> {
                return TipoLeito.OITO.getTipoLeito();
            }
            case 9 -> {
                return TipoLeito.NOVE.getTipoLeito();
            }
            default -> throw new AssertionError();
        }
    }
    
    //Gerenciamento de Suprimentos por Parte do Administrador
    public ArrayList<Suprimento> getSuprimentos() {
        return suprimentos;
    }
    
    public Suprimento retornaSuprimentoComID(Suprimento suprimento){
        suprimento.setId(suprimentos.size() + 1);
        return suprimento;
    }
    
    public boolean cadastrarSuprimento(Suprimento suprimento){
        suprimentos.add(suprimento);
        System.out.println();
        System.out.println("------Suprimento Cadastrado Agora------");
        System.out.println(suprimento);
        System.out.println();
        return true;
    }
    
    public Suprimento buscaSuprimentoPorNome(String nome){
        Suprimento suprimento = new Suprimento();
        System.out.println(suprimento);
        for(Suprimento s : suprimentos){
            if(s.getNome().equals(nome)){
                suprimento.setId(s.getId());
                suprimento.setNome(s.getNome());
                suprimento.setTipo(s.getTipo());
                suprimento.setQuantidadeEstoque(s.getQuantidadeEstoque());
                suprimento.setValorUnitario(s.getValorUnitario());
                suprimento.setObservacoes(s.getObservacoes());
            }
        }
        return suprimento;
    }
    
}
