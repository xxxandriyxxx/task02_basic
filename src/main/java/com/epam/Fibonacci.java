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

    public static int getPercentageOdd(long[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter += 1;
            }
        }
        return counter * 100 / array.length;
    }

    public static int getPercentageEven(long[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter += 1;
            }
        }
        return counter * 100 / array.length;
    }

}
