package com.triana.salesianos.Ejercicio2.dto;

public class ProuductoDtoConverter {

    public Producto createProductoDtoToProducto(CreateProductoDto p) {
        return new Producto(
                p.getNombre(),
                p.getCategoriaId(),
                p.getDesc(),
                p.getImagen(),
                p.getPvp()
        );
    }

    public GetProductoDto monumentoToGetMonumentoDto(Producto pr) {

        GetProductoDto result = new GetProductoDto();

        return result;



    }
}
