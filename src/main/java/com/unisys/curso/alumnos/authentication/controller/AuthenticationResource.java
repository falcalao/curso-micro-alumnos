package com.unisys.curso.alumnos.authentication.controller;

import com.unisys.curso.alumnos.authentication.controller.dto.UserDTO;
import com.unisys.curso.alumnos.authentication.service.AuthenticationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.MessageFormat;

@Slf4j
@RestController
public class AuthenticationResource {

    AuthenticationService authenticationService;

    @Autowired
    public void setAuthenticationService(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @GetMapping(path="/authenticate")
    public ResponseEntity login(@RequestParam("user") String user, @RequestParam("pass") String pass){
        log.debug(MessageFormat.format("Recibido usuario {0} y password {1}", user, pass));
        UserDTO userAuthenticated = authenticationService.authenticationUser(user, pass);

        if(userAuthenticated!=null){
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }


    }
}
