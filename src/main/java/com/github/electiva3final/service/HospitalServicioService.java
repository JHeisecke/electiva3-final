package com.github.electiva3final.service;

import com.github.electiva3final.dto.HospitalServicioDTO;
import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.exception.BusinessException;

public interface HospitalServicioService {
    void saveHospitalServicio(HospitalServicioDTO dto);
    HospitalServicio getHospitalServicio(Long idHospital, String idServicio) throws BusinessException;
    void deleteHospitalServicio(Long idHospital, String idServicio);
    void save(HospitalServicio entity);

}
