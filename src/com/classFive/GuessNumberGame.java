package com.classFive;

/*
Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
 */

import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;
        Scanner console = new Scanner(System.in);
        System.out.println("*** Adivina el Numero Magico ***");
        System.out.println("Ingrese su numero de la suerte: ");
        int number = console.nextInt();

        while (number != randomNumber) {
            System.out.println("Sin suerte, prueba otro!");
            number = console.nextInt();
        }

        if (number == randomNumber) {
            System.out.println("Acertaste! Hoy es tu dia de suerte!");
        }
    }
}
