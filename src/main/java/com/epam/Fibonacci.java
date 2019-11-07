package com.epam;


public class Fibonacci {

    public static long[] getSequence(int size) {
        long num1 = 0;
        long num2 = 1;
        long temp;
        long[] sequence = new long[size];
        for (int i = 1; i <= size; i++) {
            sequence[i - 1] = num1;
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return sequence;
    }

    public static long getBiggestOdd(long[] array) {
        long max = 0;
        if (array[0] % 2 != 0) {
            max = array[0];
        }
        for (int i = 1; i < array.length; i++) {
            if ((array[i] > max) && (array[i] % 2 != 0)) {
                max = array[i];
            }
        }
        return max;
    }

    public static long getBiggestEven(long[] array) {
        long max = 0;
        if (array[0] % 2 == 0) {
            max = array[0];
        }
        for (int i = 1; i < array.length; i++) {
            if ((array[i] > max) && (array[i] % 2 == 0)) {
                max = array[i];
            }
        }
        return max;
    }
    

}
