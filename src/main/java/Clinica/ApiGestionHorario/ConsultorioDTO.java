package Clinica.ApiGestionHorario;

public class ConsultorioDTO {

    private Long idCon;
    private String des;
    private String est;

    public ConsultorioDTO() {
    }

    public ConsultorioDTO(Long idCon, String des, String est) {
        this.idCon = idCon;
        this.des = des;
        this.est = est;
    }

    public Long getIdCon() {
        return idCon;
    }

    public void setIdCon(Long idCon) {
        this.idCon = idCon;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

}
