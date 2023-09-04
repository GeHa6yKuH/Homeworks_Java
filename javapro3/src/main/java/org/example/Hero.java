package org.example;

public abstract class Hero {
    String name;
    int age;

    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void walk();
    abstract void attack();

    void breath() {
        System.out.println("uhuuu I breathe");
    }
}
