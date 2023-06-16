package com.iamtiedev.autocomplete;

/*
“Estamos armando el servicio de autocompletar de Google.
Tienes que desarrollar una aplicación en springboot que recibe lo que está escribiendo el usuario, y devuelve un listado de posibles resultados.
Para hacer esto en un array de String carga resultados de ejemplo”.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutocompleteSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutocompleteSpringApplication.class, args);
	}

}
