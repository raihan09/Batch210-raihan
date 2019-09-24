package com.xsis.extend4;

import java.util.Scanner;

public class no8 {
    public static void main(String[] args) {
        int aaa = 1;
        char aaab[] = new char[10];
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kata : ");
        String aa = input.nextLine();
        System.out.println(aa);
        for (int i = 0; i < aa.length(); i++) {
           if(aa.charAt(i)==' '){
               aaa++;
           }
        }
        System.out.print("Output jumlah kata = "+aaa);
    }
}
