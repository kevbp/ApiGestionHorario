/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clinica.ApiGestionHorario;

public class MedicoDTO {
    
    private Long id;
    private String nom;
    private Long idEsp;

    public MedicoDTO() {
    }

    public MedicoDTO(Long id, String nom, Long idEsp) {
        this.id = id;
        this.nom = nom;
        this.idEsp = idEsp;
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

    public Long getIdEsp() {
        return idEsp;
    }

    public void setIdEsp(Long idEsp) {
        this.idEsp = idEsp;
    }

}
