package com.fangfaze.java.study.chaptere4;

public class Circle implements Figure {

    final private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
