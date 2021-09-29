package com.triana.salesianos.Ejercicio2;

import com.triana.salesianos.Ejercicio2.dto.CreateProductoDto;
import com.triana.salesianos.Ejercicio2.dto.ProductoDtoConverter;
import com.triana.salesianos.Ejercicio2.model.Categoria;
import com.triana.salesianos.Ejercicio2.model.CategoriaRepository;
import com.triana.salesianos.Ejercicio2.model.Producto;
import com.triana.salesianos.Ejercicio2.model.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Ejercicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio2Application.class, args);
	}


	@Bean
	public CommandLineRunner CrearProducto(ProductoRepository AlumnoRepository) {

		return args -> {

			@RestController
			@RequiredArgsConstructor
			@RequestMapping("/producto")
			class ProductoController {

				private final ProductoRepository repository;
				private final ProductoDtoConverter dtoConverter;
				private final CategoriaRepository categoriaRepository;


				@PostMapping("/")

				public ResponseEntity<Producto> create(@RequestBody CreateProductoDto dto) {

					if (dto.getCategoriaId() == null) {
						return ResponseEntity.badRequest().build();
					}


					Producto nuevo = dtoConverter.createProductoDtoToProducto(dto);

					Categoria categoria = categoriaRepository.findById(dto.getCategoriaId()).orElse(null);



					nuevo.setCategoria(categoria);


					return ResponseEntity
							.status(HttpStatus.CREATED)
							.body(repository.save(nuevo));

				}

			}

		};

	}

}
