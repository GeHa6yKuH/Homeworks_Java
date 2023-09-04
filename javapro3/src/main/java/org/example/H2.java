package org.example;

public class H2 extends Hero{

    public H2(String name, int age) {
        super(name, age);
    }

    @Override
    void walk() {
        System.out.println("работа не walk, walk это ходить");
    }

    @Override
    void attack() {
        System.out.println("ахахаахахахахахахахахахахахахахах");
    }
}
