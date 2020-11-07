package com.github.electiva3final.service;

import com.github.electiva3final.dto.HospitalDTO;
import com.github.electiva3final.entity.Hospital;

import java.util.List;

public interface HospitalService {
    void saveHospital(HospitalDTO dto);
    Hospital getHospital(Long id);
    void deleteHospital(Long id);
    List<Hospital> getAllHospital();
}
