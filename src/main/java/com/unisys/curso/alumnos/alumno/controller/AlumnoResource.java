package com.unisys.curso.alumnos.alumno.controller;

import com.unisys.curso.alumnos.alumno.model.Alumno;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.MessageFormat;

@RestController
@RequestMapping(path = "/alumnos")
public class AlumnoResource {

    @GetMapping
    public ResponseEntity<String> helloAlumnosResource(@RequestParam(name = "nombre") String nombre){
        Alumno alumno = new Alumno();

        return ResponseEntity.ok(MessageFormat.format("Hola {0}", nombre));
    }

}
