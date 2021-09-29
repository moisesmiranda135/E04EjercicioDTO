package model;

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

    
    private  List<String>;

    @ManyToOne
    private Categoria categoria;

    public Producto(String nombre, double desc, double pvp, Categoria categoria) {
        this.nombre = nombre;
        this.desc = desc;
        this.pvp = pvp;
        this.categoria = categoria;
    }
}
