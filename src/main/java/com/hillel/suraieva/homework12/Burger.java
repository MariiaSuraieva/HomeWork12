package com.hillel.suraieva.homework12;

public class Burger {
    String bun, meat, cheese, greens, majo;


    public Burger(String bun, String meat, String cheese, String greens, String majo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.majo = majo;
        System.out.println("------RegularBurger------ "+'\n'+
                "bun = " + bun +'\n'+
                "meat = " + meat +'\n' +
                "cheese = " + cheese +'\n' +
                "greens = " + greens +'\n' +
                "majo = " + majo+'\n');
    }



    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("------DietBurger------ "+'\n'+
                "bun = " + bun +'\n'+
                "meat = " + meat +'\n' +
                "cheese = " + cheese +'\n' +
                "greens = " + greens +'\n');
    }

    public Burger(String bun, String meat1, String meat2, String cheese, String greens, String majo) {
        this.bun = bun;
        this.meat = meat1;
        this.meat = meat2;
        this.cheese = cheese;
        this.greens = greens;
        this.majo = majo;
        System.out.println("------DoubleBurger------ "+'\n'+
                "bun = " + bun +'\n'+
                "meat1 = " + meat1 +'\n' +
                "meat2 = " + meat2 +'\n' +
                "cheese = " + cheese +'\n' +
                "greens = " + greens +'\n' +
                "majo = " + majo);
    }

}
