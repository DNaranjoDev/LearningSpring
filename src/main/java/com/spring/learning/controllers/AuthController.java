package com.spring.learning.controllers;

import com.spring.learning.dao.usuarioDao;
import com.spring.learning.models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AuthController {
    @Autowired
    private usuarioDao UserDao;

    @RequestMapping(value = "api/login", method = RequestMethod.POST)
    public String login(@RequestBody Usuario  usuario) {
        if (UserDao.verificarCredenciales(usuario)) {
            return "OK";
        }
        return "FAIL";
    }
}
