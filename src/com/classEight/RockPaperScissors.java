package com.classEight;

/*
Hacer nuevamente el juego de Piedra, Papel o Tijeras pero utilizando funciones, arreglos y bucles.
 */

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        int userAnswer = getUserAnswer();

        if (userAnswer < 1 || userAnswer > 3) {
            System.out.println("Eleccion incorrecta");
            return;
        }

        int computerAnswer = getComputerAnswer();

        determineWinner(userAnswer, computerAnswer);
    }

    public static int getUserAnswer() {
        Scanner console = new Scanner(System.in);
        System.out.println("""
                Elige:
                1.Piedra
                2.Papel  
                3.Tijeras""");

        int userAnswer = console.nextInt();
        return userAnswer;
    }

    public static int getComputerAnswer() {
        Random random = new Random();
        int computerAnswer = random.nextInt(3) + 1;
        return computerAnswer;
    }

    public static void determineWinner(int userAnswer, int computerAnswer) {
        String[] options = {"Piedra", "Papel", "Tijeras"};
        System.out.println("La computadora eligió: " + options[computerAnswer - 1]);
        System.out.println("Tú has elegido: " + options[userAnswer - 1]);

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
