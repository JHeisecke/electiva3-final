package com.github.electiva3final.entity.pk;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.entity.Medico;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
@Data
public class MedicoHospitalPK implements Serializable {

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "ID_HOSPITAL", referencedColumnName = "ID_HOSPITAL", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Hospital hospital;
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "CI_MEDICO", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Medico medico;
}
