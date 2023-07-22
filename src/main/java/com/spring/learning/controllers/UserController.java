package com.spring.learning.controllers;

import com.spring.learning.models.Usuario;

import java.util.ArrayList;
import java.util.List;

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
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(1L);
        usuario.setNombre("David");
        usuario.setApellido("Naranjo");
        usuario.setEmail("davidnaranjo@email.com");
        usuario.setTelefono("111222333");
        usuario.setPassword("admin1234");

        Usuario usuario2 = new Usuario();
        usuario2.setId(2L);
        usuario2.setNombre("Fernando");
        usuario2.setApellido("Alonso");
        usuario2.setEmail("nano33@email.com");
        usuario2.setTelefono("333333333");
        usuario2.setPassword("soufle33");

        Usuario usuario3 = new Usuario();
        usuario3.setId(3L);
        usuario3.setNombre("Ren");
        usuario3.setApellido("Naranjo");
        usuario3.setEmail("perretepedorrete@email.com");
        usuario3.setTelefono("222111333");
        usuario3.setPassword("perrete123");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    @RequestMapping(value = "usuarioeditado")
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
