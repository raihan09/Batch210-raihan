package com.xsis.extend6;

import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kue yang kamu makan?");
        int kue = input.nextInt();
        int total=40;
        int porsi=kue/4;
        int kalori =300*porsi;
        System.out.println("kamu makan "+kalori+" kalori");
        input.close();


    }
}
