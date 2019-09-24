package com.xsis.extend4;

public class no4 {
    public static void main(String[] args) {
        no4 gajiTotal = new no4();
        gajiTotal.gaji(1000,10);


    }
    void gaji (double hourSalary, int hour){
        double gaji1=0;
        if(hour>8) {
            gaji1 = 8 * hourSalary + (hour - 8) * (1.5 * hourSalary);
        }else gaji1 = hour*hourSalary;
            System.out.println("jam kerja : "+hour);
            System.out.println("gaji : "+gaji1);
        }
    }

