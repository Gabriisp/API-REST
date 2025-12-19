package com.spring.spring.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.spring.entities.Usuario;
import com.spring.spring.repositories.RepoUsuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private RepoUsuario repoUsuario;

    @Override
    public List<Usuario> findAll() {
        return repoUsuario.findAll();
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return repoUsuario.findById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return repoUsuario.save(usuario);
    }

    @Override
    public void deleteById(Integer id) {
        repoUsuario.deleteById(id);
    }
}