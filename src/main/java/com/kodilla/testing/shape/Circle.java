package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int radius;
    String shapeName = "Circle";

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    @Override
    public Double getField() {
        return (3.14 * radius * radius);
    }

    @Override
    public String toString() {
        return "Shape: " + shapeName + " with radius " + radius + " cm";
    }
}
