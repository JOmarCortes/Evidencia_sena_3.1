package com.Evidencia3.Ejercicio1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Marca esta clase como una entidad de base de datos
@Entity
public class Usuario {

    // Marca este campo como la clave primaria
    @Id
    // Genera automáticamente los valores de ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Campos para almacenar información del usuario
    private Long id;
    private String nombre;
    private String apellido;
    private String identificacion;
    private String email;

    // Métodos para obtener y establecer los valores de los campos
    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

