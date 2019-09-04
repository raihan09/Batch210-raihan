package com.xsis.day06;

public class EmplyeeClient {
    public static void main(String[] args) {
        Employee.vacationDay =15;
        Employee s1 = new Employee("xsis","45");
        //s1.name="xsis";
        //s1.ssn = "45-45-45";
        s1.emailAddress="xsis@xsis.com";
        s1.yearofBirth = 10;
//       System.out.println("name : " +s1.name);
//        System.out.println("ssn : "+s1.ssn);
//printemployee(s1);
        Employee s2 = new Employee("aca","1001","aca.xsis.cmo");
        //s2.name="aca";
        //s2.ssn = "1001";
        //s2.emailAddress="aca@xsis.com";
        s2.yearofBirth = 20;
       // System.out.println("ssn : "+s2.ssn);
        //System.out.println("name : " +s2.name);
//s2.print();
//printemployee(s2);
Employee s4 = s1;

    }
    static void printemployee(Employee e){
        System.out.println("name : " +e.name);
        System.out.println("ssn : "+e.ssn);
    }


}
