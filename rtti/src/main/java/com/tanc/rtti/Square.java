package com.tanc.rtti;

/**
 * 方形
 */
public class Square implements Shape {

    private double x;
    private double y;

    public Square(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double area() {
        return x * y;
    }

    @Override
    public void show() {
        System.out.println("square");
    }
}
