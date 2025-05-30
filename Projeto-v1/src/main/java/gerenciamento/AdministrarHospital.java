/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Leito;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class AdministrarHospital {
    
    ArrayList<Leito> leitos = new ArrayList<>();

    public AdministrarHospital() {
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
    
    public void leitosCadastrados(){
        for(Leito l : leitos){
            System.out.println(l.toString());
        }
    }
    
}
