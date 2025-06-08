/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Administracao;
import classes.Endereco;
import classes.Enfermeiro;
import classes.Farmaceutico;
import classes.Leito;
import classes.Login;
import classes.Medico;
import classes.Paciente;
import classes.Pessoa;
import classes.ProfissionalSaude;
import classes.Suprimento;
import classes.Tecnico;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class GerenciamentoHospitalar {

    Administracao administracao = new Administracao();
    ArrayList<Leito> leitos = new ArrayList<>();
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    ArrayList<Endereco> enderecos = new ArrayList<>();
    ArrayList<Login> logins = new ArrayList<>();
    ArrayList<Paciente> pacientes = new ArrayList<>();
    ArrayList<ProfissionalSaude> profissionais = new ArrayList<>();
    ArrayList<Medico> medicos = new ArrayList<>();
    ArrayList<Enfermeiro> enfermeiros = new ArrayList<>();
    ArrayList<Tecnico> tecnicos = new ArrayList<>();
    ArrayList<Farmaceutico> farmaceuticos = new ArrayList<>();
    ArrayList<Suprimento> suprimentos = new ArrayList<>();

    public GerenciamentoHospitalar() {
    }

    public Administracao getAdministracao() {
        return administracao;
    }

    public void setAdministracao(Administracao administracao) {
        this.administracao = administracao;
    }
    
    public boolean verificaAcessoAdministracao(String usuario, String senha){
        Login login = new Login();
        for(Login l : logins){
            if(l.getUsuario().equals(administracao.getCnpj())){
                login = l;
            }
        }
        
        System.out.println(login);
        
        if(login.getUsuario() == null){
            return false;
        } else if(login.getUsuario().equals(usuario)){
            if(login.getSenha().equals(senha)){
                return true;
            }
        } else {
            return false;
        }
        
        return false;
    }
    
    //Gerenciamento de Pessoas
    public ArrayList<Pessoa> getPessoas(){
        return pessoas;
    }

    public Pessoa retornaPessoaComID(Pessoa pessoa) {
        pessoa.setId(pessoas.size() + 1);
        return pessoa;
    }
    
    //Gerenciamento de Paciente
    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    
    public boolean cadastraPaciente(Paciente paciente, Endereco endereco, Login login){
        Pessoa pessoa = new Pessoa(paciente.getId(), paciente.getCpf(), paciente.getNomeCompleto(), paciente.getNomeSocial(),
                paciente.getDataNascimento(), paciente.getSexo(), paciente.getNomeMae(), paciente.getNomePai(), paciente.getNaturalidade(),
                paciente.getUf(), paciente.getNacionalidade(), paciente.getRaca(), paciente.getTelefone(), paciente.getEmail(),
                paciente.getIdEndereco(), paciente.getIdLogin());
        pessoas.add(pessoa);
        enderecos.add(endereco);
        logins.add(login);
        pacientes.add(paciente);
        System.out.println();
        System.out.println("------Cadastrado Agora------");
        System.out.println(pessoa);
        System.out.println(endereco);
        System.out.println(login);
        System.out.println(paciente);
        System.out.println();
        return true;
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
    
    public boolean cadastraLogin(Login login){
        logins.add(login);
        return true;
    }
    
    //Gerenciamento de Endereço
    public Endereco retornaEnderecoComID(Endereco endereco){
        endereco.setId(enderecos.size() + 1);
        return endereco;
    }
    
    public boolean cadastraEndereco(Endereco endereco){
        enderecos.add(endereco);
        return true;
    }
    
    public Endereco buscaEnderecoPorID(int id){
        Endereco endereco = new Endereco();
        for(Endereco e : enderecos){
            if(e.getId() == id){
                endereco.setId(e.getId());
                endereco.setCep(e.getCep());
                endereco.setLogradouro(e.getLogradouro());
                endereco.setNumero(e.getNumero());
                endereco.setComplemento(e.getComplemento());
                endereco.setBairro(e.getBairro());
                endereco.setMunicipio(e.getMunicipio());
                endereco.setUf(e.getUf());
            }
        }
        return endereco;
    }
    
    //Gerenciamento de Leito
    public ArrayList<Leito> getLeitos(){
        return leitos;
    }
    
    public Leito retornaLeitoComID(Leito leito){        
        leito.setId(leitos.size() + 1);
        return leito;
    }
    
    public boolean cadastrarLeito(Leito leito){
        leitos.add(leito);
        System.out.println();
        System.out.println("------Leito Cadastrado Agora------");
        System.out.println(leito);
        System.out.println();
        return true;
    }
    
    public Leito buscarLeitoPorNumero(int numero){
        Leito leito = new Leito();
        for(Leito l : leitos){
            if(l.getNumero() == numero){
                leito.setId(l.getId());
                leito.setNumero(l.getNumero());
                leito.setTipo(l.getTipo());
                leito.setCapacidade(l.getCapacidade());
                leito.setValor(l.getValor());
                leito.setDisponibilidade(l.getDisponibilidade());
                leito.setObservacoes(l.getObservacoes());
            }
        }
        return leito;
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
