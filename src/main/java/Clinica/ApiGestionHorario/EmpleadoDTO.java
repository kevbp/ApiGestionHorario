package Clinica.ApiGestionHorario;

public class EmpleadoDTO {

    private Long id;
    private String nom;
    private String car;

    public EmpleadoDTO() {
    }

    public EmpleadoDTO(Long id, String nom, String car) {
        this.id = id;
        this.nom = nom;
        this.car = car;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
    
}
