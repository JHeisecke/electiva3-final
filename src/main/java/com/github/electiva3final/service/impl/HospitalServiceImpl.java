package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.HospitalDTO;
import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.repository.HospitalRepository;
import com.github.electiva3final.service.HospitalService;
import com.github.electiva3final.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository hospitalRepository;
    @Autowired
    private MedicoService medicoService;

    @Override
    public void saveHospital(HospitalDTO dto) {
        try {
            Hospital entity =  HospitalDTO.convertToEntity(dto);
            entity.setDirector(medicoService.getMedico(dto.getDirector()));
            hospitalRepository.save(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Hospital getHospital(Long id) {
        Optional<Hospital> hospital = hospitalRepository.findById(id);
        //TODO retornar exception
        return hospital.orElse(null);
    }

    @Override
    public void deleteHospital(Long id) {
        hospitalRepository.deleteById(id);
    }
}
