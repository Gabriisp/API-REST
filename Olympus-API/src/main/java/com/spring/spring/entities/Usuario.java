package com.spring.spring.entities;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column
    private String nombre;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String tipo;

    @OneToMany(mappedBy = "usuarioCreador", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Rutina> rutinas;

    public Usuario() {}

    // Getters y Setters
    public Integer getIdUsuario() { return idUsuario; }
    public void setIdUsuario(Integer idUsuario) { this.idUsuario = idUsuario; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public List<Rutina> getRutinas() { return rutinas; }
    public void setRutinas(List<Rutina> rutinas) { this.rutinas = rutinas; }
}