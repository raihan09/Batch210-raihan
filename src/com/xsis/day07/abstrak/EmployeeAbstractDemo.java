package com.xsis.day07.abstrak;

public class EmployeeAbstractDemo {
    public static void main(String[] args) {
        Staff st = new Staff("budi","123","budi@gmail.com",1996,500.0);
        System.out.println(st.getTotalGaji());
    }
}
