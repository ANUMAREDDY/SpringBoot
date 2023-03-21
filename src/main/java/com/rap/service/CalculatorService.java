package com.rap.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double add(double a, double b){
        System.out.println("Addition of the two numbers");
        return a+b;

    }
    public double divide(double a, double b){
        System.out.println("division of the two numbers");
        return a/b;

    }
    public double multiply(double a, double b){
        System.out.println("Multiplication of the two numbers");
        return a*b;

    }
    public double substraction(double a, double b){
        System.out.println("Substraction of the two numbers");
        return a-b;

    }

}
