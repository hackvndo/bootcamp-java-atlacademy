package com.modulefive.classthirteen;

public class Triangle extends Figure {

    private double base;
    private double heigth;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double base, double heigth, double sideA, double sideB, double sideC) {
        this.base = base;
        this.heigth = heigth;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return (base * heigth) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
