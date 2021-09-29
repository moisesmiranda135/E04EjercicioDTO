package com.triana.salesianos.Ejercicio1.DTO;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetAlumnoDTO {

    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String curso;
    private String direccion;




}
