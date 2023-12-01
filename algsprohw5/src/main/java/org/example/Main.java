package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {
       BankAccount bankAccount = new BankAccount(0);
       Thread thread = new MyThread(bankAccount);
       Thread thread1 = new MyThread(bankAccount);
       Thread thread2 = new MyThread(bankAccount);
       Thread thread3 = new MyThread(bankAccount);
       Thread thread4 = new MyThread(bankAccount);

       thread.start();
       thread1.start();
       thread2.start();
       thread3.start();
       thread4.start();

       thread.join();
       thread1.join();
       thread2.join();
       thread3.join();
       thread4.join();

       System.out.println(bankAccount.getSum());
    }
}