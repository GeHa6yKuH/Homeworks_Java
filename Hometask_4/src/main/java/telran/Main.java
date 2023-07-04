package telran;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(5,8));
        System.out.println(minus(9,4));
        System.out.println(multiplicate(50,3));
        System.out.println(divide(55,5));
    }
    static String add(int arg1,int arg2) {
        String res = "Результат равен " + (arg1 + arg2);
        return res;
    }
    static String minus(int arg1,int arg2) {
        String res = "Результат равен " + (arg1 - arg2);
        return res;
    }
    static String multiplicate(int arg1,int arg2) {
        String res = "Результат равен " + (arg1 * arg2);
        return res;
    }
    static String divide(int arg1,int arg2) {
        String res = "Результат равен " + (arg1 / arg2);
        return res;
    }
}