package com.github.electiva3final.service;

import com.github.electiva3final.dto.MedicoHospitalDTO;
import com.github.electiva3final.entity.MedicoHospital;

public interface MedicoHospitalService {
    public void saveMedicoHospital(MedicoHospitalDTO dto);
    public MedicoHospital getMedicoHospital(Long idHospital, String ciMedico);
    public void deleteMedicoHospital(Long idHospital, String ciMedico);

}
