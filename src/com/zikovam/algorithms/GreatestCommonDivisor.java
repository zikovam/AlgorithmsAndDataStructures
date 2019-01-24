package com.zikovam.algorithms;

public class GreatestCommonDivisor {
    public long calculateEuclid(long num1, long num2) {

        if (num1 == 0) {
            return num2;
        }
        if (num2 == 0) {
            return num1;
        } else {
            return (num1 / num2 > 0) ?
                    calculateEuclid(num1 % num2, num2) : calculateEuclid(num1, num2 % num1);
        }
    }
}
