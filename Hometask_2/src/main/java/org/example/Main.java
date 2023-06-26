package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int myInt;
        Scanner scanner = new Scanner(System.in);
        System.out.print("ввести трехзначное число: ");
        myInt = scanner.nextInt();

        int hundred = myInt / 100;
        int ten = myInt % 100 / 10;
        int count = myInt % 10;
        System.out.println(hundred + ", " + ten + ", " + count);
    }
}