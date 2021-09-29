package com.triana.salesianos.Ejercicio1;

import com.triana.salesianos.Ejercicio1.DTO.AlumnoDtoConverter;
import com.triana.salesianos.Ejercicio1.DTO.CreateAlumnoDto;
import com.triana.salesianos.Ejercicio1.model.*;
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
public class Ejercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio1Application.class, args);
	}


	@Bean
	public CommandLineRunner CrearAlumno(AlumnoRepository AlumnoRepository) {

		return args -> {

			@RestController
			@RequiredArgsConstructor
			@RequestMapping("/alumno")
			class AlumnoController {

					private final AlumnoRepository repository;
					private final AlumnoDtoConverter dtoConverter;
					private final CursoRepository cursoRepository;
					private final DireccionRepository direccionRepository;


					@PostMapping("/")

					public ResponseEntity<Alumno> create(@RequestBody CreateAlumnoDto dto) {

						if (dto.getCursoId() == null) {
							return ResponseEntity.badRequest().build();
						}

						if (dto.getDireccionId() == null) {
							return ResponseEntity.badRequest().build();
						}


						Alumno nuevo = dtoConverter.createAlumnoDtoToAlumno(dto);

						Curso curso = cursoRepository.findById(dto.getCursoId()).orElse(null);

						nuevo.setCurso(curso);

						Direccion direccion = direccionRepository.findById(dto.getDireccionId()).orElse(null);

						nuevo.setDireccion(direccion);


						return ResponseEntity
								.status(HttpStatus.CREATED)
								.body(repository.save(nuevo));

					}

			}

		};

	}

}
