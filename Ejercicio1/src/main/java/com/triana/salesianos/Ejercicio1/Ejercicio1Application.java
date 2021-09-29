package com.triana.salesianos.Ejercicio1;

import com.triana.salesianos.Ejercicio1.model.AlumnoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Random;

@SpringBootApplication
public class Ejercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}

	/*
	@Bean
	public CommandLineRunner CrearAlumno(AlumnoRepository AlumnoRepository) {

		return args -> {

			private final AlumnoRepository repository;
			private final AlumnoDtoConverter dtoConverter;
			private final CursoRepository cursoRepository;
			private final DirecionRepository direccionRepository;


			@PostMapping("/")
			//public ResponseEntity<Monumento> create(@RequestBody Monumento nuevo) {
			public ResponseEntity<Monumento> create(@RequestBody CreateMonumentoDto dto) {

				if (dto.getCategoriaId() == null) {
					return ResponseEntity.badRequest().build();
				}


				Monumento nuevo = dtoConverter.createMonumentoDtoToMonumento(dto);

				Categoria categoria = categoriaRepository.findById(dto.getCategoriaId()).orElse(null);

				nuevo.setCategoria(categoria);


				return ResponseEntity
						.status(HttpStatus.CREATED)
						.body(repository.save(nuevo));

			}

		};

	}
*/
}
