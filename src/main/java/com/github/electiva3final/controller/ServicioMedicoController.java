package com.github.electiva3final.controller;

import com.github.electiva3final.dto.MedicoHospitalDTO;
import com.github.electiva3final.dto.ServicioMedicoDTO;
import com.github.electiva3final.entity.MedicoHospital;
import com.github.electiva3final.entity.ServicioMedico;
import com.github.electiva3final.exception.BusinessException;
import com.github.electiva3final.service.MedicoHospitalService;
import com.github.electiva3final.service.ServicioMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicio-medico")
public class ServicioMedicoController {

    private static final String GET_MEDICO_SERVICIO    = "/get/{idServicio}/{ciMedico}";
    private static final String SAVE_MEDICO_SERVICIO   = "/save";
    private static final String DELETE_MEDICO_SERVICIO = "/delete/{idServicio}/{ciMedico}";

    @Autowired
    private ServicioMedicoService servicioMedicoService;

    @GetMapping(value = GET_MEDICO_SERVICIO)
    public ResponseEntity<?> getServicioMedico(@PathVariable String idServicio, @PathVariable String ciMedico) {
        try {
            ServicioMedico entity = servicioMedicoService.getServicioMedico(idServicio, ciMedico);
            return new ResponseEntity<>(entity, HttpStatus.OK);
        } catch(BusinessException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = SAVE_MEDICO_SERVICIO)
    public ResponseEntity<?> saveServicioMedico(@RequestBody ServicioMedicoDTO dto) {
        servicioMedicoService.saveServicioMedico(dto);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping(value = DELETE_MEDICO_SERVICIO)
    public ResponseEntity<?> deleteServicioMedico(@PathVariable String idServicio, @PathVariable String ciMedico) {
        try {
            servicioMedicoService.deleteServicioMedico(ciMedico,idServicio);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
