package com.unisys.curso.alumnos.alumno.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String user;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="user_role",
            joinColumns = @JoinColumn(name="role_id", referencedColumnName = "id"))
    private List<Role> roles;

}
