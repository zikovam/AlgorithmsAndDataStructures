package com.zikovam.algorithms;

import java.math.BigInteger;

public class DifficultyCalculation {

    public void calculate(int point) {
        System.out.println("log(log(n)) = " + Math.log(Math.log(point)));
//        System.out.println(Math.sqrt(Math.log(n, 4)));
//        System.out.println(Math.log(n, 3));
        System.out.println("log(n)^2 = " + Math.pow(Math.log(point), 2));
        System.out.println(Math.sqrt(point));
//        System.out.println(n / Math.log(n, 5));
        System.out.println(Math.log(calculateFactorial(point).doubleValue()));
        System.out.println(Math.pow(3, Math.log(point)));
        System.out.println(Math.pow(point, 2));
        System.out.println(Math.pow(7, (Math.log(point))));
        System.out.println(Math.pow(Math.log(point), (Math.log(point))));
        System.out.println(Math.pow(point, (Math.sqrt(point))));
        System.out.println(Math.pow(point, (Math.log(point))));
        System.out.println(Math.pow(2, point));
        System.out.println(Math.pow(4, point));
        System.out.println(Math.pow(2, (3 * point)));
        System.out.println(calculateFactorial(point));
    }

    static BigInteger calculateFactorial(int n) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++)
            fact = fact.multiply(BigInteger.valueOf(i));
        return fact;
    }
}

