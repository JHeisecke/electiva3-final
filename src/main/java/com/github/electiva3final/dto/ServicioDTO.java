package com.github.electiva3final.dto;

import com.github.electiva3final.entity.Servicio;
import lombok.Data;

import javax.persistence.Column;

@Data
public class ServicioDTO {

    private String idServicio;
    private String nombre;
    private String comentario;

    public static Servicio convertToEntity(ServicioDTO dto) {
        Servicio entity = new Servicio();
        entity.setIdServicio(dto.getIdServicio());
        entity.setComentario(dto.getComentario());
        entity.setNombre(dto.getNombre());
        return entity;
    }
}
