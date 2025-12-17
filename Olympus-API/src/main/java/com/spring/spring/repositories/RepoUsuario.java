package com.spring.spring.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.spring.entities.Usuario;
public interface  RepoUsuario extends JpaRepository<Usuario, Integer> {
    
}
