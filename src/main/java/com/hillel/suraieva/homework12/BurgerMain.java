package com.hillel.suraieva.homework12;

public class BurgerMain {
    public static void main(String[] args) {
        Burger regularBurger = new Burger("with sesame","pork","cheddar", "salat", "majo");
        Burger noMajoBurger = new Burger("without sesame", "chicken", "cheddar", "latuc");
        Burger doubleBurger = new Burger("with sesame", "beef", "beef", "cheddar", "salat", "majo");
    }
}
