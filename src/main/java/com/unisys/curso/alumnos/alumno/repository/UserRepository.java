package com.unisys.curso.alumnos.alumno.repository;

import com.unisys.curso.alumnos.alumno.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
