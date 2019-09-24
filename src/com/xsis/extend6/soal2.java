package com.xsis.extend6;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String string = input.nextLine();
        System.out.println("Enter a Character :");
        String karakter =input.nextLine();
        int jumlah =0;
        for (int i = 0; i <string.length() ; i++) {
            if(karakter.charAt(0)==string.charAt(i)){
                jumlah++;
            }
        }
        input.close();
        System.out.println("The Character "+karakter.charAt(0)+" appears in "+string.toUpperCase()+" "+jumlah+" times");



    }
}
