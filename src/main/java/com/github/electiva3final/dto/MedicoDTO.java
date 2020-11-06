package com.github.electiva3final.dto;

import com.github.electiva3final.entity.Medico;
import com.github.electiva3final.util.DateFormatter;
import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Data
public class MedicoDTO {
    private String ci;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    public static Medico convertToEntity(MedicoDTO dto) {
        Medico entity = new Medico();
        entity.setApellido(dto.getApellido());
        entity.setNombre(dto.getNombre());
        entity.setCi(dto.getCi());
        entity.setFechaNacimiento(DateFormatter.convertToDateTime(dto.getFechaNacimiento()));
        return entity;
    }
}
