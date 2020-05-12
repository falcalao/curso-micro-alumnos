package com.unisys.curso.alumnos.alumno.service.impl;

import com.unisys.curso.alumnos.alumno.model.Alumno;
import com.unisys.curso.alumnos.alumno.repository.AlumnoRepository;
import com.unisys.curso.alumnos.alumno.service.AlumnoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class AlumnoServiceImpl implements AlumnoService {

    AlumnoRepository alumnoRepository;

/*    @Autowired
    public void setAlumnoRepository(AlumnoRepository alumnoRepository) {
        this.alumnoRepository = alumnoRepository;
    }*/

    @Override
    public List<Alumno> getAlumnos() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno getAlumnoById(Long idAlumno) {
        return alumnoRepository.findById(idAlumno).get();
    }

    @Override
    public Alumno getAlumnoByName(String name) {
        return alumnoRepository.getAlumnoByName(name);
    }

    @Override
    public Alumno getAlumnoBySurname(String name) {
        return alumnoRepository.getAlumnoBySurname(name);
    }

    @Override
    public Alumno getAlumnoByNameAndSurname(String name, String surname) {
        return alumnoRepository.getAlumnoByNameAndSurname(name, surname);
    }

    @Override
    public Long createAlumno(Alumno alumnoToSave) {
        return alumnoRepository.save(alumnoToSave).getId();
    }

    @Override
    public void updateAlumno(Alumno alumnoToUpdate) {
        alumnoRepository.save(alumnoToUpdate);
    }

    @Override
    public void deleteAlumno(Long idAlumno) {
        alumnoRepository.deleteById(idAlumno);
    }
}
