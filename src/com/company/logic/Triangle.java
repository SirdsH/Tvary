package com.company.logic;

public class Triangle extends Shape {
    private float sideA;
    private float sideB;
    private float sideC;
    private float height;

    public Triangle(float a, float b, float c, float height) {
        super(area(c, height), perimeter(a, b ,c));
        this.sideA = a;
        this.sideB = b;
        this.sideC = c;
        this.height = height;
    }

    public static float area(float c, float height) {
        return c * height / 2;
    }

    public static float perimeter(float a, float b, float c) {
        return a + b + c;
    }
}
