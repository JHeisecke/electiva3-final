package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.ServicioDTO;
import com.github.electiva3final.entity.Servicio;
import com.github.electiva3final.repository.ServicioRepository;
import com.github.electiva3final.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    public void saveServicio(ServicioDTO dto) {
        try {
            Servicio servicio = ServicioDTO.convertToEntity(dto);
            servicioRepository.save(servicio);
        } catch (Exception e) {
            throw e;
        }
    }

    public Servicio getServicio(String idServicio) {
        Optional<Servicio> servicio = servicioRepository.findById(idServicio);
        //TODO retornar exception
        return servicio.orElse(null);
    }

    @Override
    public void deleteServicio(String idServicio) {
        servicioRepository.deleteById(idServicio);
    }
}
