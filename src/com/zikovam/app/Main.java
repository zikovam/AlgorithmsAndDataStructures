package com.zikovam.app;

import com.zikovam.algorithms.Fibonacci;
import com.zikovam.algorithms.GreatestCommonDivisor;

public class Main {

    public static void main(String[] args) {
        System.out.println("FIBONACCI:");
        long startTime = System.currentTimeMillis();
        new Fibonacci().runCalculateFibonacciNumberByTableAlgorithm(10000);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");

        System.out.println("-------------------------");

        System.out.println("GCD:");
        startTime = System.currentTimeMillis();
        new GreatestCommonDivisor().runCalculateGcdByEuclid(14159572, 63967072);
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime + " ms");

    }
}
