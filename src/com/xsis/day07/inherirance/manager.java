package com.xsis.day07.inherirance;

public class manager extends Employee implements EmployeeInterface {
    double commission;
    public manager(String name, String ssn, String emailAddress, int yearOfBirth, double salary) {
        super(name, ssn, emailAddress, yearOfBirth, salary);
    }
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public manager(String name, String ssn, String emailAddress, int yearOfBirth, double salary, double commission) {
        super(name, ssn, emailAddress, yearOfBirth, salary);
        this.commission = commission;
    }

    @Override
    public String getInfoEmployee() {
        System.out.println("method call from object manager");
        System.out.println(toString());
        return null;
    }
    @Override
    public double getSalary() {
        Double totalCommision = this.commission * super.getSalary();
        return super.getSalary() + totalCommision;
    }

    @Override
    public void potongGaji(double potongan) {
        super.setSalary(super.getSalary()- potongan);
    }

    @Override
    public  String toString(){
        return super.toString()+"commission :"+commission+",salary + commision: "+this.getSalary();
    }

}
