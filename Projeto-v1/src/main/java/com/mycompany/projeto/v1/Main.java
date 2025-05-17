/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto.v1;

import classes.Administracao;
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
        boolean exec = true;
        
        while(exec){
            
            scan.next();
            
            int op = 0;
            
            System.out.println("1 - Cadastrar Nova Administração");
            System.out.println("2 - Ver Administrações Cadastradas");
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
                
                int id = testeAdministracao.size()+1;
                
                Administracao administracao = new Administracao(id, cnpj, data, razaoSocial);
                testeAdministracao.add(administracao);
            } else if(op == 2){
                for(Administracao administracao:testeAdministracao){
                    System.out.println(administracao.toString());
                }
            } else if(op == 0){
                exec = false;
            }
            
            System.out.println("");
            
        }
        
        
    }
}
