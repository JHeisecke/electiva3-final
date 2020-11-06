package com.github.electiva3final.service;

import com.github.electiva3final.dto.ConsultaMedicaDTO;
import com.github.electiva3final.entity.ConsultaMedica;

public interface ConsultaMedicaService {
    public void saveConsultaMedica(ConsultaMedicaDTO dto);
    public ConsultaMedica getConsultaMedica(Long id);
}
