package com.spring.spring.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ejercicio")
public class Ejercicio {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer idEjercicio;
    @Column
    String nombre;
    @Column
    String descripcion;
    @Column
    String  grupoMuscular;
    @Column
    String equipamientoNecesario;

    
    public Ejercicio(Integer idEjercicio, String nombre, String descripcion, String grupoMuscular,
            String equipamientoNecesario) {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.grupoMuscular = grupoMuscular;
        this.equipamientoNecesario = equipamientoNecesario;
    }
    public Integer getIdEjercicio() {
        return idEjercicio;
    }
    public void setIdEjercicio(Integer idEjercicio) {
        this.idEjercicio = idEjercicio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getGrupoMuscular() {
        return grupoMuscular;
    }
    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }
    public String getEquipamientoNecesario() {
        return equipamientoNecesario;
    }
    public void setEquipamientoNecesario(String equipamientoNecesario) {
        this.equipamientoNecesario = equipamientoNecesario;
    }
    @Override
    public String toString() {
        return "Ejercicio [idEjercicio=" + idEjercicio + ", nombre=" + nombre + ", descripcion=" + descripcion
                + ", grupoMuscular=" + grupoMuscular + ", equipamientoNecesario=" + equipamientoNecesario + "]";
    }
}
