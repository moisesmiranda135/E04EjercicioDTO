package com.triana.salesianos.Ejercicio2.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetProductoDto {

    private String nombre;
    private String desc;
    private List<String> imagenes;
    private String categoria;
}
