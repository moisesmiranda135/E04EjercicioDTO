package com.triana.salesianos.Ejercicio1.DTO;


import org.springframework.stereotype.Component;

@Component
public class AlumnnoDtoConverter {

    public Alumno createAlumnoDtoToAlumno(CreateAlumnoDto a){

        return new Alumno(

                a.getNombre(),
                a.getApellido1(),
                a.getApellido2(),
                a.getEmail(),
                a.getCurso(),
                a.getDireccion()




        );




    }

    public GetAlumnoDTO alumnoToGetAlumno(Alumno al){


        GetAlumnoDTO result = new GetAlumnoDTO();
        result.setNombre(al.getNombre());
        


    }
}
