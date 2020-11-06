package com.github.electiva3final.repository;

import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.entity.pk.HospitalServicioPK;
import org.springframework.data.repository.CrudRepository;

public interface HospitalServicioRepository extends CrudRepository<HospitalServicio, HospitalServicioPK> {
}
