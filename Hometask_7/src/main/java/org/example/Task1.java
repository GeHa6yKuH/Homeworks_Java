package org.example;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isEdekaOpen = random.nextBoolean();
        boolean isReweOpen = random.nextBoolean();
        System.out.println("Я могу купить еду, это " + canBuy(isEdekaOpen, isReweOpen));
    }

    public static boolean canBuy(boolean edOpCl, boolean reOpCl) {
        if (edOpCl == true || reOpCl == true) {
            return true;
        } else {
            return false;
        }
    }
}