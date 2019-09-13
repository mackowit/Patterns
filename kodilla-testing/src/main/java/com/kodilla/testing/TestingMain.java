package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){

        //testing class Simpleuser

        //testing class calculator
        int digit1 = 10;
        int digit2 = 5;

        Calculator calculator = new Calculator();

        if(calculator.add(digit1, digit2) == (digit1 + digit2)) System.out.println("Calculator.add test OK");
        else System.out.println("Calculator.add test failed");

        if(calculator.subtract(digit1, digit2) == (digit1 - digit2)) System.out.println("Calculator.subtract test OK");
        else System.out.println("Calculator.subtract test failed");

    }
}
