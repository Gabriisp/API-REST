package com.spring.spring.services;

import java.util.List;
import java.util.Optional;
import com.spring.spring.entities.Ejercicio;

public interface EjercicioService {
    List<Ejercicio> findAll();
    Optional<Ejercicio> findById(Integer id);
    Ejercicio save(Ejercicio ejercicio);
    void deleteById(Integer id);
}