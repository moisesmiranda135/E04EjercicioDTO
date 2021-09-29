package com.triana.salesianos.Ejercicio2.dto;

import com.triana.salesianos.Ejercicio2.model.Producto;

public class ProuductoDtoConverter {

    public Producto createProductoDtoToProducto(CreateProductoDto p) {
        return new Producto(
                p.getNombre(),
                p.getDesc(),
                p.getPvp(),
                p.getImagen()
        );
    }

    public GetProductoDto monumentoToGetMonumentoDto(Producto pr) {

        GetProductoDto result = new GetProductoDto();
        result.setNombre(pr.getNombre());
        result.setDesc(pr.getDesc());
        result.setImagenes(pr.getImagenes());
        result.setCategoria(pr.getCategoria().getNombre());
        return result;



    }
}
