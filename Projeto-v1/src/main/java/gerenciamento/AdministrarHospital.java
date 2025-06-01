/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gerenciamento;

import classes.Leito;
import enums.TiposLeitos;
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
    
    public ArrayList<Leito> leitosCadastrados(){
        ArrayList<Leito> listaLeitos = new ArrayList<>();
        for(Leito l : leitos){
            System.out.println(l.toString());
            listaLeitos.add(l);
        }
        
        return listaLeitos;
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
