package Clinica.ApiGestionHorario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicioGestionHorario {

    @Autowired
    private RestTemplate resTem;
    
    public HorarioDTO grabar(Entrada ent) {
        String urlSal = "http://ApiNuevoHorario/apiNuevoHorario/salida";
        SalidaDTO sal = resTem.getForObject(urlSal, SalidaDTO.class);
        
        HorarioDTO hor = new HorarioDTO();
        hor.setIdCon(sal.getCon().getIdCon());
        hor.setIdMed(sal.getMed().getId());
        hor.setIdDis(sal.getDis().getId());
        hor.setIdEsp(sal.getEsp().getId());
        hor.setIdEmp(ent.getIdEmp());
        hor.setFec(sal.getDis().getFec());
        hor.setHorIni(sal.getDis().getHorIni());
        hor.setHorFin(sal.getDis().getHorFin());
        hor.setPre(sal.getPre());
        hor.setEst("Activo");
        
        String urlHor = "http://ApiHorario/horario/grabar";
        HorarioDTO horReg = resTem.postForObject(urlHor, hor, HorarioDTO.class);
        
        return horReg;
    }

}
