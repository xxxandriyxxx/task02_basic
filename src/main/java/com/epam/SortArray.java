package com.epam;

/**
 * Used for arrays processing
 */
public class SortArray {

    /**
     * Prevents calls from a subclass, because this is utility class
     * and it should not have a public or default constructor
     *
     * @throws UnsupportedOperationException unsupported operation exception
     */
    protected SortArray() {
        throw new UnsupportedOperationException();
    }

    /**
     * Finds and prints the odd numbers of array
     *
     * @param array an array of integers
     */
    public static void printOdd(int[] array) {
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Finds and prints the even numbers of array by reverse
     *
     * @param array an array of integers
     */
    public static void printEvenReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * Calculates and prints the sum of odd numbers of array
     *
     * @param array an array of integers
     */
    public static void printSumOdd(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    /**
     * Calculates and prints the sum of even numbers of array
     *
     * @param array an array of integers
     */
    public static void printSumEven(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
