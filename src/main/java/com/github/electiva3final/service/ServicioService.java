package com.github.electiva3final.service;

import com.github.electiva3final.dto.ServicioDTO;
import com.github.electiva3final.entity.Servicio;

public interface ServicioService {
    void saveServicio(ServicioDTO dto);
    Servicio getServicio(String idServicio);
}
