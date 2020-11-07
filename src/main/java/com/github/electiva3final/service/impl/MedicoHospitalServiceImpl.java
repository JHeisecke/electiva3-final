package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.HospitalServicioDTO;
import com.github.electiva3final.dto.MedicoHospitalDTO;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.entity.MedicoHospital;
import com.github.electiva3final.entity.pk.HospitalServicioPK;
import com.github.electiva3final.entity.pk.MedicoHospitalPK;
import com.github.electiva3final.exception.BusinessException;
import com.github.electiva3final.repository.HospitalServicioRepository;
import com.github.electiva3final.repository.MedicoHospitalRepository;
import com.github.electiva3final.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicoHospitalServiceImpl implements MedicoHospitalService {

    @Autowired
    private HospitalService hospitalService;
    @Autowired
    private MedicoService medicoService;
    @Autowired
    private MedicoHospitalRepository medicoHospitalRepository;

    @Override
    public void saveMedicoHospital(MedicoHospitalDTO dto) {
        try {
            MedicoHospital entity =  new MedicoHospital();
            entity.setOcupaDireccion(dto.getOcupaDireccion());
            MedicoHospitalPK pk = new MedicoHospitalPK();
            pk.setHospital(hospitalService.getHospital(dto.getIdHospital()));
            pk.setMedico(medicoService.getMedico(dto.getCiMedico()));
            entity.setPk(pk);
            medicoHospitalRepository.save(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public MedicoHospital getMedicoHospital(Long idHospital, String ciMedico) throws BusinessException {
        MedicoHospitalPK pk = new MedicoHospitalPK();
        pk.setHospital(hospitalService.getHospital(idHospital));
        pk.setMedico(medicoService.getMedico(ciMedico));
        Optional<MedicoHospital> entity =  medicoHospitalRepository.findById(pk);
        if(!entity.isPresent()) {
            throw new BusinessException("El medico no trabaja en el hospital");
        }
        return entity.get();
    }

    @Override
    public void deleteMedicoHospital(Long idHospital, String ciMedico) {
        try {
            MedicoHospitalPK pk = new MedicoHospitalPK();
            pk.setHospital(hospitalService.getHospital(idHospital));
            pk.setMedico(medicoService.getMedico(ciMedico));
            medicoHospitalRepository.deleteById(pk);
        } catch (Exception e) {
            throw e;
        }
    }

}
