
package Clinica.ApiGestionHorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apiGestionHorario")
public class ApiGestionHorario {

    @Autowired
    private ServicioGestionHorario serv;

    @PostMapping("/procesarYGrabar")
    public SalidaHorario procesarYGrabar(@RequestBody Entrada ent) {
        return serv.grabar(ent);
    }

    @GetMapping("/buscar")
    public SalidaHorario buscar(@PathVariable Long idHor) {
        return serv.buscar(idHor);
    }
}
