package com.github.electiva3final.entities.pk;

import com.github.electiva3final.entities.Hospital;
import com.github.electiva3final.entities.Medico;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
@Data
public class HospitalServicioPK {

    @JoinColumn(name = "ID_HOSPITAL", referencedColumnName = "ID_HOSPITAL", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Hospital idHospital;
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Servicio idServicio;
}
