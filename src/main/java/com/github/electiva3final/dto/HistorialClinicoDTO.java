package com.github.electiva3final.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class HistorialClinicoDTO {

    private Long idHistorial;
    private String ciPaciente;
    private Long idConsulta;

    public HistorialClinicoDTO(){}

    public HistorialClinicoDTO(String ciPaciente, Long idConsulta){
        this.ciPaciente = ciPaciente;
        this.idConsulta = idConsulta;
    }
}
