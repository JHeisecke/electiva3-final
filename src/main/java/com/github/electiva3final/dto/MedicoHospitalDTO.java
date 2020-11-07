package com.github.electiva3final.dto;

import com.github.electiva3final.entity.HospitalServicio;
import lombok.Data;

@Data
public class MedicoHospitalDTO {
    private String ciMedico;
    private Long idHospital;
    private Boolean ocupaDireccion;
}
