package com.xsis.day05;

import java.util.Scanner;

public class logic2no6 {
    public static void main(String[] args) {
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukan: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        String x = keyboard.nextLine();
        System.out.print("keluaran :");
        int b=0;
        for (int j = 0; j < x.length(); j++) {
            if (Character.isUpperCase(x.charAt(j))){
                b++;
            }


        }System.out.print(b);
    }
}
