package com.github.electiva3final.entities;

import com.github.electiva3final.entities.pk.MedicoHospitalPK;
import lombok.Data;

import javax.persistence.*;

/**
 * The persistent class for the MEDICO_HOSPITAL database table.
 */
@Entity
@Table(name="MEDICO_HOSPITAL", schema = "public")
@Data
public class MedicoHospital {
    @EmbeddedId
    private MedicoHospitalPK pk;
    @Column(name = "OCUPA_DIRECCION")
    private Boolean ocupaDireccion;

    public MedicoHospital() {}

}
