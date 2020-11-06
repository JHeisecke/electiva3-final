package com.github.electiva3final.controller;

import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.service.HospitalService;
import com.github.electiva3final.service.HospitalServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital-servicio")
public class HospitalServicioController {

    private static final String GET_HOSPITAL_SERVICIO    = "/get/{idHospital}/{idServicio}";
    private static final String SAVE_HOSPITAL_SERVICIO   = "/save";
    private static final String DELETE_HOSPITAL_SERVICIO = "/delete/{idHospital}/{idServicio}";

    @Autowired
    private HospitalServicioService hospitalServicioService;

    @GetMapping(name = GET_HOSPITAL_SERVICIO)
    public ResponseEntity<?> getHospitalServicio(@PathVariable Long idHospital, @PathVariable String idServicio) {
        HospitalServicio entity = hospitalServicioService.getHospitalServicio(idHospital,idServicio);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }
}
