package com.xsis.day07.abstrak;

public class Staff extends Employee{
    public Staff(String name, String ssn, String emailAddress, int yearofBirth, Double salary) {
        super(name, ssn, emailAddress, yearofBirth, salary);
    }

    @Override
    public Double getTotalGaji() {
        return super.getSalary();
    }
}



