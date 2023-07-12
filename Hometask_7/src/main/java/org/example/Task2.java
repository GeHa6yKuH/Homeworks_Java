package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int Year = scanner.nextInt();
        getIsLeapOrNotSwitch(Year);
    }

    public static void getIsLeapOrNotSwitch(int enYear)  {
        boolean isLeap;
        if (enYear % 4 == 0) {
            if (enYear % 100 != 0) {
                isLeap = true;
            } else if (enYear % 100 == 0 && enYear % 400 == 0) {
                isLeap = true;
            } else {
                isLeap = false;
            }
        } else {
            isLeap = false;
        }
        if (isLeap == true) {
            System.out.println("It is leap");
        } else {
            System.out.println("It is not leap");
        }
    }
}
