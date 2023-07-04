package org.example;

public class Main {
        public static void main(String[] args) {
            String myString = new String("I study Java Basic");
            String myString1 = myString;
            System.out.println(myString1.charAt(myString1.length() - 2));
            System.out.println(myString1.contains("Java"));
            System.out.println(myString1.substring(8,13));
            System.out.println(myString1.replace("a","o"));
            System.out.println(myString1.toUpperCase());
            System.out.println(myString1.toLowerCase());
        }
}