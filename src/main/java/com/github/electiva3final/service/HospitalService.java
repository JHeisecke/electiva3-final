package com.github.electiva3final.service;

import com.github.electiva3final.dto.HospitalDTO;
import com.github.electiva3final.entity.Hospital;

public interface HospitalService {
    public void saveHospital(HospitalDTO dto);
    public Hospital getHospital(Long id);
}
