package com.github.electiva3final.controller;

import com.github.electiva3final.dto.HospitalDTO;
import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hospital")
public class HospitalController {

    private static final String GET_HOSPITAL    = "/get/{id}";
    private static final String SAVE_HOSPITAL    = "/save";

    @Autowired
    private HospitalService hospitalService;

    @GetMapping(value = GET_HOSPITAL)
    public ResponseEntity<?> getHospital(@PathVariable Long id) {
        try {
            Hospital entity = hospitalService.getHospital(id);
            return new ResponseEntity<Hospital>(entity, HttpStatus.OK);
        } catch (Exception e) {
            throw e;
        }
    }

    @PostMapping(value = SAVE_HOSPITAL)
    public ResponseEntity<?> saveHospital(@RequestBody HospitalDTO dto) {
        try {
            hospitalService.saveHospital(dto);
            return new ResponseEntity<Void>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Void>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
