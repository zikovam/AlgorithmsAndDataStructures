package com.zikovam.app;

import com.zikovam.algorithms.Fibonacci;
import com.zikovam.algorithms.GreatestCommonDivisor;

public class Main {

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Fibonacci: "
                + fibonacci.calculateFibonacciNumberByTableAlgorithm(15));

        GreatestCommonDivisor gcd = new GreatestCommonDivisor();
        System.out.println("GCD: "
                + gcd.calculateEuclid(14159572, 63967072));

    }
}
