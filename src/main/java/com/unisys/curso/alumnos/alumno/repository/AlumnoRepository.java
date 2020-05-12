package com.unisys.curso.alumnos.alumno.repository;

import com.unisys.curso.alumnos.alumno.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    Alumno getAlumnoByName(String name);

    Alumno getAlumnoBySurname(String name);

    Alumno getAlumnoByNameAndSurname(String name, String surname);


}
