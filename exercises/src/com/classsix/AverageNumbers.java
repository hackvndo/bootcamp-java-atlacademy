package com.classsix;

/*
Armar un programa que permita cargar 3 números y mostrar cual es el número promedio
 */

import java.util.Scanner;

public class AverageNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese 3 numeros");
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        double average = (a + b + c) / 3;
        System.out.println("El promedio de los numeros ingresados es: " + average);
    }

}
