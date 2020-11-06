package com.github.electiva3final.dto;

import lombok.Data;

import javax.persistence.*;

@Data
public class HistorialClinicoDTO {

    private Long idHistorial;
    private String ciPaciente;
    private Long idConsulta;

    public HistorialClinicoDTO(){}

}
