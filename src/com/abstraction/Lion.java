package com.abstraction;

public class Lion extends Animal{
    public static void main(String[] args) {
        Lion AfricanLion= new Lion();
        AfricanLion.sound();
        AfricanLion.horn();
        AfricanLion.eat();
    }
    @Override
    public void sound() {
        System.out.println("i roar");

    }

    @Override
    public void eat() {
        System.out.println("eats flesh");

    }
}
