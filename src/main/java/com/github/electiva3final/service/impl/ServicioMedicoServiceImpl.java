package com.github.electiva3final.service.impl;

import com.github.electiva3final.dto.ServicioMedicoDTO;
import com.github.electiva3final.entity.MedicoHospital;
import com.github.electiva3final.entity.ServicioMedico;
import com.github.electiva3final.entity.pk.MedicoHospitalPK;
import com.github.electiva3final.entity.pk.ServicioMedicoPK;
import com.github.electiva3final.repository.MedicoHospitalRepository;
import com.github.electiva3final.repository.ServicioMedicoRepository;
import com.github.electiva3final.service.MedicoService;
import com.github.electiva3final.service.ServicioMedicoService;
import com.github.electiva3final.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServicioMedicoServiceImpl implements ServicioMedicoService {

    @Autowired
    private ServicioService servicioService;
    @Autowired
    private MedicoService medicoService;
    @Autowired
    private ServicioMedicoRepository servicioMedicoRepository;

    @Override
    public void saveServicioMedico(ServicioMedicoDTO dto) {
        try {
            ServicioMedico entity =  new ServicioMedico();
            ServicioMedicoPK pk = new ServicioMedicoPK();
            pk.setMedico(medicoService.getMedico(dto.getCiMedico()));
            pk.setServicio(servicioService.getServicio(dto.getIdServicio()));
            entity.setPk(pk);
            servicioMedicoRepository.save(entity);
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public ServicioMedico getServicioMedico(String idServicio, String ciMedico) {
        ServicioMedicoPK pk = new ServicioMedicoPK();
        pk.setMedico(medicoService.getMedico(ciMedico));
        pk.setServicio(servicioService.getServicio(idServicio));
        Optional<ServicioMedico> entity =  servicioMedicoRepository.findById(pk);
        return entity.orElse(null);
    }

    @Override
    public void deleteServicioMedico(String ciMedico, String idServicio) {
        try {
            ServicioMedicoPK pk = new ServicioMedicoPK();
            pk.setMedico(medicoService.getMedico(ciMedico));
            pk.setServicio(servicioService.getServicio(idServicio));
            servicioMedicoRepository.deleteById(pk);
        } catch (Exception e) {
            throw e;
        }
    }
}
