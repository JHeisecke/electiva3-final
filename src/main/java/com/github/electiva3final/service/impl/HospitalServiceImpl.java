package com.github.electiva3final.service.impl;

import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.repository.HospitalRepository;
import com.github.electiva3final.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;

    @Override
    public void saveHospital(Hospital hospital) {
        try {
            hospitalRepository.save(hospital);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Hospital getHospital(Long id) {
        Hospital h = new Hospital();
        return h;
    }
}
