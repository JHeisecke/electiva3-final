package com.github.electiva3final.controller;

import com.github.electiva3final.dto.ConsultaMedicaDTO;
import com.github.electiva3final.dto.HospitalDTO;
import com.github.electiva3final.entity.ConsultaMedica;
import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.exception.BusinessException;
import com.github.electiva3final.service.ConsultaMedicaService;
import com.github.electiva3final.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consulta-medica")
public class ConsultaMedicaController {

    private static final String GET_CONSULTA_MEDICA    = "/get/{id}";
    private static final String SAVE_CONSULTA_MEDICA   = "/save";
    private static final String DELETE_CONSULTA_MEDICA   = "/delete/{id}";

    @Autowired
    private ConsultaMedicaService consultaMedicaService;

    @GetMapping(value = GET_CONSULTA_MEDICA)
    public ResponseEntity<?> getConsultaMedica(@PathVariable Long id) {
        ConsultaMedica entity = consultaMedicaService.getConsultaMedica(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping(value = SAVE_CONSULTA_MEDICA)
    public ResponseEntity<?> saveConsultaMedica(@RequestBody ConsultaMedicaDTO dto) {
        try {
            consultaMedicaService.saveConsultaMedica(dto);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch(BusinessException e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = DELETE_CONSULTA_MEDICA)
    public ResponseEntity<?> deleteConsultaMedica(@PathVariable Long id) {
        try {
            consultaMedicaService.deleteConsultaMedica(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
