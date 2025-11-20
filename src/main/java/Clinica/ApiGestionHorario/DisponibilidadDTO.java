/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiGestionHorario;

public class DisponibilidadDTO {
    private Long id;
    private Long idMed;
    private String fec;
    private String horIni;
    private String horFin;
    private String est;

    public DisponibilidadDTO() {
    }

    public DisponibilidadDTO(Long id, Long idMed, String fec, String horIni, String horFin, String est) {
        this.id = id;
        this.idMed = idMed;
        this.fec = fec;
        this.horIni = horIni;
        this.horFin = horFin;
        this.est = est;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdMed() {
        return idMed;
    }

    public void setIdMed(Long idMed) {
        this.idMed = idMed;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public String getHorIni() {
        return horIni;
    }

    public void setHorIni(String horIni) {
        this.horIni = horIni;
    }

    public String getHorFin() {
        return horFin;
    }

    public void setHorFin(String horFin) {
        this.horFin = horFin;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }


    
    
}
