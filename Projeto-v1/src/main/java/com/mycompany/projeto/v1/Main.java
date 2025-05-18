/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import classes.Administracao;
import classes.Endereco;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Administracao> testeAdministracao = new ArrayList<>();
        ArrayList<Endereco> testeEndereco = new ArrayList<>();
        boolean exec = true;
        
        while(exec){
            
            System.out.println("");
            
            int op = 0;
            
            System.out.println("========== Menu ==========");
            System.out.println("1 - Cadastrar Nova Administração");
            System.out.println("2 - Ver Administrações Cadastradas");
            System.out.println("3 - Ver Endereços Cadastrados");
            System.out.print("Opção: ");
            op = scan.nextInt();
            
            if(op == 1){
                System.out.println("========== Nova Administração ==========");
                System.out.print("CNPJ: ");
                String cnpj = scan.next();
                System.out.print("Data de Abertura: ");
                String data = scan.next();
                System.out.print("Razão Social: ");
                String razaoSocial = scan.next();
                System.out.println("");
                scan.nextLine();
                System.out.print("CEP: ");
                String cep = scan.next();
                System.out.print("Logradouro: ");
                String logradouro = scan.next();
                scan.nextLine();
                System.out.print("Número: ");
                int numero = scan.nextInt();
                System.out.print("Complento: ");
                String complemento = scan.next();
                scan.nextLine();
                System.out.print("Bairro: ");
                String bairro = scan.next();
                scan.nextLine();
                System.out.print("Município: ");
                String municipio = scan.next();
                System.out.print("UF: ");
                String uf = scan.next();
                
                
                int idAdm = testeAdministracao.size() + 1;
                int idEnd = testeEndereco.size() + 1;
                
                Administracao administracao = new Administracao(idAdm, cnpj, data, razaoSocial);
                testeAdministracao.add(administracao);
                Endereco endereco = new Endereco(idEnd, cep, logradouro, numero, complemento, bairro, municipio, uf);
                testeEndereco.add(endereco);
                
            } else if(op == 2){
                for(Administracao administracao:testeAdministracao){
                    System.out.println(administracao.toString());
                }
            } else if(op == 3){
                for(Endereco endereco : testeEndereco){
                    System.out.println(endereco.toString());
                }
            } else if(op == 0){
                exec = false;
            }
            
            System.out.println("");
            
        }
        
        
    }
}
