package com.github.electiva3final.service.impl;

import com.github.electiva3final.beans.Hospital;
import com.github.electiva3final.service.HospitalService;
import org.springframework.stereotype.Service;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Override
    public void saveHospital(Hospital hospital) throws Exception {

    }

    @Override
    public Hospital getHospital(Long id) {
        return new Hospital(id,"nombre","asd","asd","asd");
    }
}
