package com.company.logic;

public class Circle extends Shape {
    private float radius;
    private float diameter;

    public Circle(float radius, float diameter) {
        super(area(radius), perimeter(radius));
        this.radius = radius;
        this.diameter = diameter;
    }

    public static float area(float radius) {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    public static float perimeter(float radius) {
        return (float) (2 * Math.PI * radius );
    }
}
