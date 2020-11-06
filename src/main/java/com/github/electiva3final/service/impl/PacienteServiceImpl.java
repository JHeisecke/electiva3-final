package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.PacienteDTO;
import com.github.electiva3final.entity.Paciente;
import com.github.electiva3final.repository.PacienteRepository;
import com.github.electiva3final.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public void savePaciente(PacienteDTO dto) {
        try {
            Paciente paciente = PacienteDTO.convertToEntity(dto);
            pacienteRepository.save(paciente);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Paciente getPaciente(String ci) {
        Optional<Paciente> paciente = pacienteRepository.findById(ci);
        //TODO retornar exception
        return paciente.orElse(null);
    }

    @Override
    public void deletePaciente(String ci) {
        pacienteRepository.deleteById(ci);
    }
}
