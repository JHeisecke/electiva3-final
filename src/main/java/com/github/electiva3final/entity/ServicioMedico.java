package com.github.electiva3final.entity;

import com.github.electiva3final.entity.pk.ServicioMedicoPK;
import lombok.Data;

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
