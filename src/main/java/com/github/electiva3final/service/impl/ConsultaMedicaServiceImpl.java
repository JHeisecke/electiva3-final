package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.ConsultaMedicaDTO;
import com.github.electiva3final.entity.ConsultaMedica;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.exception.BusinessException;
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
    private HospitalServicioService hospitalServicioService;
    @Autowired
    private HospitalService hospitalService;
    @Autowired
    private ServicioService servicioService;
    @Autowired
    private MedicoService medicoService;

    @Override
    public void saveConsultaMedica(ConsultaMedicaDTO dto) throws BusinessException {
        if(dto.getInternacion()) {
            HospitalServicio servicioCamas =
                    hospitalServicioService.getHospitalServicio(dto.getIdHospital(), dto.getIdServicio());
            if(dto.getFecSalida() == null) {
                if (servicioCamas.getCamasDisponibles()>0) {
                    servicioCamas.setCamasDisponibles(servicioCamas.getCamasDisponibles()-1L);
                    hospitalServicioService.save(servicioCamas);
                } else {
                    throw new BusinessException("No hay camas disponibles para internarse");
                }
            } else if (dto.getFecSalida() != null){
                servicioCamas.setCamasDisponibles(servicioCamas.getCamasDisponibles()+1L);
                hospitalServicioService.save(servicioCamas);
            }
        }
        ConsultaMedica entity =  ConsultaMedicaDTO.convertToEntity(dto);
        entity.setHospital(hospitalService.getHospital(dto.getIdHospital()));
        entity.setMedico(medicoService.getMedico(dto.getCiMedico()));
        entity.setServicio(servicioService.getServicio(dto.getIdServicio()));
        consultaMedicaRepository.save(entity);
    }

    @Override
    public ConsultaMedica getConsultaMedica(Long id) {
        Optional<ConsultaMedica> consultaMedica = consultaMedicaRepository.findById(id);
        //TODO retornar exception
        return consultaMedica.orElse(null);
    }

    @Override
    public void deleteConsultaMedica(Long id) {
        consultaMedicaRepository.deleteById(id);
    }
}
