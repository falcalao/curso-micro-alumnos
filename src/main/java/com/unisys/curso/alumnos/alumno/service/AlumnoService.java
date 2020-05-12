package com.unisys.curso.alumnos.alumno.service;

import com.unisys.curso.alumnos.alumno.model.Alumno;

import java.util.List;

public interface AlumnoService {

    List<Alumno> getAlumnos();

    Alumno getAlumnoById(Long idAlumno);

    Alumno getAlumnoByName(String name);

    Alumno getAlumnoBySurname(String name);

    Alumno getAlumnoByNameAndSurname(String name, String surname);

    Long createAlumno(Alumno alumnoToSave);

    void updateAlumno(Alumno alumnoToUpdate);

    void deleteAlumno(Long idAlumno);
}
