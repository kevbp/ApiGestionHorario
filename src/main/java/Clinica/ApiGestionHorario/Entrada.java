
package Clinica.ApiGestionHorario;

public class Entrada {
    private Long idHor;
    private Long idDis;
    private Long idMed;
    private Long idCon;
    private Long idEsp;
    private double pre;
    private Long idEmp;

    public Entrada() {
    }

    public Entrada(Long idHor, Long idDis, Long idMed, Long idCon, Long idEsp, double pre, Long idEmp) {
        this.idHor = idHor;
        this.idDis = idDis;
        this.idMed = idMed;
        this.idCon = idCon;
        this.idEsp = idEsp;
        this.pre = pre;
        this.idEmp = idEmp;
    }

    public Long getIdHor() {
        return idHor;
    }

    public void setIdHor(Long idHor) {
        this.idHor = idHor;
    }

    

    public Long getIdDis() {
        return idDis;
    }

    public void setIdDis(Long idDis) {
        this.idDis = idDis;
    }

    public Long getIdMed() {
        return idMed;
    }

    public void setIdMed(Long idMed) {
        this.idMed = idMed;
    }

    public Long getIdCon() {
        return idCon;
    }

    public void setIdCon(Long idCon) {
        this.idCon = idCon;
    }

    public Long getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(Long idEsp) {
        this.idEsp = idEsp;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public Long getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(Long idEmp) {
        this.idEmp = idEmp;
    }

    
}
