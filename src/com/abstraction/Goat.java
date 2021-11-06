package com.abstraction;

public class Goat extends Animal{
    public static void main(String[] args) {
        Goat AfricanGoat= new Goat();
        AfricanGoat.horn();
        AfricanGoat.sound();
        AfricanGoat.eat();
    }
    @Override
    public void sound() {
        System.out.println("bleat");
    }

    @Override
    public void eat() {
        System.out.println("eats grass");

    }
}
