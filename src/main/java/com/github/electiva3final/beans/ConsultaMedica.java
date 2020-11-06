package com.github.electiva3final.beans;

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
    @Column(name = "ID_HOSPITAL")
    private String idHospital;
    @Column(name = "ID_SERVICIO")
    private String idServicio;
    @Column(name = "CI_MEDICO")
    private String ciMedico;
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
