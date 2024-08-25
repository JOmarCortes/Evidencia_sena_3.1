package com.Evidencia3.Ejercicio1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Marca esta clase como una entidad de base de datos
@Entity
public class Stock {

    // Marca este campo como la clave primaria
    @Id
    // Genera automáticamente los valores de ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    // Genera automáticamente los valores de ID
    private Long id;
    private String nombre;
    private Integer cantidad;
    private String ubicacion;

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

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
