package com.classseven;

/*
Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
 */

import java.util.Scanner;

public class FiveNumbers {

    private static final int NUM_ELEMENTS = 5;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] numbers = new int[NUM_ELEMENTS];
        double sum = 0;

        for (int i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println("Ingrese un numero para la posicion " + (i + 1) + ":");
            numbers[i] = readValidNumber(console);
            sum += numbers[i];
        }

        System.out.println("Los numeros son: ");
        printNumbers(numbers);

        int major = findMajorNumber(numbers);
        int minor = findMinorNumber(numbers);
        double prom = calculateAverage(sum);

        System.out.println("Numero mayor: " + major);
        System.out.println("Numero menor: " + minor);
        System.out.println("Promedio: " + prom);

    }

    private static int readValidNumber(Scanner console) {
        while (true) {
            if (console.hasNextInt()) {
                return console.nextInt();
            } else {
                System.out.println("Entrada invalida! Favor de ingresar numero valido.");
                console.next(); // Clean buffer
            }
        }
    }

    private static void printNumbers(int[] fiveNumbers) {
        for (int number : fiveNumbers) {
            System.out.println(number);
        }
    }

    private static int findMajorNumber(int[] fiveNumbers) {
        int largest = Integer.MIN_VALUE;
        for (int number : fiveNumbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }

    private static int findMinorNumber(int[] fiveNumbers) {
        int smallest = Integer.MAX_VALUE;
        for (int number : fiveNumbers) {
            if (number < smallest) {
                smallest = number;
            }
        }
        return smallest;
    }

    private static double calculateAverage(double sum) {
        return sum / NUM_ELEMENTS;
    }

}
