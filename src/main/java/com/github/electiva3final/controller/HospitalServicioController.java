package com.github.electiva3final.controller;

import com.github.electiva3final.dto.HospitalServicioDTO;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.service.HospitalServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hospital-servicio")
public class HospitalServicioController {

    private static final String GET_HOSPITAL_SERVICIO    = "/get/{idHospital}/{idServicio}";
    private static final String SAVE_HOSPITAL_SERVICIO   = "/save";
    private static final String DELETE_HOSPITAL_SERVICIO = "/delete/{idHospital}/{idServicio}";

    @Autowired
    private HospitalServicioService hospitalServicioService;

    @GetMapping(value = GET_HOSPITAL_SERVICIO)
    public ResponseEntity<?> getHospitalServicio(@PathVariable Long idHospital, @PathVariable String idServicio) {
        HospitalServicio entity = hospitalServicioService.getHospitalServicio(idHospital,idServicio);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping(value = SAVE_HOSPITAL_SERVICIO)
    public ResponseEntity<?> saveHospitalServicio(@RequestBody HospitalServicioDTO dto) {
        try {
            hospitalServicioService.saveHospitalServicio(dto);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = DELETE_HOSPITAL_SERVICIO)
    public ResponseEntity<?> deleteHospitalServicio(@PathVariable Long idHospital, @PathVariable String idServicio) {
        try {
            hospitalServicioService.deleteHospitalServicio(idHospital, idServicio);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
