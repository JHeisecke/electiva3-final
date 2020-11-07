package com.github.electiva3final.controller;

import com.github.electiva3final.dto.ServicioDTO;
import com.github.electiva3final.entity.Servicio;
import com.github.electiva3final.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicio")
public class ServicioController {

    private static final String GET_SERVICIO       = "/get/{idServicio}";
    private static final String SAVE_SERVICIO      = "/save";
    private static final String DELETE_SERVICIO    = "/delete/{idServicio}";

    @Autowired
    private ServicioService servicioService;

    @GetMapping(value = GET_SERVICIO)
    public ResponseEntity<?> getServicio(@PathVariable String idServicio) {
        Servicio entity = servicioService.getServicio(idServicio);
        return new ResponseEntity<>(entity, HttpStatus.OK);
    }

    @PostMapping(value = SAVE_SERVICIO)
    public ResponseEntity<?> saveServicio(@RequestBody ServicioDTO dto) {
        servicioService.saveServicio(dto);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping(value = DELETE_SERVICIO)
    public ResponseEntity<?> deleteServicio(@PathVariable String idServicio) {
        try {
            servicioService.deleteServicio(idServicio);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

