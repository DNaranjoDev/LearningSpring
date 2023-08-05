package com.spring.learning.dao;

import java.util.List;

import com.spring.learning.models.Usuario;

public interface usuarioDao {
    List<Usuario> getUsuarios();

    void eliminar(Long id);

    void registrar(Usuario usuario);

    boolean verificarCredenciales(Usuario usuario);
}
