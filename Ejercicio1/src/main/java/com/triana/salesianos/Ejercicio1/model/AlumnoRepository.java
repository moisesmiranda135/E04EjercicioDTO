package com.triana.salesianos.Ejercicio1.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository
        extends JpaRepository <Alumno, Long> {
}
