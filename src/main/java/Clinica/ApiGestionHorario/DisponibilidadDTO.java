
package Clinica.ApiGestionHorario;

import java.time.LocalDate;
import java.time.LocalTime;

public class DisponibilidadDTO {

    private Long id;
    private Long idMed;
    private Long idEsp;
    private LocalDate fec;
    private LocalTime horIni;
    private LocalTime horFin;
    private String est;

    public DisponibilidadDTO() {
    }

    public DisponibilidadDTO(Long id, Long idMed, Long idEsp, LocalDate fec, LocalTime horIni, LocalTime horFin, String est) {
        this.id = id;
        this.idMed = idMed;
        this.idEsp = idEsp;
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

    public Long getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(Long idEsp) {
        this.idEsp = idEsp;
    }

    public LocalDate getFec() {
        return fec;
    }

    public void setFec(LocalDate fec) {
        this.fec = fec;
    }

    public LocalTime getHorIni() {
        return horIni;
    }

    public void setHorIni(LocalTime horIni) {
        this.horIni = horIni;
    }

    public LocalTime getHorFin() {
        return horFin;
    }

    public void setHorFin(LocalTime horFin) {
        this.horFin = horFin;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    
}
