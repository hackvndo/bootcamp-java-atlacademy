package com.modulefive.classthirteen.geometry;

/*
Crea una clase base llamada "Figura" con métodos para calcular el área y el perímetro de una figura geométrica genérica.
Luego, crea clases derivadas como "Triangulo", "Rectangulo" y "Circulo", que hereden de la clase base y sobreescriban los
métodos para calcular el área y el perímetro según su forma específica. Crea instancias de las diferentes figuras y muestra sus áreas y perímetros.
 */

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(5, 4, 3, 4, 5);
        Square square = new Square(10, 5);
        Circle circle = new Circle (2.5);

        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());

        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        System.out.println("Square area: " + square.calculateArea());
        System.out.println("Square perimeter: " + square.calculatePerimeter());
    }

}
