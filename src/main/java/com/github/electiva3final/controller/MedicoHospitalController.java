package com.github.electiva3final.controller;

import com.github.electiva3final.dto.HospitalServicioDTO;
import com.github.electiva3final.dto.MedicoHospitalDTO;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.entity.MedicoHospital;
import com.github.electiva3final.exception.BusinessException;
import com.github.electiva3final.service.HospitalServicioService;
import com.github.electiva3final.service.MedicoHospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medico-hospital")
public class MedicoHospitalController {

    private static final String GET_MEDICO_HOSPITAL    = "/get/{idHospital}/{ciMedico}";
    private static final String SAVE_MEDICO_HOSPITAL   = "/save";
    private static final String DELETE_MEDICO_HOSPITAL = "/delete/{idHospital}/{ciMedico}";

    @Autowired
    private MedicoHospitalService medicoHospitalService;

    @GetMapping(value = GET_MEDICO_HOSPITAL)
    public ResponseEntity<?> getMedicoHospital(@PathVariable Long idHospital, @PathVariable String ciMedico)
            throws BusinessException {
        MedicoHospital entity = medicoHospitalService.getMedicoHospital(idHospital, ciMedico);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping(value = SAVE_MEDICO_HOSPITAL)
    public ResponseEntity<?> saveMedicoHospital(@RequestBody MedicoHospitalDTO dto) {
        medicoHospitalService.saveMedicoHospital(dto);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping(value = DELETE_MEDICO_HOSPITAL)
    public ResponseEntity<?> deleteMedicoHospital(@PathVariable Long idHospital, @PathVariable String ciMedico) {
        try {
            medicoHospitalService.deleteMedicoHospital(idHospital,ciMedico);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
