    
package Clinica.ApiGestionHorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiGestionHorario")
public class ApiGestionHorario {
    
    @Autowired
    private ServicioGestionHorario serv;
    
    @PostMapping("/grabar")
    public HorarioDTO grabarHorario(@RequestBody Entrada ent) {
        return serv.grabar(ent);
    }
}
