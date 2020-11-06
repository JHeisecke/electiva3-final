package com.github.electiva3final.service;

import com.github.electiva3final.dto.HospitalServicioDTO;
import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.entity.HospitalServicio;

public interface HospitalServicioService {
    public void saveHospitalServicio(HospitalServicioDTO dto);
    public HospitalServicio getHospitalServicio(Long idHospital, String idServicio);
    public void deleteHospitalServicio(Long idHospital, String idServicio);

}
