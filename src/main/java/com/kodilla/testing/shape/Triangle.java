package com.kodilla.testing.shape;

public class Triangle implements Shape {
    int side;
    String shapeName = "Triangle";

    public Triangle(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public Double getField() {
        return (side * side * Math.sqrt(3) * 0.25);
    }

    @Override
    public String toString() {
        return "Shape: " + shapeName + " with basis " + side + " cm";
    }
}
