package com.github.electiva3final.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * The persistent class for the CONSULTA_MEDICA database table.
 */
@Entity
@Table(name="CONSULTA_MEDICA", schema = "public")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class ConsultaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONSULTA")
    private Long idConsulta;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "ID_HOSPITAL", referencedColumnName = "ID_HOSPITAL", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Hospital hospital;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Servicio servicio;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "CI_MEDICO", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medico medico;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "TRATAMIENTO")
    private String tratamiento;
    @Column(name = "NRO_HABITACION")
    private String nroHabitacion;
    @Column(name = "FEC_INGRESO")
    private LocalDateTime fecIngreso;
    @Column(name = "FEC_SALIDA")
    private LocalDateTime fecSalida;
    @Column(name = "INTERNACION")
    private Boolean internacion;
}
