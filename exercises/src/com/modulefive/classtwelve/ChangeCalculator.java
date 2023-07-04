package com.modulefive.classtwelve;

/*
Crear un programa que funcione como una calculadora de cambio:
Este programa debe recibir como entrada una cantidad de dinero y el costo de un producto.
Utilizando la resta, el programa debe calcular el cambio que se debe entregar al cliente y mostrar la cantidad de billetes
y monedas necesarios para el cambio.
 */

import java.util.Scanner;

public class ChangeCalculator {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter the amount of money received: ");
        double amountReceived = console.nextDouble();

        System.out.println("Enter the cost of product: ");
        double productCost = console.nextDouble();

        double change = calculateChange(amountReceived, productCost);
        System.out.println("The change to be given is: " + change);


        breakdownChange(change);
    }

    public static double calculateChange(double amountReceived, double productCost) {
        return amountReceived - productCost;
    }

    public static void breakdownChange(double change) {
        int[] denominations = {100, 50, 20, 10, 5, 2, 1};

        System.out.println("Breakdowns of the change: ");

        for (int i = 0; i < denominations.length; i++) {
            if (change >= denominations[i]) {
                int quantity = (int) (change / denominations[i]);
                change %= denominations[i];

                if (denominations[i] >= 5) {
                    System.out.println(quantity + " bill(s) of $" + denominations[i]);
                } else {
                    System.out.println(quantity + " coin(s) of $" + denominations[i]);
                }
            }
        }
    }

}
