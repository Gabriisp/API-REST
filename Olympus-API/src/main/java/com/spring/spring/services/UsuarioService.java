package com.spring.spring.services;

import java.util.Optional;

import com.spring.spring.entities.Usuario;

public interface UsuarioService {
    public Iterable<Usuario> findAll();
        public Optional<Usuario> findById(int id);



    
}
