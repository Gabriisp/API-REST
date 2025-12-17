package com.spring.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.spring.services.UsuarioService;


@RestController
@RequestMapping("/spring/Usuario")
public class ControlUsuario {

    @Autowired
    public UsuarioService usuarioService;

    
}
