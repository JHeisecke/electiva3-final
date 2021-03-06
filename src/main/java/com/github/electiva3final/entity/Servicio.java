package com.github.electiva3final.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import javax.persistence.*;

/**
 * The persistent class for the SERVICIO database table.
 */
@Entity
@Table(name="SERVICIO", schema = "public")
@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Servicio {
    @Id
    @Column(name = "ID_SERVICIO")
    private String idServicio;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "COMENTARIO")
    private String comentario;
    public Servicio() {}
    public Servicio(String idServicio, String nombre, String comentario) {
        this.idServicio = idServicio;
        this.nombre = nombre;
        this.comentario = comentario;
    }

}
