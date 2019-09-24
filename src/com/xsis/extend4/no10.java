package com.xsis.extend4;

import java.util.Scanner;

public class no10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kata : ");
        String masukbos = input.nextLine().toUpperCase();
        hitung(masukbos);

    }

    static void hitung(String hitung) {
        int a = 0;
        int i = 0;
        int u = 0;
        int e = 0;
        int o = 0;
        for (int j = 0; j < hitung.length(); j++) {
            if (hitung.charAt(j) == 'A') {
                a++;
            } else if (hitung.charAt(j) == 'I') {
                i++;
            }
            if (hitung.charAt(j) == 'E') {
                e++;
            }
            if (hitung.charAt(j) == 'U') {
                u++;
            }
            if (hitung.charAt(j) == 'O') {
                o++;
            }
        }
        System.out.println("A = " + a);
        System.out.println("I = " + i);
        System.out.println("U = " + u);
        System.out.println("E = " + e);
        System.out.println("O = " + o);
    }
}
