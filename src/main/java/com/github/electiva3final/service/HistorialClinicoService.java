package com.github.electiva3final.service;

import com.github.electiva3final.dto.HistorialClinicoDTO;
import com.github.electiva3final.entity.HistorialClinico;

public interface HistorialClinicoService {
    public void saveHistorialClinico(HistorialClinicoDTO dto);
    public HistorialClinico getHistorialClinico(Long id);
    public void deleteHistorialClinico(Long id);
}
