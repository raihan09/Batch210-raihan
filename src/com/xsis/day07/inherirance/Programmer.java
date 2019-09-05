package com.xsis.day07.inherirance;

public class Programmer extends Employee implements EmployeeInterface {
    int masakerja;
    double hitungbonus;
    public Programmer(String name, String ssn, String emailAddress, int yearOfBirth, double salary, int masakerja) {
        super(name, ssn, emailAddress, yearOfBirth, salary);
        this.masakerja = masakerja;
    }
    @Override
    public String toString() {
        return super.toString()+"bonus :"+getSalary()+",salary + bonus: "+getHitungbonus();
    }

    @Override
    public double getSalary() {
        double bonus = super.getSalary();
        if (this.masakerja > 10){
            bonus = 5 * super.getSalary();
        }
        else if (this.masakerja < 10) {
            bonus = 2* super.getSalary();
        }
        return bonus;
    }


    public double getHitungbonus() {
        hitungbonus= super.getSalary()+getSalary();
        return hitungbonus;
    }

    public void setHitungbonus(double hitungbonus) {
        this.hitungbonus = hitungbonus;
    }

    @Override
    public String getInfoEmployee() {
        System.out.println("method call from object manager");
        System.out.println(toString());
        return null;
    }
    @Override
    public void potongGaji(double potongan) {
        super.setSalary(super.getSalary()- potongan);
    }


    }





