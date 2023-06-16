package com.classfive;

/*
3) Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
 */

import java.util.Scanner;

public class DiscountCalculator {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.println("Ingrese el precio de un producto: ");
        double price = console.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento: ");
        double discount = console.nextDouble();

        double finalPrice = price - (price * discount / 100);
        System.out.println("El precio final con el descuento es de: $" + finalPrice);

    }
}
