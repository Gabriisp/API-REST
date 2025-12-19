package com.spring.spring.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.spring.entities.Rutina;
import com.spring.spring.repositories.RepoRutina;

@Service
public class RutinaServiceImpl implements RutinaService {

    @Autowired
    private RepoRutina repoRutina;

    @Override
    public List<Rutina> findAll() {
        return repoRutina.findAll();
    }

    @Override
    public Optional<Rutina> findById(Integer id) {
        return repoRutina.findById(id);
    }

    @Override
    public Rutina save(Rutina rutina) {
        return repoRutina.save(rutina);
    }

    @Override
    public void deleteById(Integer id) {
        repoRutina.deleteById(id);
    }
}