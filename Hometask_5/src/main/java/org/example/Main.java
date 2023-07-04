package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите 2 слова через запятую");
        String input = myScanner.nextLine();

        String[] words = input.split("\\s+");

        if (words.length == 2) {
            String myString = words[0].replace(",", "").trim();
            String myString1 = words[1];


            if (myString.length() % 2 == 0 && myString1.length() % 2 == 0) {
                int endInt = myString.length() / 2;
                int beginInt1 = myString1.length() / 2;
                int endInt1 = myString1.length();
                System.out.println(myString.substring(0, endInt) + myString1.substring(beginInt1, endInt1));
            }
        }
    }
}