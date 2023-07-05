package com.modulefive.classthirteen;

public class Square extends Figure {

    private double sideA;
    private double sideB;

    public Square(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return  sideA * sideB;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (sideA + sideB);
    }
}
