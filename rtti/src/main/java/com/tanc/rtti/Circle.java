package com.tanc.rtti;

/**
 * 圆形
 */
public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public void show() {
        System.out.println("circle");
    }
}
