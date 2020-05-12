package com.unisys.curso.alumnos.alumno.controller;

import com.unisys.curso.alumnos.alumno.model.Alumno;
import com.unisys.curso.alumnos.alumno.model.User;
import com.unisys.curso.alumnos.alumno.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.text.MessageFormat;

@RestController
@RequestMapping(path = "/users")
public class UserResource {

    UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping
    public ResponseEntity createUser(@RequestBody(required = false) User userToCreate){
        return ResponseEntity.created(URI.create(MessageFormat.format("/user/{0}", userRepository.save(userToCreate)))).build();
    }
}
