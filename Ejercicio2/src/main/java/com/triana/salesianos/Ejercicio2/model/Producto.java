package com.triana.salesianos.Ejercicio2.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private  double desc;
    private double pvp;

    @Lob
    private  String imagenes;

    @ManyToOne
    private Categoria categoria;

    public Producto(String nombre, double desc, double pvp,String imagenes) {
        this.nombre = nombre;
        this.desc = desc;
        this.pvp = pvp;
        this.imagenes = imagenes;
    }
}
