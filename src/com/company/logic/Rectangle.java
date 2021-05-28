package com.company.logic;

public class Rectangle extends Shape {
    private float sideA;
    private float sideB;

    public Rectangle(float a, float b) {
        super(area(a, b), perimeter(a, b));
        this.sideA = a;
        this.sideB = b;
    }

    public static float area(float a, float b) {
        return a * b;
    }

    public static float perimeter(float a, float b) {
        return 2 * (a + b);
    }
}
