package com.spring.spring.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.spring.entities.Ejercicio;
import com.spring.spring.repositories.RepoEjercicio;

@Service
public class EjercicioServiceImpl implements EjercicioService {

    @Autowired
    private RepoEjercicio repoEjercicio;

    @Override
    public List<Ejercicio> findAll() {
        return repoEjercicio.findAll();
    }

    @Override
    public Ejercicio findById(Integer id) {
        return repoEjercicio.findById(id).orElse(null);
    }

    @Override
    public Ejercicio save(Ejercicio ejercicio) {
        return repoEjercicio.save(ejercicio);
    }

    @Override
    public Ejercicio update(Integer id, Ejercicio detalles) {
        Optional<Ejercicio> optional = repoEjercicio.findById(id);
        if (optional.isPresent()) {
            Ejercicio e = optional.get();
            e.setNombre(detalles.getNombre());
            e.setDescripcion(detalles.getDescripcion());
            e.setGrupoMuscular(detalles.getGrupoMuscular());
            e.setEquipamientoNecesario(detalles.getEquipamientoNecesario());
            return repoEjercicio.save(e);
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        if (repoEjercicio.existsById(id)) {
            repoEjercicio.deleteById(id);
            return true;
        }
        return false;
    }
}