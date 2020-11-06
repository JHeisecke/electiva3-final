package com.github.electiva3final.dto;

import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.entity.pk.HospitalServicioPK;
import com.github.electiva3final.service.HospitalService;
import lombok.Data;

@Data
public class HospitalServicioDTO {
    private Long idHospital;
    private Long camasDisponibles;
    private Long camasTotal;
    private String idServicio;

    public static HospitalServicio convertToEntity(HospitalServicioDTO dto) {
        HospitalServicio entity = new HospitalServicio();
        entity.setCamasDisponibles(dto.getCamasDisponibles());
        entity.setCamasTotal(dto.getCamasTotal());
        return entity;
    }
}
