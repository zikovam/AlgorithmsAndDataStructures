package com.zikovam.algorithms;

public class GreatestCommonDivisor {

    public void runCalculateGcdByEuclid(long num1, long num2){
        System.out.println(calculateGcdByEuclid(num1, num2));
    }

    private long calculateGcdByEuclid(long num1, long num2) {

        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        } else {
            return (num1 / num2 > 0) ?
                    calculateGcdByEuclid(num1 % num2, num2) : calculateGcdByEuclid(num1, num2 % num1);
        }
    }
}
