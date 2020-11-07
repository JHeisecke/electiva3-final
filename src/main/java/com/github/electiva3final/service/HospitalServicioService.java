package com.github.electiva3final.service;

import com.github.electiva3final.dto.HospitalServicioDTO;
import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.entity.HospitalServicio;

public interface HospitalServicioService {
    void saveHospitalServicio(HospitalServicioDTO dto);
    HospitalServicio getHospitalServicio(Long idHospital, String idServicio);
    void deleteHospitalServicio(Long idHospital, String idServicio);
    void save(HospitalServicio entity);

}
