package com.zikovam.algorithms;

import java.math.BigInteger;

public class GreatestCommonDivisor {

    public void runCalculateGcdByEuclid(BigInteger num1, BigInteger num2) {
        System.out.println(calculateGcdByEuclid(num1, num2));
    }

    private BigInteger calculateGcdByEuclid(BigInteger num1, BigInteger num2) {

        while (true) {
            if (num1.equals(BigInteger.ZERO)) {
                return num2;
            }
            if (num2.equals(BigInteger.ZERO)) {
                return num1;
            }
            if (num1.compareTo(num2) >= 0) {
                num1 = num1.mod(num2);
            } else {
                num2 = num2.mod(num1);
            }
        }
    }
}