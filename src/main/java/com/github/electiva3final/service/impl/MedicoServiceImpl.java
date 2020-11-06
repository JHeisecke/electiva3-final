package com.github.electiva3final.service.impl;

import com.github.electiva3final.entity.Hospital;
import com.github.electiva3final.entity.Medico;
import com.github.electiva3final.repository.HospitalRepository;
import com.github.electiva3final.repository.MedicoRepository;
import com.github.electiva3final.service.HospitalService;
import com.github.electiva3final.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoServiceImpl implements MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public void saveMedico(Medico medico) {
        try {
            medicoRepository.save(medico);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Medico getMedico(String ci) {
        Medico m = new Medico();
        return m;
    }
}
