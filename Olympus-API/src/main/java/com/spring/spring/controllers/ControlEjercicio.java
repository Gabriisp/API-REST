package com.spring.spring.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.spring.entities.Ejercicio;
import com.spring.spring.services.EjercicioService;

@RestController
@RequestMapping("/Olympus/Ejercicio")
public class ControlEjercicio {

    @Autowired
    public EjercicioService ejercicioService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Ejercicio ejercicio) {
        if (ejercicio == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cuerpo vacío.");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(ejercicioService.save(ejercicio));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> read(@PathVariable(value = "id") Integer id) {
        Optional<Ejercicio> oEjercicio = ejercicioService.findById(id);
        if (!oEjercicio.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oEjercicio.get());
    }

    @GetMapping
    public ResponseEntity<?> readAll() {
        List<Ejercicio> ejercicios = StreamSupport
                .stream(ejercicioService.findAll().spliterator(), false)
                .collect(Collectors.toList());

        if (ejercicios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ejercicios);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Ejercicio nuevo, @PathVariable(value = "id") Integer id) {
        Optional<Ejercicio> oE = ejercicioService.findById(id);
        if (!oE.isPresent()) return ResponseEntity.notFound().build();

        Ejercicio actual = oE.get();
        actual.setNombre(nuevo.getNombre());
        actual.setDescripcion(nuevo.getDescripcion());
        actual.setGrupoMuscular(nuevo.getGrupoMuscular());
        actual.setEquipamientoNecesario(nuevo.getEquipamientoNecesario());

        return ResponseEntity.status(HttpStatus.CREATED).body(ejercicioService.save(actual));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
        Optional<Ejercicio> oE = ejercicioService.findById(id);
        if (!oE.isPresent()) return ResponseEntity.notFound().build();

        ejercicioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}