package Clinica.ApiGestionHorario;

public class SalidaDTO {
    private DisponibilidadDTO dis;
    private EspecialidadDTO esp;
    private MedicoDTO med;
    private ConsultorioDTO con;
    private double pre;

    public SalidaDTO() {
    }

    public SalidaDTO(DisponibilidadDTO dis, EspecialidadDTO esp, MedicoDTO med, ConsultorioDTO con, double pre) {
        this.dis = dis;
        this.esp = esp;
        this.med = med;
        this.con = con;
        this.pre = pre;
    }

    public DisponibilidadDTO getDis() {
        return dis;
    }

    public void setDis(DisponibilidadDTO dis) {
        this.dis = dis;
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

    public ConsultorioDTO getCon() {
        return con;
    }

    public void setCon(ConsultorioDTO con) {
        this.con = con;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }
    
    
}
