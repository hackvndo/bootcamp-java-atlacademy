package com.classfive;

/*
4) Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
 */

import java.util.Scanner;

public class TipsCalculator {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el total de la cuenta: ");
        double totalAccount = console.nextDouble();
        System.out.println("Ingrese el porcentaje de propina que desea dejar: ");
        double tipPercent = console.nextDouble();

        double finalTip = totalAccount * (tipPercent / 100);
        System.out.println("La propina total es de: $" + finalTip);

    }
}
