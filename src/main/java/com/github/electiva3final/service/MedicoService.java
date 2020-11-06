package com.github.electiva3final.service;

import com.github.electiva3final.dto.MedicoDTO;
import com.github.electiva3final.entity.Medico;

public interface MedicoService {
    public void saveMedico(MedicoDTO dto);
    public Medico getMedico(String ci);
}
