package com.Evidencia3.Ejercicio1.repository;

import com.Evidencia3.Ejercicio1.model.Producto;
import org.springframework.data.repository.CrudRepository;

//Definición de la interfaz ProductoRepository
public interface ProductoRepository extends CrudRepository<Producto, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}

