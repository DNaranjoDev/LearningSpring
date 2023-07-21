package com.spring.learning.controllers;

import com.spring.learning.models.Usuario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("David");
        usuario.setApellido("Naranjo");
        usuario.setEmail("davidnaranjo@email.com");
        usuario.setTelefono("111222333");
        usuario.setPassword("admin1234");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("David");
        usuario.setApellido("Naranjo");
        usuario.setEmail("davidnaranjo@email.com");
        usuario.setTelefono("111222333");
        usuario.setPassword("admin1234");
        return usuario;
    }

    @RequestMapping(value = "usuarido")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("David");
        usuario.setApellido("Naranjo");
        usuario.setEmail("davidnaranjo@email.com");
        usuario.setTelefono("111222333");
        usuario.setPassword("admin1234");
        return usuario;
    }

    @RequestMapping(value = "usuarioa")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("David");
        usuario.setApellido("Naranjo");
        usuario.setEmail("davidnaranjo@email.com");
        usuario.setTelefono("111222333");
        usuario.setPassword("admin1234");
        return usuario;
    }
}
