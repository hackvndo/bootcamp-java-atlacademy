package com.classSeven;

/*
Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
 */

import java.util.Scanner;

public class FiveNumbers {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int fiveNumbers[] = new int[5];
        int major = 0;
        int minor = 99999;
        double prom = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese un numero");
            fiveNumbers[i] = console.nextInt();
            prom += fiveNumbers[i];
            if (fiveNumbers[i] > major) {
                major = fiveNumbers[i];
            }
            if (fiveNumbers[i] < minor) {
                minor = fiveNumbers[i];
            }
        }
        System.out.println("Los numeros son: ");
        for (int numbers : fiveNumbers) {
            System.out.println(numbers);
        }

        System.out.println("Numero mayor: " + major);
        System.out.println("Numero menor: " + minor);
        System.out.println("Promedio: " + prom / fiveNumbers.length);

    }


}
