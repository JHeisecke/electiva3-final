package com.github.electiva3final.dto;

import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.entity.Medico;
import com.github.electiva3final.util.DateFormatter;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class HospitalDTO {
    private Long idHospital;
    private String nombre;
    private String ciudad;
    private String telefono;
    private String director;

    public static Hospital convertToEntity(HospitalDTO dto) {
        Hospital entity = new Hospital();
        entity.setIdHospital(dto.getIdHospital());
        entity.setNombre(dto.getNombre());
        entity.setCiudad(dto.getCiudad());
        entity.setTelefono(dto.getTelefono());
        return entity;
    }
}
