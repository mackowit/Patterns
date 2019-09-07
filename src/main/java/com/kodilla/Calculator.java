package com.kodilla;

public class Calculator {
    float number1;
    float number2;

    public void Calculator(float number1, float number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void add(float number1, float number2) {

        System.out.println("Addition of " + number1 + " and " + number2 + " gives " + (number1+number2));
    }

    public void subtract(float number1, float number2) {

        System.out.println("Subtraction of " + number1 + " and " + number2 + " gives " + (number1-number2));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(10, 10);
        calculator.subtract(10, 10);
    }
}


