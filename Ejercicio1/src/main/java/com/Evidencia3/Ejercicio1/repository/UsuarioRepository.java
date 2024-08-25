package com.Evidencia3.Ejercicio1.repository;

import com.Evidencia3.Ejercicio1.model.Usuario;
import org.springframework.data.repository.CrudRepository;

// Definición de la interfaz UsuarioRepository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}

