package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.HospitalServicioDTO;
import com.github.electiva3final.entity.HospitalServicio;
import com.github.electiva3final.entity.pk.HospitalServicioPK;
import com.github.electiva3final.exception.BusinessException;
import com.github.electiva3final.repository.HospitalServicioRepository;
import com.github.electiva3final.service.HospitalService;
import com.github.electiva3final.service.HospitalServicioService;
import com.github.electiva3final.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HospitalServicioServiceImpl implements HospitalServicioService {

    @Autowired
    private HospitalService hospitalService;
    @Autowired
    private ServicioService servicioService;
    @Autowired
    private HospitalServicioRepository hospitalServicioRepository;

    @Override
    public void saveHospitalServicio(HospitalServicioDTO dto) {
        try {
            HospitalServicio entity =  HospitalServicioDTO.convertToEntity(dto);
            HospitalServicioPK pk = new HospitalServicioPK();
            pk.setHospital(hospitalService.getHospital(dto.getIdHospital()));
            pk.setServicio(servicioService.getServicio(dto.getIdServicio()));
            entity.setPk(pk);
            save(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public HospitalServicio getHospitalServicio(Long idHospital, String idServicio) throws BusinessException {
        HospitalServicioPK pk = new HospitalServicioPK();
        pk.setHospital(hospitalService.getHospital(idHospital));
        pk.setServicio(servicioService.getServicio(idServicio));
        Optional<HospitalServicio> entity =  hospitalServicioRepository.findById(pk);
        if(!entity.isPresent()) {
            throw new BusinessException("El servicio no se ofrece en el hospital");
        }
        return entity.get();
    }

    @Override
    public void deleteHospitalServicio(Long idHospital, String idServicio) {
        try {
            HospitalServicioPK pk = new HospitalServicioPK();
            pk.setHospital(hospitalService.getHospital(idHospital));
            pk.setServicio(servicioService.getServicio(idServicio));
            hospitalServicioRepository.deleteById(pk);
        } catch (Exception e) {
            throw e;
        }
    }

    public void save(HospitalServicio entity) {
        hospitalServicioRepository.save(entity);
    }
}
