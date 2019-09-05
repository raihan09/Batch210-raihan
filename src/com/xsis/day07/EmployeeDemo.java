package com.xsis.day07;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("xsis", "1234", "xsis.gmail.com", 1998, 500.00);
        e1.setName("xsis");
        e1.setSsn("1234");
        e1.setEmailAddress("xsis@gmail.com");
        e1.setYearOfBirth(1998);
        e1.setSalary(500.00);
        Employee e2 = new Employee("xsis", "1234", "xsis.gmail.com", 1998, 500.00);
        e2.setName("budi");
        e2.setSsn("1235");
        e2.setEmailAddress("agus@gmail.com");
        e2.setYearOfBirth(2000);
        e2.setSalary(600.00);
        Employee e3 = new Employee("xsis", "1234", "xsis.gmail.com", 1998, 500.00);
        e3.setName("Agus");
        e3.setSsn("1236");
        e3.setEmailAddress("agus@gmail.com");
        e3.setYearOfBirth(2001);
        e3.setSalary(550.00);
        Employee e4 = new Employee("xsis", "1234", "xsis.gmail.com", 1998, 500.00);
        e4.setName("rehan");
        e4.setSsn("1237");
        e4.setEmailAddress("rehan@gmail.com");
        e4.setYearOfBirth(2002);
        e4.setSalary(800.00);
        Employee e5 = new Employee("xsis", "1234", "xsis.gmail.com", 1998, 500.00);
        e5.setName("afiq");
        e5.setSsn("1238");
        e5.setEmailAddress("afiq@gmail.com");
        e5.setYearOfBirth(2003);
        e5.setSalary(450.00);

      /*  System.out.println("__FIND ALL__");
        e1.findAll();
        e2.findAll();
        e3.findAll();
        e4.findAll();
        e5.findAll();

        System.out.println("FIND BY SSN");
        e1.findBySsn();
        e2.findBySsn();
        e3.findBySsn();
        e4.findBySsn();
        e5.findBySsn();*/
        Employee[] listEmployee = new Employee[5];
        listEmployee[0] = e1;
        listEmployee[1] = e2;
        listEmployee[2] = e3;
        listEmployee[3] = e4;
        listEmployee[4] = e5;
        findAll(listEmployee);
        findBySsn(listEmployee);

    }

    static void findAll(Employee j[]) {
        System.out.println("FIND ALL");
        for (int i = 0; i < j.length; i++) {
            System.out.print(j[i].getName()+" ");
            System.out.print(j[i].getSsn()+" ");
            System.out.print(j[i].getEmailAddress()+" ");
            System.out.print(j[i].getYearOfBirth()+" ");
            System.out.print(j[i].getSalary()+" ");
            System.out.println();
        }
    }
     static void findBySsn(Employee j[]){
        System.out.println("FIND BY SSN");
        for (int i = 0; i < j.length; i++) {
            if(j[i].getSsn()=="1234"){
                System.out.print(j[i].getName()+" ");
                System.out.print(j[i].getSsn()+" ");
                System.out.print(j[i].getEmailAddress()+" ");
                System.out.print(j[i].getYearOfBirth()+" ");
                System.out.print(j[i].getSalary()+" ");
                System.out.println();
            }
        }
    }
    /*void findbySSn2 (String Ssn){
        if(Ssn =)*/
    }

