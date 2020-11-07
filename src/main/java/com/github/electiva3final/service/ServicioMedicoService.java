package com.github.electiva3final.service;

import com.github.electiva3final.dto.HospitalServicioDTO;
import com.github.electiva3final.dto.ServicioMedicoDTO;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.entity.ServicioMedico;
import com.github.electiva3final.exception.BusinessException;

public interface ServicioMedicoService {
    public void saveServicioMedico(ServicioMedicoDTO dto);
    public ServicioMedico getServicioMedico(String ciMedico, String idServicio) throws BusinessException;
    public void deleteServicioMedico(String ciMedico, String idServicio);

}
