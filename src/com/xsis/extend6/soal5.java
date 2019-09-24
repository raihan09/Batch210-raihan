package com.xsis.extend6;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a distance to meters : ");
        double masukan = input.nextDouble();
        boolean done = true;
        while (done) {
            System.out.println("1. Convert to Kilometers");
            System.out.println("2. Convert to Inches");
            System.out.println("3. Convert to Feet");
            System.out.println("4. Quit Program");
            System.out.print("Enter a choice number : ");
            int pilihan = input.nextInt();
            if (pilihan == 1) {
                System.out.println(masukan + " meters =" + kilometers(1, masukan) + " kilometers");
            } else if (pilihan == 2) {
                System.out.println(masukan + " meters =" + inches(2, masukan) + " inches");
            } else if (pilihan == 3) {
                System.out.println(masukan + " meters =" + feet(3, masukan) + " feet");
            }else if (pilihan==4){
                done=false;
            }
        }input.close();
    }


    static double kilometers(int n, double masukan) {
        return masukan = masukan / 1000;
    }

    static double inches(int n, double masukan) {
        return masukan = masukan * 39.37;
    }

    static double feet(int n, double masukan) {
        return masukan = masukan*3.28084;

    }
}

