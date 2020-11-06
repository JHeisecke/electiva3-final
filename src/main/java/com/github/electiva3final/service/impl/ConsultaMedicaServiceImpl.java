package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.ConsultaMedicaDTO;
import com.github.electiva3final.entity.ConsultaMedica;
import com.github.electiva3final.repository.ConsultaMedicaRepository;
import com.github.electiva3final.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConsultaMedicaServiceImpl implements ConsultaMedicaService {

    @Autowired
    private ConsultaMedicaRepository consultaMedicaRepository;
    @Autowired
    private MedicoService medicoService;
    @Autowired
    private HospitalService hospitalService;
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private ServicioService servicioService;

    @Override
    public void saveConsultaMedica(ConsultaMedicaDTO dto) {
        ConsultaMedica entity =  ConsultaMedicaDTO.convertToEntity(dto);
        entity.setHospital(hospitalService.getHospital(dto.getIdHospital()));
        entity.setMedico(medicoService.getMedico(dto.getCiMedico()));
        entity.setPaciente(pacienteService.getPaciente(dto.getCiPaciente()));
        entity.setServicio(servicioService.getServicio(dto.getIdServicio()));
        consultaMedicaRepository.save(entity);
    }

    @Override
    public ConsultaMedica getConsultaMedica(Long id) {
        Optional<ConsultaMedica> consultaMedica = consultaMedicaRepository.findById(id);
        //TODO retornar exception
        return consultaMedica.orElse(null);
    }
}
