package com.kodilla.testing.calculator;

public class Calculator {
        int number1;
        int number2;

        public void Calculator(int number1, int number2) {
            this.number1 = number1;
            this.number2 = number2;
        }

        public int add(int number1, int number2) {

            return number1 + number2;
        }

        public int subtract(int number1, int number2) {

            return number1 - number2;
        }

    }
