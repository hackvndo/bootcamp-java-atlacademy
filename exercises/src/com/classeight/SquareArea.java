package com.classeight;

/*
Hacer una función que calcule el área de un cuadrado. Al llamarla debe devolver el área del cuadrado.
 */

public class SquareArea {

    public static void main(String[] args) {
        System.out.println(getSquareArea(10, 15));
    }

    private static double getSquareArea(double height, double base) {
        return height * base;

    }

}
