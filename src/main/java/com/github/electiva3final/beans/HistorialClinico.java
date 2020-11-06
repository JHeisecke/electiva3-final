package com.github.electiva3final.beans;

import lombok.Data;

import javax.persistence.*;

/**
 * The persistent class for the HISTORIAL_CLINICO database table.
 */
@Entity
@Table(name="HISTORIAL_CLINICO", schema = "public")
@Data
public class HistorialClinico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorial;
    @Column(name = "CI_PACIENTE")
    private String ciPaciente;
    @Column(name = "ID_CONSULTA")
    private String idConsulta;

    public HistorialClinico(){}

}
