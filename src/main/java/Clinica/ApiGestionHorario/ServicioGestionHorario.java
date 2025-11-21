package Clinica.ApiGestionHorario;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServicioGestionHorario {

    @Autowired
    private RestTemplate resTem;
    private static final DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("HH:mm");

    public SalidaHorario grabar(Entrada ent) {

        Long idDis = ent.getIdDis();
        Long idMed = ent.getIdMed();
        Long idCon = ent.getIdCon();
        Long idEsp = ent.getIdEsp();
        double pre = ent.getPre();
        Long idEmp = ent.getIdEmp();

        String urlDis = "http://ApiDisponibilidad/disponibilidad/buscar/" + idDis;
        String urlMed = "http://ApiMedico/medico/buscar/" + idMed;
        String urlCon = "http://ApiConsultorio/consultorio/buscar/" + idCon;
        String urlEsp = "http://ApiEspecialidad/especialidad/buscar/" + idEsp;
        String urlEmp = "http://ApiEmpleado/empleado/buscar/" + idEmp;

        DisponibilidadDTO dis = resTem.getForObject(urlDis, DisponibilidadDTO.class);
        MedicoDTO med = resTem.getForObject(urlMed, MedicoDTO.class);
        ConsultorioDTO con = resTem.getForObject(urlCon, ConsultorioDTO.class);
        EspecialidadDTO esp = resTem.getForObject(urlEsp, EspecialidadDTO.class);
        EmpleadoDTO emp = resTem.getForObject(urlEmp, EmpleadoDTO.class);

        HorarioDTO hor = new HorarioDTO();
        hor.setIdCon(con.getIdCon());
        hor.setIdMed(med.getId());
        hor.setIdDis(dis.getId());
        hor.setIdEsp(esp.getId());
        hor.setIdEmp(emp.getId());
        hor.setFec(dis.getFec().toString());
        hor.setHorIni(dis.getHorIni().toString());
        hor.setHorFin(dis.getHorFin().toString());
        hor.setPre(ent.getPre());
        hor.setEst("Activo");

        String urlGraHor = "http://ApiHorario/horario/grabar";
        HorarioDTO horReg = resTem.postForObject(urlGraHor, hor, HorarioDTO.class);

        List<SlotHorarioDTO> lisSlo = generarSlots(
                dis.getHorIni().toString(),
                dis.getHorFin().toString(),
                horReg.getId()
        );

        String urlGraSlo = "http://ApiSlotHorario/slotHorario/grabar";
        for (SlotHorarioDTO slot : lisSlo) {
            resTem.postForObject(urlGraSlo, slot, SlotHorarioDTO.class);
        }

        return buscar(horReg.getId());
    }

    public SalidaHorario buscar(Long id) {

        String urlBusHor = "http://ApiHorario/horario/buscar/" + id;
        HorarioDTO hor = resTem.getForObject(urlBusHor, HorarioDTO.class);

        String urlDis = "http://ApiDisponibilidad/disponibilidad/buscar/" + hor.getIdDis();
        String urlMed = "http://ApiMedico/medico/buscar/" + hor.getIdMed();
        String urlCon = "http://ApiConsultorio/consultorio/buscar/" + hor.getIdCon();
        String urlEsp = "http://ApiEspecialidad/especialidad/buscar/" + hor.getIdEsp();
        String urlEmp = "http://ApiEmpleado/empleado/buscar/" + hor.getIdEmp();
        String urlLisSlo = "http://ApiSlotHorario/slotHorario/listarPorHorario/" + hor.getId();

        DisponibilidadDTO dis = resTem.getForObject(urlDis, DisponibilidadDTO.class);
        MedicoDTO med = resTem.getForObject(urlMed, MedicoDTO.class);
        ConsultorioDTO con = resTem.getForObject(urlCon, ConsultorioDTO.class);
        EspecialidadDTO esp = resTem.getForObject(urlEsp, EspecialidadDTO.class);
        EmpleadoDTO emp = resTem.getForObject(urlEmp, EmpleadoDTO.class);
        ResponseEntity<List<SlotHorarioDTO>> resLisSlo = resTem.exchange(urlLisSlo, HttpMethod.GET, null, new ParameterizedTypeReference<List<SlotHorarioDTO>>() {
        });
        List<SlotHorarioDTO> lisSlo = resLisSlo.getBody();

        SalidaHorario salHor = new SalidaHorario();

        salHor.setId(hor.getId());
        salHor.setFec(hor.getFec());
        salHor.setHorFin(hor.getHorFin());
        salHor.setDis(dis);
        salHor.setMed(med);
        salHor.setLisSlo(lisSlo);
        salHor.setCon(con);
        salHor.setEsp(esp);
        salHor.setPre(hor.getPre());
        salHor.setEst(hor.getEst());
        salHor.setEmp(emp);

        return salHor;
    }

    private List<SlotHorarioDTO> generarSlots(String horaInicioStr, String horaFinStr, Long idHorario) {

        List<SlotHorarioDTO> listaSlots = new ArrayList<>();

        LocalTime horaActual = LocalTime.parse(horaInicioStr);
        LocalTime horaLimite = LocalTime.parse(horaFinStr);

        int duracionMinutos = 20;

        while (horaActual.plusMinutes(duracionMinutos).isBefore(horaLimite)
                || horaActual.plusMinutes(duracionMinutos).equals(horaLimite)) {

            LocalTime horaFinSlot = horaActual.plusMinutes(duracionMinutos);

            SlotHorarioDTO slot = new SlotHorarioDTO();
            slot.setIdHor(idHorario);
            slot.setHorIni(horaActual.format(fmtHora));
            slot.setHorFin(horaFinSlot.format(fmtHora));
            slot.setEst("Disponible");

            listaSlots.add(slot);

            horaActual = horaFinSlot;
        }

        return listaSlots;
    }

}
