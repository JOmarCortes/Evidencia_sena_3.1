package com.Evidencia3.Ejercicio1.service;

import com.Evidencia3.Ejercicio1.model.Stock;
import com.Evidencia3.Ejercicio1.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class StockService {

    @Autowired
    private StockRepository stockRepository;

    // Método para crear un nuevo registro de stock
    public Stock crearStock(Stock stock) {
        return stockRepository.save(stock);
    }

    // Método para obtener un registro de stock por su ID
    public Optional<Stock> obtenerStockPorId(Long id) {
        return stockRepository.findById(id);
    }

    // Método para obtener todos los registros de stock
    public Iterable<Stock> obtenerTodoElStock() {
        return stockRepository.findAll();
    }

    // Método para actualizar un registro de stock existente
    public Stock actualizarStock(Long id, Stock stockDetalles) {
        return stockRepository.findById(id).map(stock -> {
            stock.setNombre(stockDetalles.getNombre());
            stock.setCantidad(stockDetalles.getCantidad());
            stock.setUbicacion(stockDetalles.getUbicacion());
            return stockRepository.save(stock);
        }).orElseThrow(() -> new RuntimeException("Stock no encontrado"));
    }

    // Método para eliminar un registro de stock por su ID
    public void eliminarStock(Long id) {
        stockRepository.deleteById(id);
    }
}

