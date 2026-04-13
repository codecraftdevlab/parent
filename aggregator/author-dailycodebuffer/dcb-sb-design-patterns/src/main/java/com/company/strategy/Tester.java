package com.company.strategy;

public class Tester {

    public static void main(String[] args) {
        System.out.println(new Context(new AdditionStrategy()).executeStrategy(10, 5));
        System.out.println(new Context(new SubtractionStrategy()).executeStrategy(10, 5));
        System.out.println(new Context(new MultiplicationStrategy()).executeStrategy(10, 5));
    }
}
