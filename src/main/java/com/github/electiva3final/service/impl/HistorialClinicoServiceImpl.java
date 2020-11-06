package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.HistorialClinicoDTO;
import com.github.electiva3final.entity.ConsultaMedica;
import com.github.electiva3final.entity.HistorialClinico;
import com.github.electiva3final.repository.ConsultaMedicaRepository;
import com.github.electiva3final.repository.HistorialClinicoRepository;
import com.github.electiva3final.service.ConsultaMedicaService;
import com.github.electiva3final.service.HistorialClinicoService;
import com.github.electiva3final.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HistorialClinicoServiceImpl implements HistorialClinicoService {

    @Autowired
    private HistorialClinicoRepository historialClinicoRepository;
    @Autowired
    private ConsultaMedicaService consultaMedicaService;
    @Autowired
    private PacienteService pacienteService;

    @Override
    public void saveHistorialClinico(HistorialClinicoDTO dto) {
        HistorialClinico entity = new HistorialClinico();
        entity.setPaciente(pacienteService.getPaciente(dto.getCiPaciente()));
        entity.setIdHistorial(dto.getIdHistorial());
        entity.setConsulta(consultaMedicaService.getConsultaMedica(dto.getIdConsulta()));
        historialClinicoRepository.save(entity);
    }

    @Override
    public HistorialClinico getHistorialClinico(Long id) {
        Optional<HistorialClinico> historialClinico = historialClinicoRepository.findById(id);
        //TODO retornar exception
        return historialClinico.orElse(null);
    }

    @Override
    public void deleteHistorialClinico(Long id) {
        historialClinicoRepository.deleteById(id);
    }
}
