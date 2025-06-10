/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import enums.CicloMenstrual;
import enums.TipoAnticoncepcional;

/**
 *
 * @author Amanda
 */
public class AnamneseFeminina extends Anamnese{
    
    private boolean anticoncepcional;
    private TipoAnticoncepcional tipoAnticoncepcional;
    private CicloMenstrual cicloMenstrual;

    public AnamneseFeminina(boolean anticoncepcional, TipoAnticoncepcional tipoAnticoncepcional, CicloMenstrual cicloMenstrual) {
        this.anticoncepcional = anticoncepcional;
        this.tipoAnticoncepcional = tipoAnticoncepcional;
        this.cicloMenstrual = cicloMenstrual;
    }

    public AnamneseFeminina(boolean anticoncepcional, TipoAnticoncepcional tipoAnticoncepcional, CicloMenstrual cicloMenstrual, boolean diabetes, boolean hipertensao, boolean hipotensao, boolean tabagismo, boolean epilepsia, boolean proteseDentaria, boolean problemasRespiratorios, String anotacoesProblemasRespiratorios, boolean cirurgias, String anotacoesCirurgias, boolean exerciciosFisicos, int frequenciaExercicios, boolean alcool, String frequenciaAlcool, boolean alergiaMedicacao, String anotacoesAlergiaMedicacao, boolean alergiaAlimento, String anotacoesAlergiaAlimento, boolean tratamentoMedicoAtual, String anotacoesTratamento, boolean marcaPasso, boolean medicamentoContinuo, String anotacoesMedicamentoContinuo) {
        super(diabetes, hipertensao, hipotensao, tabagismo, epilepsia, proteseDentaria, problemasRespiratorios, anotacoesProblemasRespiratorios, cirurgias, anotacoesCirurgias, exerciciosFisicos, frequenciaExercicios, alcool, frequenciaAlcool, alergiaMedicacao, anotacoesAlergiaMedicacao, alergiaAlimento, anotacoesAlergiaAlimento, tratamentoMedicoAtual, anotacoesTratamento, marcaPasso, medicamentoContinuo, anotacoesMedicamentoContinuo);
        this.anticoncepcional = anticoncepcional;
        this.tipoAnticoncepcional = tipoAnticoncepcional;
        this.cicloMenstrual = cicloMenstrual;
    }

    public AnamneseFeminina(boolean anticoncepcional, TipoAnticoncepcional tipoAnticoncepcional, CicloMenstrual cicloMenstrual, int id, boolean diabetes, boolean hipertensao, boolean hipotensao, boolean tabagismo, boolean epilepsia, boolean proteseDentaria, boolean problemasRespiratorios, String anotacoesProblemasRespiratorios, boolean cirurgias, String anotacoesCirurgias, boolean exerciciosFisicos, int frequenciaExercicios, boolean alcool, String frequenciaAlcool, boolean alergiaMedicacao, String anotacoesAlergiaMedicacao, boolean alergiaAlimento, String anotacoesAlergiaAlimento, boolean tratamentoMedicoAtual, String anotacoesTratamento, boolean marcaPasso, boolean medicamentoContinuo, String anotacoesMedicamentoContinuo) {
        super(id, diabetes, hipertensao, hipotensao, tabagismo, epilepsia, proteseDentaria, problemasRespiratorios, anotacoesProblemasRespiratorios, cirurgias, anotacoesCirurgias, exerciciosFisicos, frequenciaExercicios, alcool, frequenciaAlcool, alergiaMedicacao, anotacoesAlergiaMedicacao, alergiaAlimento, anotacoesAlergiaAlimento, tratamentoMedicoAtual, anotacoesTratamento, marcaPasso, medicamentoContinuo, anotacoesMedicamentoContinuo);
        this.anticoncepcional = anticoncepcional;
        this.tipoAnticoncepcional = tipoAnticoncepcional;
        this.cicloMenstrual = cicloMenstrual;
    }

    public boolean isAnticoncepcional() {
        return anticoncepcional;
    }

    public void setAnticoncepcional(boolean anticoncepcional) {
        this.anticoncepcional = anticoncepcional;
    }

    public TipoAnticoncepcional getTipoAnticoncepcional() {
        return tipoAnticoncepcional;
    }

    public void setTipoAnticoncepcional(TipoAnticoncepcional tipoAnticoncepcional) {
        this.tipoAnticoncepcional = tipoAnticoncepcional;
    }

    public CicloMenstrual getCicloMenstrual() {
        return cicloMenstrual;
    }

    public void setCicloMenstrual(CicloMenstrual cicloMenstrual) {
        this.cicloMenstrual = cicloMenstrual;
    }

    @Override
    public String toString() {
        return "AnamneseFeminina{" + "anticoncepcional=" + anticoncepcional + ", tipoAnticoncepcional=" + tipoAnticoncepcional + ", cicloMenstrual=" + cicloMenstrual + '}';
    }
    
    

}
