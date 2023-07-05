package com.modulefive.classthirteen;

public class Circle extends Figure {

    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radio ,2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }
}
