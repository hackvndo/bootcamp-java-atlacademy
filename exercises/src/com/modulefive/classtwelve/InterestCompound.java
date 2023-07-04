package com.modulefive.classtwelve;

/*
Crear un programa para calcular el interés compuesto: Este programa debe permitir al usuario ingresar el capital inicial,
 la tasa de interés y el tiempo en años. Utilizando la fórmula del interés compuesto, el programa debe calcular el monto
 total acumulado y mostrarlo al usuario.
 */

import java.util.Scanner;

public class InterestCompound {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the initial capital ($): ");
        double capitalAmount = console.nextDouble();

        System.out.println("Enter the amount of interest (%): ");
        double interestAmount = console.nextDouble() / 100;

        System.out.println("Enter the time in years you want: ");
        int yearsAmount = console.nextInt();

        double totalAmount = calculateInterestCompund(capitalAmount, interestAmount, yearsAmount);
        String amountFormat = String.format("%.2f", totalAmount);

        System.out.println("The total amount acumulate is: " + amountFormat);
    }

    public static double calculateInterestCompund(double capitalAmount, double interestAmount, int yearsAmount) {
        double totalAmount = capitalAmount * Math.pow((1 + interestAmount), yearsAmount);
        return totalAmount;
    }

}
