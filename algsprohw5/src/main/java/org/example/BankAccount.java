package org.example;

public class BankAccount {
    private int sum;

    public BankAccount(int sum) {
        this.sum = sum;
    }

    public synchronized void deposit(int amount) {
        sum += amount;
    }

    public synchronized void withdraw(int amount) {
        sum -= amount;
    }

    public int getSum() {
        return sum;
    }
}

