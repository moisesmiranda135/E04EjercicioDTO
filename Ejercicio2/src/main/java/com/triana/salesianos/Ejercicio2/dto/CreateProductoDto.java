package com.triana.salesianos.Ejercicio2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductoDto {

    private String nombre;
    private Double pvp;
    private Double desc;
    private String imagen;
    private Long categoriaId;
}
