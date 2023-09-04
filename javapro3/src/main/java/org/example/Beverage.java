package org.example;

public abstract class Beverage {
    abstract void consume();
}

class Tea extends Beverage {

    @Override
    void consume() {

    }
}

class Coffee extends Beverage {

    @Override
    void consume() {

    }
}

class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.consume();

        Beverage cof = new Coffee();
        cof.consume();
    }
}