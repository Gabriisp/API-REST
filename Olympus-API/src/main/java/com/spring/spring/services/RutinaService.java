package com.spring.spring.services;

import java.util.List;
import java.util.Optional;
import com.spring.spring.entities.Rutina;

public interface RutinaService {
    List<Rutina> findAll();
    Optional<Rutina> findById(Integer id);
    Rutina save(Rutina rutina);
    void deleteById(Integer id);
}