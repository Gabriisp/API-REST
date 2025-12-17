package com.spring.spring.entities;

import java.time.LocalDateTime;

public class Rutina {

    int idUsuario;
    int idRutina, idUsuarioCreador;
    Integer idEntrenadorAsignador;
    String nombre, descripcion;
    LocalDateTime fechaCreacion;
    boolean activa;

    public Rutina() {
    }

    public Rutina(String nombre, String descripcion, int idUsuarioCreador) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idUsuarioCreador = idUsuarioCreador;
        this.activa = true;
        this.fechaCreacion = LocalDateTime.now();
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int id) {
        this.idRutina = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String d) {
        this.descripcion = d;
    }

    public int getIdUsuarioCreador() {
        return idUsuarioCreador;
    }

    public void setIdUsuarioCreador(int id) {
        this.idUsuarioCreador = id;
    }

    public Integer getIdEntrenadorAsignador() {
        return idEntrenadorAsignador;
    }

    public void setIdEntrenadorAsignador(Integer id) {
        this.idEntrenadorAsignador = id;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime f) {
        this.fechaCreacion = f;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean a) {
        this.activa = a;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
