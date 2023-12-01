package org.example;

public class MyThread extends Thread {

    private BankAccount bankAccount;

    public MyThread(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public synchronized void run() {
        bankAccount.deposit(5000);
        bankAccount.withdraw(4000);
    }
}
