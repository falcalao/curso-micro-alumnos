package com.unisys.curso.alumnos.alumno.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Direcciones {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCalle;

    @ManyToOne
    @JoinColumn(name="alumno_id")
    private Alumno alumno;

}
