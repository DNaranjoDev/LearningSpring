package com.spring.learning.controllers;

import com.spring.learning.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @RequestMapping(value = "usuario")
    public Usuario getUsuario() {
        Usuario usuario = new Usuario();
        usuario.setNombre("David");
        usuario.setApellido("Naranjo");
        usuario.setEmail("davidnaranjo@email.com");
        usuario.setTelefono("111222333");
        usuario.setPassword("admin1234");
        return usuario;
    }
}
