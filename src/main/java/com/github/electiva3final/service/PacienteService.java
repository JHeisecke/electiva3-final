package com.github.electiva3final.service;

import com.github.electiva3final.dto.MedicoDTO;
import com.github.electiva3final.dto.PacienteDTO;
import com.github.electiva3final.entity.Medico;
import com.github.electiva3final.entity.Paciente;

public interface PacienteService {
    public void savePaciente(PacienteDTO dto);
    public Paciente getPaciente(String ci);
    public void deletePaciente(String ci);
}
