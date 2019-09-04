package com.xsis.day06;

public class Employee {
    private String name;
    private  String ssn;
    private String emailAddress;
    private int yearofBirth;
    private static int vacationDay = 10;

    public String getName() {
        return name;
    }

    public String getSsn() {
        return ssn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getYearofBirth() {
        return yearofBirth;
    }

    public void setName(String name) {
        if (name != null && name.length() > 0)
        this.name = name;
    }

    public void setEmailAddress(String emailAddress) {
        if(emailAddress != "[@.]")
        this.emailAddress = emailAddress;
    }

    public void setYearofBirth(int yearofBirth) {
        this.yearofBirth = yearofBirth;
    }

    public Employee(String name, String emailAddress){
        this.name =name;
        this.emailAddress = emailAddress;
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