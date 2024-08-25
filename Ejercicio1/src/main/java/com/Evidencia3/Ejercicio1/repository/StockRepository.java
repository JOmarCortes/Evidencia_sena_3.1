package com.Evidencia3.Ejercicio1.repository;

import com.Evidencia3.Ejercicio1.model.Stock;
import org.springframework.data.repository.CrudRepository;

//Definición de la interfaz StockRepository
public interface StockRepository extends CrudRepository<Stock, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}

