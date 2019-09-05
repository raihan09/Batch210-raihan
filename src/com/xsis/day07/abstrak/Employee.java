package com.xsis.day07.abstrak;
public abstract class Employee {
    private String name;
    private  String ssn;
    private String emailAddress;
    private int yearofBirth;
    private Double salary;

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

    public int getYearofBirth() {
        return yearofBirth;
    }

    public void setYearofBirth(int yearofBirth) {
        this.yearofBirth = yearofBirth;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(String name, String ssn, String emailAddress, int yearofBirth, Double salary) {
        this.name = name;
        this.ssn = ssn;
        this.emailAddress = emailAddress;
        this.yearofBirth = yearofBirth;
        this.salary = salary;
    }

    public abstract Double getTotalGaji();
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", yearofBirth=" + yearofBirth +
                ", salary=" + salary +
                '}';
    }
}
