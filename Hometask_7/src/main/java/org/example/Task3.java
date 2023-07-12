package org.example;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите целое число ");
        int num1 = scanner.nextInt();
        System.out.print("введите целое число ");
        int num2 = scanner.nextInt();
        System.out.print("введите целое число ");
        int num3 = scanner.nextInt();

        System.out.println("максимальное из них: " + getMax(num1, num2, num3));
    }

    public static int getMax(int arg1, int arg2, int arg3) {
        int maxOfTwo = Math.max(arg1, arg2);
        int maxOfNext = Math.max(maxOfTwo, arg3);
        if (maxOfNext > maxOfTwo) {
            return maxOfNext;
        } else {
            return maxOfTwo;
        }
    }
}
