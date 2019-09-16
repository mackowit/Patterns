package com.kodilla.testing.shape;

public class Square implements Shape {
    private int side;
    String shapeName = "Square";

    public Square(int side) {
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
        double sideDouble = (double) side;
        return sideDouble * sideDouble;
    }

    @Override
    public String toString() {
        return "Shape: " + shapeName + " with side " + side + " cm";
    }
}
