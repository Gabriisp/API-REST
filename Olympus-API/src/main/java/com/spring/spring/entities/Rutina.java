package com.spring.spring.entities;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "rutina")
public class Rutina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rutina")
    private Integer idRutina;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "id_usuario_creador")
    @JsonBackReference
    private Usuario usuarioCreador;

    public Rutina() {}

    public Integer getIdRutina() { return idRutina; }
    public void setIdRutina(Integer idRutina) { this.idRutina = idRutina; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Usuario getUsuarioCreador() { return usuarioCreador; }
    public void setUsuarioCreador(Usuario usuarioCreador) { this.usuarioCreador = usuarioCreador; }
}