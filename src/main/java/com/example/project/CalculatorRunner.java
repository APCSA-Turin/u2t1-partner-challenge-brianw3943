package com.example.project;


import java.net.CacheRequest;


public class CalculatorRunner {
    public static void main(String[] args) {


        //test your program here
        //1. create an instance of the calculator class
        Calculator calc1 = new Calculator("TI-84");
        //2. call any methods of that class to test
        System.out.println(calc1.performOperation("/", 3, 9));
        System.out.println(calc1.divisibleBy(15, 5));
        System.out.println(calc1.coordinatePair(2, 5));
        System.out.println(calc1.absoluteValue(9, 15));
        System.out.println(calc1.calcModel);
    }
}




