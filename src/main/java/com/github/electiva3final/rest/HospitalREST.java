package com.github.electiva3final.rest;

import com.github.electiva3final.beans.Hospital;
import com.github.electiva3final.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hospital")
public class HospitalREST {

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
}
