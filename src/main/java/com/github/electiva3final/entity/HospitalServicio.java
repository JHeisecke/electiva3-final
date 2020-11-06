package com.github.electiva3final.entity;

import com.github.electiva3final.entity.pk.HospitalServicioPK;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the HOSPITAL_SERVICIO database table.
 */
@Entity
@Table(name="HOSPITAL_SERVICIO", schema = "public")
@Data
public class HospitalServicio {

    @EmbeddedId
    private HospitalServicioPK pk;
    @Column(name = "CAMAS_DISPONIBLES")
    private Long camasDisponibles;
    @Column(name = "CAMAS_TOTAL")
    private Long camasTotal;

    public HospitalServicio() {}

}
