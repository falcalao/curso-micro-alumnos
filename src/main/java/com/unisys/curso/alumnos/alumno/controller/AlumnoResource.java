package com.unisys.curso.alumnos.alumno.controller;

import com.unisys.curso.alumnos.alumno.model.Alumno;
import com.unisys.curso.alumnos.alumno.service.AlumnoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Api(value="Alumno Resource", protocols = "https", produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping(path = "/alumnos")
public class AlumnoResource {

    private AlumnoService alumnoService;

    @Autowired
    public void setAlumnoService(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    @GetMapping
    @ApiOperation(value = "Recupera todos los alumnos")
    public ResponseEntity<List<Alumno>> getAllAlumnos() {
        return ResponseEntity.ok(alumnoService.getAlumnos());
    }

    @GetMapping(path = "/search")
    @ApiOperation(value = "Recupera todos los alumnos")
    public ResponseEntity<Alumno> getSearchAlumno(@RequestParam("name") String name) {
        return ResponseEntity.ok(alumnoService.getAlumnoByName(name));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Alumno> getAlumnoById(@ApiParam(value = "id Alumno", required = true) @PathVariable(name = "id") Long idAlumno){
        return ResponseEntity.ok(alumnoService.getAlumnoById(idAlumno));
    }
    @PostMapping
    public ResponseEntity createAlumno(@RequestBody(required = false)  Alumno alumnoToCreate){
        return ResponseEntity.created(URI.create(MessageFormat.format("/alumnos/{0}", alumnoService.createAlumno(alumnoToCreate)))).build();
    }

    @PutMapping
    public ResponseEntity updateAlumnoAlreadySaved(@RequestBody(required = false) Alumno alumno){
        alumnoService.updateAlumno(alumno);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity deleteAlumnoAlreadySaved(@PathVariable(name = "id") Long idAlumno){
        return ResponseEntity.accepted().build();
    }


}
