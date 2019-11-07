package com.epam;

public class Fibonacci {

    public static void printSequence(int size) {
        long num1 = 0;
        long num2 = 1;
        long temp;
        System.out.println("First " + size + " fibonacci numbers:");
        for (int i = 1; i <= size; i++) {
            System.out.print(num1 + " ");
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
    }
}
