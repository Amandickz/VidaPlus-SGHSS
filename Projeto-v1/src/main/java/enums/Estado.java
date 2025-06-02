/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 *
 * @author Amanda
 */
public enum Estado {
    
    ACRE("AC"),
    ALAGOAS("AL"),
    AMAPÁ("AP"),
    AMAZONAS("AM"),
    BAHIA("BA"),
    CEARÁ("CE"),
    DISTRITO_FEDERAL("DF"),
    ESPIRITO_SANTOS("ES"),
    GOIÁS("GO"),
    MARANHÃO("MA"),
    MATO_GROSSO("MT"),
    MATO_GROSSO_DO_SUL("MS"),
    MINAS_GERAIS("MG"),
    PARÁ("PA"),
    PARAÍBA("PB"),
    PARANÁ("PR"),
    PERNAMBUCO("PE"),
    PIAUÍ("PI"),
    RIO_DE_JANEIRO("RJ"),
    RIO_GRANDE_DO_NORTE("RN"),
    RIO_GRANDE_DO_SUL("RS"),
    RONDÔNIA("RO"),
    RORAIMA("RR"),
    SANTA_CATARINA("SC"),
    SÃO_PAULO("SP"),
    SERGIPE("SE"),
    TOCANTINS("TO");
    
    private String estado;


    Estado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
    
}


/*

*/