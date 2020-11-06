package com.github.electiva3final.dto;

import com.github.electiva3final.entity.Paciente;
import com.github.electiva3final.util.DateFormatter;
import lombok.Data;

@Data
public class PacienteDTO {
    private String ci;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;

    public static Paciente convertToEntity(PacienteDTO dto) {
        Paciente entity = new Paciente();
        entity.setApellido(dto.getApellido());
        entity.setNombre(dto.getNombre());
        entity.setCi(dto.getCi());
        entity.setFechaNacimiento(DateFormatter.convertToDate(dto.getFechaNacimiento()));
        return entity;
    }
}
