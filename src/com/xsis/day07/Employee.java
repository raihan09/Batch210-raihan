package com.xsis.day07;

public class Employee {
   private String name;
    private String ssn;
    private String emailAddress;
    private int yearOfBirth;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Employee (String name,String ssn, String emailAddress, int yearOfBirth, double salary ){
        this.name = name;
        this. ssn = ssn;
        this.emailAddress= emailAddress;
        this.yearOfBirth = yearOfBirth;
        this.salary = salary;
    }

    void findAll (){
        System.out.println("Name: " + name);
        System.out.println("SSN: " + ssn);
        System.out.println("Email Address: " + emailAddress);
        System.out.println("Year Of Birth: " + yearOfBirth);
        System.out.println("Salary: " + salary);
    }
    public void findBySsn() {
        if (ssn=="1234"||ssn=="1235"||ssn=="1236"){
            System.out.println("Name: " + name);
            System.out.println("SSN: " + ssn);
            System.out.println("Email Address: " + emailAddress);
            System.out.println("Year Of Birth: " + yearOfBirth);
            System.out.println("Salary: " + salary);
        }
    }

    }


