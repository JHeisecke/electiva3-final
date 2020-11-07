package com.github.electiva3final.repository;

import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.entity.ServicioMedico;
import com.github.electiva3final.entity.pk.HospitalServicioPK;
import com.github.electiva3final.entity.pk.ServicioMedicoPK;
import org.springframework.data.repository.CrudRepository;

public interface ServicioMedicoRepository extends CrudRepository<ServicioMedico, ServicioMedicoPK> {
}
