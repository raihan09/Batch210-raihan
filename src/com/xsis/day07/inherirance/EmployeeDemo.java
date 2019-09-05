package com.xsis.day07.inherirance;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 =new Employee("budi","1234","budi@gmail.com",2000,500.00);
        //System.out.println(e1.toString());
        manager e2 = new manager("budi","1234","budi@gmail.com",2000,500.00,0.1);
        e2.setCommission(0.5);
        //System.out.println(e2.toString());

        EmployeeInterface emi = new manager("agung","1234","agung@gmail.com",2002,500.00,0.6);
        emi.potongGaji(100.0);
       emi.getInfoEmployee();

        EmployeeInterface emu1 =new Programmer("joko","98765","joko@gmail.com",1990,800.0,5);
        EmployeeInterface emu2 =new Programmer("tono","98764","tono@gmail.com",1991,500.0,18);
        emu1.getInfoEmployee();
        emu2.getInfoEmployee();
        emu1.potongGaji(0.5);
        emu1.getInfoEmployee();
        emu2.potongGaji(0.4);
        emu2.getInfoEmployee();
    }


}
