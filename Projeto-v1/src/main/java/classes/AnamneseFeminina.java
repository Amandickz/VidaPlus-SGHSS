/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Amanda
 */
public class AnamneseFeminina extends Anamnese{
    
    private int id;
    private boolean anticoncepcional;
    private String anotacaoAnticoncepcional;
    private int cicloMenstrual;

    public AnamneseFeminina() {
    }

    public AnamneseFeminina(boolean anticoncepcional, String anotacaoAnticoncepcional, int cicloMenstrual) {
        this.anticoncepcional = anticoncepcional;
        this.anotacaoAnticoncepcional = anotacaoAnticoncepcional;
        this.cicloMenstrual = cicloMenstrual;
    }

    public AnamneseFeminina(int id, boolean anticoncepcional, String anotacaoAnticoncepcional, int cicloMenstrual) {
        this.id = id;
        this.anticoncepcional = anticoncepcional;
        this.anotacaoAnticoncepcional = anotacaoAnticoncepcional;
        this.cicloMenstrual = cicloMenstrual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAnticoncepcional() {
        return anticoncepcional;
    }

    public void setAnticoncepcional(boolean anticoncepcional) {
        this.anticoncepcional = anticoncepcional;
    }

    public String getAnotacaoAnticoncepcional() {
        return anotacaoAnticoncepcional;
    }

    public void setAnotacaoAnticoncepcional(String anotacaoAnticoncepcional) {
        this.anotacaoAnticoncepcional = anotacaoAnticoncepcional;
    }

    public int getCicloMenstrual() {
        return cicloMenstrual;
    }

    public void setCicloMenstrual(int cicloMenstrual) {
        this.cicloMenstrual = cicloMenstrual;
    }

    @Override
    public String toString() {
        return "AnamneseFeminina{" + "id=" + id + ", anticoncepcional=" + anticoncepcional + ", anotacaoAnticoncepcional=" + anotacaoAnticoncepcional + ", cicloMenstrual=" + cicloMenstrual + '}';
    }
    
    
    
}
