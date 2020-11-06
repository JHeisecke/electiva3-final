package com.github.electiva3final.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * The persistent class for the MEDICO database table.
 */
@Entity
@Table(name="MEDICO", schema = "public")
@Data
public class Medico {
    @Id
    @Column(name = "CI")
    private String ci;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "FEC_NACIMIENTO")
    private LocalDate fechaNacimiento;
    public Medico(){}

}
