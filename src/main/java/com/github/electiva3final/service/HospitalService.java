package com.github.electiva3final.service;

import com.github.electiva3final.entities.Hospital;

public interface HospitalService {
    public void saveHospital(Hospital hospital) throws Exception;
    public Hospital getHospital(Long id);
}
