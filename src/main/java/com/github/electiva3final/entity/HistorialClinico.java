package com.github.electiva3final.entity;

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
    @JoinColumn(name = "CI_PACIENTE", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente paciente;
    @JoinColumn(name = "ID_CONSULTA", referencedColumnName = "ID_CONSULTA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ConsultaMedica consulta;

    public HistorialClinico(){}

}
