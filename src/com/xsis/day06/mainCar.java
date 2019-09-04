package com.xsis.day06;

public class mainCar {
    public static void main(String[] args) {
        Car mobil = new Car();
        mobil.Start();
        mobil.print();
        mobil.goFaster(3,100,70,50);
        mobil.print();
        mobil.Changegear(4);
        mobil.print();
        mobil.goSlower(2,50,30,20);
        mobil.print();

    }
    }

