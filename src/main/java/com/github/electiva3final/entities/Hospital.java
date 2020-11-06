package com.github.electiva3final.entities;

import lombok.Data;

import javax.persistence.*;

/**
 * The persistent class for the HOSPITAL database table.
 */
@Entity
@Table(name="HOSPITAL", schema = "public")
@Data
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHospital;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CIUDAD")
    private String ciudad;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "DIRECCION")
    private String direccion;
    @JoinColumn(name = "DIRECTOR", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medico director;

    public Hospital() {}
}
