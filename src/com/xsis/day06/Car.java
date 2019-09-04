package com.xsis.day06;

public class Car {
    String licensePlate;
    int speed ;
    int rpm ;
    int gear ;
    String direction ;
    String fuelLevel;
    int engineTemperature;

    void Start(){
        System.out.println("___Engine Start___");
    licensePlate = "B1234";
    speed = 0;
    rpm = 0;
    gear = 0;
    direction = "north";
    fuelLevel = "full";
    engineTemperature= 0;}

    void Changegear(int gear) {
        System.out.println("___Change Gear___");
        this.gear = gear;
    }

    void goFaster(int gear, int speed, int rpm, int engineTemperature) {
        System.out.println("___GoFaster___");
        this.gear = gear;
        this.speed = speed;
        this.rpm = rpm;
        this.engineTemperature = engineTemperature;
    }
    void goSlower(int gear, int speed, int rpm, int engineTemperature){
        System.out.println("___GO SLOWER___");
        this.gear = gear;
        this.speed = speed;
        this.rpm = rpm;
        this.engineTemperature = engineTemperature;
    }

    void print() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Speed: " + speed);
        System.out.println("RPM: " + rpm);
        System.out.println("Gear: " + gear);
        System.out.println("Direction: " + direction);
        System.out.println("Fuel Level: " + fuelLevel);
        System.out.println("Engine Temperature: " + engineTemperature);

    }

    }

