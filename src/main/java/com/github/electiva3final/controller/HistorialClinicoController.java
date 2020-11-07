package com.github.electiva3final.controller;

import com.github.electiva3final.dto.HistorialClinicoDTO;
import com.github.electiva3final.entity.HistorialClinico;
import com.github.electiva3final.service.HistorialClinicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/historial-clinico")
public class HistorialClinicoController {

    private static final String GET_HISTORIAL_CLINICO       = "/get/{id}";
    private static final String SAVE_HISTORIAL_CLINICO      = "/save";
    private static final String DELETE_HISTORIAL_CLINICO    = "/delete/{id}";

    @Autowired
    private HistorialClinicoService historialClinicoService;

    @GetMapping(value = GET_HISTORIAL_CLINICO)
    public ResponseEntity<?> getHistorialClinico(@PathVariable Long id) {
        HistorialClinico entity = historialClinicoService.getHistorialClinico(id);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping(value = SAVE_HISTORIAL_CLINICO)
    public ResponseEntity<?> saveHistorialClinico(@RequestBody HistorialClinicoDTO dto) {
        historialClinicoService.saveHistorialClinico(dto);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping(value = DELETE_HISTORIAL_CLINICO)
    public ResponseEntity<?> deleteHistorialClinico(@PathVariable Long id) {
        try {
            historialClinicoService.deleteHistorialClinico(id);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
