package com.unisys.curso.alumnos.alumno.service;

import com.unisys.curso.alumnos.alumno.model.Alumno;

import java.util.List;

public interface AlumnoService {

    List<Alumno> getAlumnos();
    Alumno getAlumnoById(Long idAlumno);

}
