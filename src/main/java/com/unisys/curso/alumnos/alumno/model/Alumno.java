package com.unisys.curso.alumnos.alumno.model;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Alumno {

    private Long id;
    private String name;
    private String surname;

}
