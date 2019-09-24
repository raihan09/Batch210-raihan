package com.xsis.extend4;

import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String aa =input.nextLine();
        char []a = new char[aa.length()];
        for (int i = 0; i <aa.length() ; i++) {
            a[i] =aa.charAt(i);
        }
        for (int i = aa.length()-1; i >=0 ; i--) {
            System.out.print(a[i]);
        }
    }

}
