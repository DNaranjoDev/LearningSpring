package com.spring.learning.dao;

import java.util.List;

import com.spring.learning.models.Usuario;

public interface usuarioDao {
    List<Usuario> getUsuarios();
}