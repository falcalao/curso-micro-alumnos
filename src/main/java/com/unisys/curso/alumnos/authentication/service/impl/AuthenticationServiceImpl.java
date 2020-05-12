package com.unisys.curso.alumnos.authentication.service.impl;

import com.unisys.curso.alumnos.authentication.controller.dto.UserDTO;
import com.unisys.curso.alumnos.authentication.service.AuthenticationService;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    @Override
    public UserDTO authenticationUser(String user, String pass) {
        return null;
    }
}
