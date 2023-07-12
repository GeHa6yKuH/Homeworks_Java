package telran;

public class Task1 {
    public static void main(String[] args) {
    whichIsNear(4,9);
    }

    public static void whichIsNear(double m, double n) {
        double differ = 0;
        double differ1 = 0;
        if (m > 10) {
            differ = differ + m - 10;
        } else if (m < 10) {
            if (m < 0) {
                differ = differ + 10 + (-m);
            } else {
                differ = differ + 10 - m;
            }
        }
        if (n > 10) {
            differ1 = differ1 + n - 10;
        } else if (n < 10) {
            if (n < 0) {
                differ1 = differ1 + 10 + (-n);
            } else {
                differ1 = differ1 + 10 - n;
            }
        }
        if (differ < differ1) {
            System.out.println("число " + m + "ближе к числу 10.");
        } else if (differ > differ1) {
            System.out.println("число " + n + "ближе к числу 10.");
        } else {
            System.out.println("числа равноудалены от числа 10");
        }
    }
}