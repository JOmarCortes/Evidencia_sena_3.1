package com.Evidencia3.Ejercicio1.controller;

import com.Evidencia3.Ejercicio1.model.Stock;
import com.Evidencia3.Ejercicio1.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/stock")
public class StockController {

    @Autowired
    private StockService stockService;

    // Método para crear un nuevo registro de stock
    @PostMapping
    public Stock crearStock(@RequestBody Stock stock) {
        return stockService.crearStock(stock);
    }

    // Método para obtener un registro de stock por su ID
    @GetMapping("/{id}")
    public ResponseEntity<Stock> obtenerStockPorId(@PathVariable Long id) {
        Optional<Stock> stock = stockService.obtenerStockPorId(id);
        return stock.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Método para obtener todos los registros de stock
    @GetMapping
    public Iterable<Stock> obtenerTodoElStock() {
        return stockService.obtenerTodoElStock();
    }

    // Método para actualizar un registro de stock existente
    @PutMapping("/{id}")
    public ResponseEntity<Stock> actualizarStock(@PathVariable Long id, @RequestBody Stock stockDetalles) {
        try {
            Stock stockActualizado = stockService.actualizarStock(id, stockDetalles);
            return ResponseEntity.ok(stockActualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    // Método para eliminar un registro de stock por su ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarStock(@PathVariable Long id) {
        stockService.eliminarStock(id);
        return ResponseEntity.noContent().build();
    }
}


