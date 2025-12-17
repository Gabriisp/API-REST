package com.spring.spring.entities;

public class Usuario {
    int idUsuario;
    String nombre, email, password, tipo;
    boolean activo;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String password, String tipo) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.tipo = tipo;
        this.activo = true;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int id) {
        this.idUsuario = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String p) {
        this.password = p;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean a) {
        this.activo = a;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
