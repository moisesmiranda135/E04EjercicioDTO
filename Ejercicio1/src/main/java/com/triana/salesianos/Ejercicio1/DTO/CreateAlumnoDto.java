package com.triana.salesianos.Ejercicio1.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateAlumnoDto {


    private String nombre;
    private String apellido1;
    private String apellido2;
    private String telefono;
    private String email;
    private Long direccionId;
    private Long cursoId;



}
