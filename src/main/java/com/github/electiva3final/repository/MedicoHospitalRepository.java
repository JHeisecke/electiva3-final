package com.github.electiva3final.repository;

import com.github.electiva3final.entity.MedicoHospital;
import com.github.electiva3final.entity.pk.MedicoHospitalPK;
import org.springframework.data.repository.CrudRepository;

public interface MedicoHospitalRepository extends CrudRepository<MedicoHospital, MedicoHospitalPK> {
}
