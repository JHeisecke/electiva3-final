package com.github.electiva3final.controller;

import com.github.electiva3final.dto.MedicoDTO;
import com.github.electiva3final.entity.Medico;
import com.github.electiva3final.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    private static final String GET_MEDICO     = "/get/{ci}";
    private static final String SAVE_MEDICO    = "/save";
    private static final String DELETE_MEDICO  = "/delete/{ci}";

    @Autowired
    private MedicoService medicoService;

    @GetMapping(value = GET_MEDICO)
    public ResponseEntity<?> getMedico(@PathVariable String ci) {
        Medico entity = medicoService.getMedico(ci);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping(value = SAVE_MEDICO)
    public ResponseEntity<?> saveMedico(@RequestBody MedicoDTO dto) {
        try {
            medicoService.saveMedico(dto);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = DELETE_MEDICO)
    public ResponseEntity<?> deleteMedico(@PathVariable String ci) {
        try {
            medicoService.deleteMedico(ci);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
