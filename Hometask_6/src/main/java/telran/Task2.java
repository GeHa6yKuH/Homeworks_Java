package telran;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28800);
        System.out.println("до конца рабочего дня осталось " + n + " секунд");
        countHoursTillEnd(n);

    }

    public static void countHoursTillEnd(int secd) {
        int hours = secd / 3600;
        if (hours > 0) {
            if (hours == 1) {
                System.out.println("до конца рабочего дня остался 1 час");
            } else if (hours == 2 || hours == 3 || hours ==4) {
                System.out.println("до конца рабочего дня осталось " + hours + " часа");
            } else {
                System.out.println("до конца рабочего дня осталось " + hours + " часов");
            }
        } else {
            System.out.println("рабочий день окончен, идите домой");
        }
    }

}
