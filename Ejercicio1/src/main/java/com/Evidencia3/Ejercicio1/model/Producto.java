package com.Evidencia3.Ejercicio1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Marca esta clase como una entidad de base de datos
@Entity
public class Producto {

    // Marca este campo como la clave primaria
    @Id
    // Genera automáticamente los valores de ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Campos para almacenar información del usuario
    private Long id;
    private String nombre;
    private String descripcion;
    private Double valor;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
