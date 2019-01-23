package com.zikovam.app;

import com.zikovam.algorithms.Fibonacci;

public class Main {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        System.out.println(fibonacci.calculateFibonacciNumberByTableAlgorithm(15));
    }
}
