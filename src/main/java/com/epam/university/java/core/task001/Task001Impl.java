package com.epam.university.java.core.task001;

public class Task001Impl implements Task001 {
    private void prevalidate(String firstNumber, String secondNumber) {
        if (firstNumber == null)
            throw new IllegalArgumentException("firstNumber is null");
        if (secondNumber == null)
            throw new IllegalArgumentException("secondNumber is null");
    }

    @Override
    public double addition(String firstNumber, String secondNumber) {
        prevalidate(firstNumber, secondNumber);
        return Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
    }

    @Override
    public double subtraction(String firstNumber, String secondNumber) {
        prevalidate(firstNumber, secondNumber);
        return Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
    }

    @Override
    public double multiplication(String firstNumber, String secondNumber) {
        prevalidate(firstNumber, secondNumber);
        return Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
    }

    @Override
    public double division(String firstNumber, String secondNumber) {
        prevalidate(firstNumber, secondNumber);
        return Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
    }
}
