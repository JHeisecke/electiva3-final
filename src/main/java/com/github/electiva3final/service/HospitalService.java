package com.github.electiva3final.service;

import com.github.electiva3final.entity.Hospital;

public interface HospitalService {
    public void saveHospital(Hospital hospital);
    public Hospital getHospital(Long id);
}
