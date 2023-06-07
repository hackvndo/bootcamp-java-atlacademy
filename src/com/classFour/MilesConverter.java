package com.classFour;

/*
2) Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/

import java.util.Scanner;

public class MilesConverter {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese distancia en millas: ");

        double miles = console.nextDouble();
        double kms = miles * 1.60934;

        System.out.println("La distancia en kms es de: " + kms);
    }
}
