package com.github.electiva3final.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * The persistent class for the CONSULTA_MEDICA database table.
 */
@Entity
@Table(name="CONSULTA_MEDICA", schema = "public")
@Data
public class ConsultaMedica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idConsulta;

    @JoinColumn(name = "ID_HOSPITAL", referencedColumnName = "ID_HOSPITAL", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Hospital idHospital;
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Servicio idServicio;
    @JoinColumn(name = "CI_MEDICO", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medico ciMedico;
    @JoinColumn(name = "CI_PACIENTE", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Paciente ciPaciente;
    @Column(name = "OBSERVACION")
    private String observacion;
    @Column(name = "TRATAMIENTO")
    private String tratamiento;
    @Column(name = "NRO_HABITACION")
    private String nroHabitacion;
    @Column(name = "FEC_INGRESO")
    private LocalDate fecIngreso;
    @Column(name = "FEC_SALIDA")
    private LocalDate fecSalida;
    @Column(name = "INTERNACION")
    private Boolean internacion;
}
