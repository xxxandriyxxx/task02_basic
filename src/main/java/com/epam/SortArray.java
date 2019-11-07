package com.epam;


public class SortArray {

    public static void printOdd(int[] array) {
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printEvenReverse(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void printSumOdd (int[] array){
        int sum = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void printSumEven (int[] array){
        int sum = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }


}
