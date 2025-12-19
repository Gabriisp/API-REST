package com.spring.spring.services;

import java.util.List;
import java.util.Optional;
import com.spring.spring.entities.Usuario;

public interface UsuarioService {
    List<Usuario> findAll();
    Optional<Usuario> findById(Integer id);
    Usuario save(Usuario usuario);
    void deleteById(Integer id);
}