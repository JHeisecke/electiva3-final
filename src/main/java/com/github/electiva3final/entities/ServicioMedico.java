package com.github.electiva3final.entities;

import com.github.electiva3final.entities.pk.MedicoHospitalPK;
import com.github.electiva3final.entities.pk.ServicioMedicoPK;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the MEDICO_HOSPITAL database table.
 */
@Entity
@Table(name="MEDICO_HOSPITAL", schema = "public")
@Data
public class ServicioMedico {
    @EmbeddedId
    private ServicioMedicoPK pk;

    public ServicioMedico() {}

}
