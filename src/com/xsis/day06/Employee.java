package com.xsis.day06;

public class Employee {
    String name;
    final String ssn;
    String emailAddress;
    int yearofBirth;
    static int vacationDay = 10;

    public Employee(String name, String ssn){
        this.name =name;
        this.ssn = ssn;

    }
    public Employee(String name, String ssn, String emailAddress) {
        this.name = name;
        this.ssn = ssn;
        this.emailAddress= emailAddress;


    }
    void print() {
        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Year Of Birth: " + yearofBirth);
        System.out.println("Vacation Days: " + vacationDay);
    }
}