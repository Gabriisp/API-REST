package com.spring.spring.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spring.spring.entities.Usuario;
import com.spring.spring.services.UsuarioService;

@RestController
@RequestMapping("/Olympus/Usuario")
public class ControlUsuario {

    @Autowired
    public UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Usuario usuario) {
        if (usuario == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("El cuerpo de la solicitud no puede estar vacío.");
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(usuario));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> read(@PathVariable(value = "id") Integer id) {
        Optional<Usuario> oUsuario = usuarioService.findById(id);
        if (!oUsuario.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oUsuario.get());
    }

    @GetMapping
    public ResponseEntity<?> readAll() {
        List<Usuario> usuarios = StreamSupport
                .stream(usuarioService.findAll().spliterator(), false)
                .collect(Collectors.toList());

        if (usuarios.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(usuarios);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Usuario usuarioNuevo, @PathVariable(value = "id") Integer id) {
        Optional<Usuario> oUsuario = usuarioService.findById(id);

        if (!oUsuario.isPresent()) {
            return ResponseEntity.notFound().build();
        } else {
            if (usuarioNuevo.getNombre() == null && usuarioNuevo.getEmail() == null) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("El cuerpo no contiene ningún parámetro válido");
            }
            
            Usuario actual = oUsuario.get();
            actual.setNombre(usuarioNuevo.getNombre());
            actual.setEmail(usuarioNuevo.getEmail());
            actual.setPassword(usuarioNuevo.getPassword());
            actual.setTipo(usuarioNuevo.getTipo());

            return ResponseEntity.status(HttpStatus.CREATED).body(usuarioService.save(actual));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
        Optional<Usuario> oUsuario = usuarioService.findById(id);
        if (!oUsuario.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        usuarioService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}