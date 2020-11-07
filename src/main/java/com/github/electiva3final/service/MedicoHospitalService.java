package com.github.electiva3final.service;

import com.github.electiva3final.dto.MedicoHospitalDTO;
import com.github.electiva3final.entity.MedicoHospital;
import com.github.electiva3final.exception.BusinessException;

public interface MedicoHospitalService {
    public void saveMedicoHospital(MedicoHospitalDTO dto);
    public MedicoHospital getMedicoHospital(Long idHospital, String ciMedico) throws BusinessException;
    public void deleteMedicoHospital(Long idHospital, String ciMedico);

}
