package com.github.electiva3final.service;

import com.github.electiva3final.dto.ConsultaMedicaDTO;
import com.github.electiva3final.entity.ConsultaMedica;
import com.github.electiva3final.exception.BusinessException;

public interface ConsultaMedicaService {
    public void saveConsultaMedica(ConsultaMedicaDTO dto) throws BusinessException;
    public ConsultaMedica getConsultaMedica(Long id);
    public void deleteConsultaMedica(Long id);
}
