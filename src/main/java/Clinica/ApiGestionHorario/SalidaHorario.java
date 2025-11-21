
package Clinica.ApiGestionHorario;

import java.util.List;

public class SalidaHorario {
    private Long id;
    private String fec;
    private String horIni;
    private String horFin;
    private DisponibilidadDTO dis;
    private ConsultorioDTO con;
    private EspecialidadDTO esp;
    private MedicoDTO med;
    private List<SlotHorarioDTO> lisSlo;
    private double pre;
    private String est;
    private EmpleadoDTO emp;

    public SalidaHorario() {
    }

    public SalidaHorario(Long id, String fec, String horIni, String horFin, DisponibilidadDTO dis, ConsultorioDTO con, EspecialidadDTO esp, MedicoDTO med, List<SlotHorarioDTO> lisSlo, double pre, String est, EmpleadoDTO emp) {
        this.id = id;
        this.fec = fec;
        this.horIni = horIni;
        this.horFin = horFin;
        this.dis = dis;
        this.con = con;
        this.esp = esp;
        this.med = med;
        this.lisSlo = lisSlo;
        this.pre = pre;
        this.est = est;
        this.emp = emp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public DisponibilidadDTO getDis() {
        return dis;
    }

    public void setDis(DisponibilidadDTO dis) {
        this.dis = dis;
    }

    public ConsultorioDTO getCon() {
        return con;
    }

    public void setCon(ConsultorioDTO con) {
        this.con = con;
    }

    public EspecialidadDTO getEsp() {
        return esp;
    }

    public void setEsp(EspecialidadDTO esp) {
        this.esp = esp;
    }

    public MedicoDTO getMed() {
        return med;
    }

    public void setMed(MedicoDTO med) {
        this.med = med;
    }

    public List<SlotHorarioDTO> getLisSlo() {
        return lisSlo;
    }

    public void setLisSlo(List<SlotHorarioDTO> lisSlo) {
        this.lisSlo = lisSlo;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public EmpleadoDTO getEmp() {
        return emp;
    }

    public void setEmp(EmpleadoDTO emp) {
        this.emp = emp;
    }
    
}
