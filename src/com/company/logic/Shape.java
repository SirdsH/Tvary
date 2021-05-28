package com.company.logic;

public class Shape {
    private float area;
    private float perimeter;

    public Shape(float area, float perimeter) {
        this.area = area;
        this.perimeter = perimeter;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }
}
