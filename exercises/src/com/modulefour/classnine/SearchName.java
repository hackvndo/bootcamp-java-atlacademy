package com.modulefour.classnine;

/*
Crea un programa que tenga un arreglo con nombres completos de personas. Ademas, debe permitir realizar
una busqueda por el nombre de la persona.
 */

import java.util.Scanner;

public class SearchName {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese su busqueda");
        String userSearch = console.nextLine();

        String[] names = {
                "Alfonso Prez",
                "Julieta Venega",
                "Veronica Pamborri",
                "Rodrigo Cuartero",
                "Leonardo Da Vinci"
                };

        boolean found = false;
        for (String name : names) {
            if (name.toLowerCase().contains(userSearch)) {
                System.out.println("Busqueda satisfactoria: " + name);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Su busqueda no obtuvo resultados");
        }
    }

}


