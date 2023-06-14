package com.classEight;

/*
Hacer una función que calcule el área de un triángulo. Al llamarla debe devolver el área del triángulo.
 */

public class TriangleArea {

    public static void main(String[] args) {
        System.out.println(getTriangleArea(3, 6));
    }

    private static double getTriangleArea(double height, double base) {
        return (height * base);

    }

}
