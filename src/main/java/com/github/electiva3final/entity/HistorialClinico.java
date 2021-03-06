package com.github.electiva3final.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "CI_PACIENTE", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Paciente paciente;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "ID_CONSULTA", referencedColumnName = "ID_CONSULTA", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private ConsultaMedica consulta;

    public HistorialClinico(){}

}
