package com.triana.salesianos.Ejercicio1.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
public class Alumno {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private String apellido1;

    private String apellido2;

    private String telefono;

    private String email;

    @ManyToOne
    private Curso curso;

    @ManyToOne
    private Direccion direccion;


    public Alumno(String nombre, String apellido1, String apellido2, String telefono, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
        this.email = email;
    }
}
