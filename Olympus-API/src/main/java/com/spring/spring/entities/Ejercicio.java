package com.spring.spring.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "ejercicio")
public class Ejercicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer idEjercicio;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private String grupoMuscular;

    @Column
    private String equipamientoNecesario;

    public Ejercicio() {}

    public Integer getIdEjercicio() { return idEjercicio; }
    public void setIdEjercicio(Integer idEjercicio) { this.idEjercicio = idEjercicio; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getGrupoMuscular() { return grupoMuscular; }
    public void setGrupoMuscular(String grupoMuscular) { this.grupoMuscular = grupoMuscular; }
    public String getEquipamientoNecesario() { return equipamientoNecesario; }
    public void setEquipamientoNecesario(String equipamientoNecesario) { this.equipamientoNecesario = equipamientoNecesario; }
}