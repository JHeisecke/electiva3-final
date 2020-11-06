package com.github.electiva3final.entities.pk;

import com.github.electiva3final.entities.Hospital;
import com.github.electiva3final.entities.Medico;
import com.github.electiva3final.entities.Servicio;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
@Data
public class MedicoHospitalPK {

    @JoinColumn(name = "ID_HOSPITAL", referencedColumnName = "ID_HOSPITAL", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Hospital idHospital;
    @JoinColumn(name = "CI_MEDICO", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medico ciMedico;
}
