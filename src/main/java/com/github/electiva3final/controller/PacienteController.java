package com.github.electiva3final.controller;

import com.github.electiva3final.dto.PacienteDTO;
import com.github.electiva3final.entity.Paciente;
import com.github.electiva3final.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    private static final String GET_PACIENTE     = "/get/{ci}";
    private static final String SAVE_PACIENTE    = "/save";
    private static final String DELETE_PACIENTE  = "/delete/{ci}";

    @Autowired
    private PacienteService pacienteService;

    @GetMapping(value = GET_PACIENTE)
    public ResponseEntity<?> getPaciente(@PathVariable String ci) {
        Paciente entity = pacienteService.getPaciente(ci);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping(value = SAVE_PACIENTE)
    public ResponseEntity<?> savePaciente(@RequestBody PacienteDTO dto) {
        pacienteService.savePaciente(dto);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping(value = DELETE_PACIENTE)
    public ResponseEntity<?> deletePaciente(@PathVariable String ci) {
        try {
            pacienteService.deletePaciente(ci);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
