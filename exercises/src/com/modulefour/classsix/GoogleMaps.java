package com.modulefour.classsix;

import java.util.Scanner;

/*
Arma un buscador de países con Google Maps.
Primero, pidele al usuario que ingrese un país (Ej: Colombia).
Después muestra en consola la concatenación de:
“https://www.google.com/maps/search/” + pais
Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
 */

public class GoogleMaps {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese un pais...");
        String country = console.nextLine();

        System.out.println("https://www.google.com/maps/search/" + country);

    }

}
