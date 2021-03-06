package com.zikovam.algorithms;

import java.math.BigInteger;

public class Fibonacci {
    /**
     * Calculating Fibonacci number using table algorithm.
     *
     * @param num - fibonacci index number.
     * @return fibonacci number by index (if num is negative, will return -1)
     */
    public void runCalculateFibonacciNumberByTableAlgorithm(int num){
        System.out.println(calculateFibonacciNumberByTableAlgorithm(num));
    }

    private BigInteger calculateFibonacciNumberByTableAlgorithm(int num) {

        //fibonacci 0
        BigInteger fibonacciBeforeLast = BigInteger.valueOf(0);
        //fibonacci 1
        BigInteger fibonacciLast = BigInteger.valueOf(1);

        BigInteger temp;

        int counter = 2;
        if (num>=0) {
            switch (num) {
                case 0:
                    return fibonacciBeforeLast;
                case 1:
                    return fibonacciLast;
                default:
                    while (counter < num) {
                        counter++;
                        temp = fibonacciBeforeLast.add(fibonacciLast);
                        fibonacciBeforeLast = fibonacciLast;
                        fibonacciLast = temp;
                    }
                    return fibonacciLast;
            }
        }
        return BigInteger.valueOf(-1);
    }

    /**
     *  Calculating last digit of Fibonacci number using table algorithm
     *
     * @param num - fibonacci index number. Negative numbers are not allowed
     * @return last digit of given fibonacci number
     */
    public int calculateLastDigitOfFibonacciNumber (int num){
        int[] f = new int[2];
        f[0]=1; f[1]=1;
        for (int i=2;i<=(num-1);i++)
            f[i%2] = ( f[i%2] + f[(i+1)%2] ) % 10;
        return f[(num-1)%2];
    }
}
