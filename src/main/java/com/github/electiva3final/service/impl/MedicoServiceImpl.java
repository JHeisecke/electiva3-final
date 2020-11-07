package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.MedicoDTO;
import com.github.electiva3final.entity.Medico;
import com.github.electiva3final.repository.MedicoRepository;
import com.github.electiva3final.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public void saveMedico(MedicoDTO dto) {
        try {
            Medico medico = MedicoDTO.convertToEntity(dto);
            medicoRepository.save(medico);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Medico getMedico(String ci) {
        Optional<Medico> medico = medicoRepository.findById(ci);
        //TODO retornar exception
        return medico.orElse(null);
    }

    @Override
    public List<Medico> getAllMedico() {
        return (List<Medico>) medicoRepository.findAll();
    }

    @Override
    public void deleteMedico(String ci) {
        medicoRepository.deleteById(ci);
    }
}
