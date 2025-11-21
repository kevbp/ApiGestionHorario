package Clinica.ApiGestionHorario;

public class SlotHorarioDTO {

    private Long id;
    private Long idHor;
    private String horIni;
    private String horFin;
    private String est;

    public SlotHorarioDTO() {
    }

    public SlotHorarioDTO(Long id, Long idHor, String horIni, String horFin, String est) {
        this.id = id;
        this.idHor = idHor;
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

    public Long getIdHor() {
        return idHor;
    }

    public void setIdHor(Long idHor) {
        this.idHor = idHor;
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
