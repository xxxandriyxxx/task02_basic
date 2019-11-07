package com.epam;


public class SortArray {
    
    public static void printOdd(int[] array) {
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }



}
