package com.classsix;

/*
Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras"
contra la computadora. El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras)
y luego generar una elección aleatoria para la computadora. Después de eso, el programa debe determinar el ganador
según las reglas del juego y mostrar el resultado.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        System.out.println("""
                Elige:
                1.Piedra
                2.Papel  
                3.Tijeras""");

        int userAnswer = console.nextInt();

        if (userAnswer < 1 || userAnswer > 3) {
            System.out.println("Eleccion incorrecta");
            return;
        }

        String[] options = {"Piedra", "Papel", "Tijeras"};
        int computerAnswer = random.nextInt(3) + 1;

        System.out.println("La computadora eligio: " + options[computerAnswer - 1]);

        System.out.println("Tu has elegido: " + options[userAnswer -1]);

        if (userAnswer == computerAnswer) {
            System.out.println("Empate!");
        } else if ((userAnswer == 1 && computerAnswer == 3) ||
                   (userAnswer == 2 && computerAnswer == 1) ||
                   (userAnswer == 3 && computerAnswer == 2)) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
    }

}
