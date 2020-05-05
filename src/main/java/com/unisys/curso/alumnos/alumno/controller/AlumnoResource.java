package com.unisys.curso.alumnos.alumno.controller;

import com.unisys.curso.alumnos.alumno.model.Alumno;
import com.unisys.curso.alumnos.alumno.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/alumnos")
public class AlumnoResource {

    private AlumnoService alumnoService;

    @Autowired
    public void setAlumnoService(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    public ResponseEntity<List<Alumno>> getAllAlumnos() {
        return ResponseEntity.ok(Collections.emptyList());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Alumno> getAlumnoById(@PathVariable(name = "id") Long idAlumno){
        return ResponseEntity.ok(new Alumno().setId(idAlumno));
    }
    @PostMapping
    public ResponseEntity createAlumno(@RequestBody(required = false)  Alumno alumnoToCreate){
        String idAlumno = UUID.randomUUID().toString();
        return ResponseEntity.created(URI.create(MessageFormat.format("/alumnos/{0}", idAlumno))).build();
    }

    @PutMapping
    public ResponseEntity updateAlumnoAlreadySaved(@RequestBody(required = false) Alumno alumno){
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity deleteAlumnoAlreadySaved(@PathVariable(name = "id") Long idAlumno){
        return ResponseEntity.accepted().build();
    }


}
