package com.classFour;

/*
1) Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
 */

import java.util.Scanner;

public class AgeDogConverter {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese la edad de su perro: ");
        int ageDog = console.nextInt();

        double ageDogConverter = ageDog / 7;
        System.out.println("La edad de su perro en anios humano es de: " + ageDogConverter);

    }
}
