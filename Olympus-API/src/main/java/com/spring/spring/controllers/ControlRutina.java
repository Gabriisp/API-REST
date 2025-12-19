package com.spring.spring.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.spring.entities.Rutina;
import com.spring.spring.services.RutinaService;

@RestController
@RequestMapping("/Olympus/Rutina")
public class ControlRutina {

    @Autowired
    public RutinaService rutinaService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Rutina rutina) {
        if (rutina == null) return ResponseEntity.badRequest().body("Cuerpo vacío");
        return ResponseEntity.status(HttpStatus.CREATED).body(rutinaService.save(rutina));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> read(@PathVariable(value = "id") Integer id) {
        Optional<Rutina> oR = rutinaService.findById(id);
        if (!oR.isPresent()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(oR.get());
    }

    @GetMapping
    public ResponseEntity<?> readAll() {
        List<Rutina> lista = StreamSupport
                .stream(rutinaService.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return lista.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(lista);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
        Optional<Rutina> oR = rutinaService.findById(id);
        if (!oR.isPresent()) return ResponseEntity.notFound().build();
        rutinaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}