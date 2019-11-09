package com.epam;

/**
 * Used to create a Fibonacci sequence and process it
 */
public class Fibonacci {

    /**
     * Prevents calls from a subclass, because this is utility class
     * and it should not have a public or default constructor
     *
     * @throws UnsupportedOperationException unsupported operation exception
     */
    protected Fibonacci() {
        throw new UnsupportedOperationException();
    }

    /**
     * Creates an assigned size Fibonacci sequence
     *
     * @param size the size of array
     * @return Fibonacci sequence array
     */
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

    /**
     * Finds the biggest odd number of Fibonacci sequence or other array
     *
     * @param array an array of long type numbers
     * @return the biggest odd number
     */
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

    /**
     * Finds the biggest even number of Fibonacci sequence or other array
     *
     * @param array an array of long type numbers
     * @return the biggest even number
     */
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

    /**
     * Calculates the percentage of odd numbers of Fibonacci sequence
     * or other array
     *
     * @param array an array of long type numbers
     * @return percentage of odd numbers
     */
    public static int getPercentageOdd(long[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter += 1;
            }
        }
        return counter * 100 / array.length;
    }

    /**
     * Calculates the percentage of even numbers of Fibonacci sequence
     * or other array
     *
     * @param array an array of long type numbers
     * @return percentage of even numbers
     */
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
