package org.example;

public class H1 extends Hero implements Flyable{

    public H1(String name, int age) {
        super(name, age);
    }

    @Override
    void walk() {
        System.out.println("H1 walk");
    }

    @Override
    void attack() {
        System.out.println("H1 attack");
    }

    @Override
    public void fly() {
        System.out.println("I fly");
    }

}
