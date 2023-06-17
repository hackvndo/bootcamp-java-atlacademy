package com.iamtiedev.service.person;

/*
“Crea un servicio web en springboot que tenga un arreglo con nombres completos de personas.
Debe permitir realizar una búsqueda por el nombre de la persona, agregar personas y también borrarlas”. 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonServiceApplication.class, args);
	}

}
