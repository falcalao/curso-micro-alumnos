package com.unisys.curso.alumnos.authentication.service;

import com.unisys.curso.alumnos.authentication.controller.dto.UserDTO;

public interface AuthenticationService {

    UserDTO authenticationUser(String user, String pass);
}
