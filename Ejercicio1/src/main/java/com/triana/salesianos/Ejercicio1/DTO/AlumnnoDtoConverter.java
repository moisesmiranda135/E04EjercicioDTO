package com.triana.salesianos.Ejercicio1.DTO;


import com.triana.salesianos.Ejercicio1.model.Alumno;
import org.springframework.stereotype.Component;

@Component
public class AlumnnoDtoConverter {

    public Alumno createAlumnoDtoToAlumno(CreateAlumnoDto a){

        return new Alumno(

                a.getNombre(),
                a.getApellido1(),
                a.getApellido2(),
                a.getTelefono(),
                a.getEmail()
        );




    }

    public GetAlumnoDTO alumnoToGetAlumno(Alumno al){


        GetAlumnoDTO result = new GetAlumnoDTO();
        result.setNombre(al.getNombre());
        result.setApellidos(String.format("%s (%s)",al.getApellido1(),al.getApellido2()));
        result.setEmail(al.getEmail());


  return  result;









    }
}
