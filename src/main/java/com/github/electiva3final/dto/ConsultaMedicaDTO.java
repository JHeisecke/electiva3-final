package com.github.electiva3final.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.electiva3final.entity.*;
import com.github.electiva3final.util.DateFormatter;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data
public class ConsultaMedicaDTO {
    private Long idConsulta;
    private Long idHospital;
    private String idServicio;
    private String ciMedico;
    private String ciPaciente;
    private String observacion;
    private String tratamiento;
    private String nroHabitacion;
    private String fecIngreso;
    private String fecSalida;
    private Boolean internacion;

    public static ConsultaMedica convertToEntity(ConsultaMedicaDTO dto) {
        ConsultaMedica entity = new ConsultaMedica();
        entity.setIdConsulta(dto.getIdConsulta());
        entity.setObservacion(dto.getObservacion());
        entity.setTratamiento(dto.getTratamiento());
        entity.setNroHabitacion(dto.getNroHabitacion());
        entity.setFecIngreso(DateFormatter.convertToDateTime(dto.getFecIngreso()));
        entity.setFecSalida(DateFormatter.convertToDateTime(dto.getFecSalida()));
        entity.setInternacion(dto.getInternacion());
        return entity;
    }
}
