package com.github.electiva3final.entity;

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
    @Column(name = "ID_HOSPITAL")
    private Long idHospital;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "CIUDAD")
    private String ciudad;
    @Column(name = "TELEFONO")
    private String telefono;
    @JoinColumn(name = "DIRECTOR", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medico director;

    public Hospital() {}
}
