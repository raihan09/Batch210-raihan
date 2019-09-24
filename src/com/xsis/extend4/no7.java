package com.xsis.extend4;

import java.util.Scanner;

public class no7 {
    public static void main(String[] args) {
        int total=0;
        Scanner input =new Scanner(System.in);
        System.out.println("name #1?");
        String aa = input.nextLine();
        System.out.println("name #2?");
        String bb = input.nextLine();
        if(aa.length()>bb.length()) {
            System.out.print(Character.toUpperCase(aa.charAt(0)));
            for (int i = 1; i < aa.length(); i++) {
                char awal = Character.toUpperCase(aa.charAt(0));
                char aaa = aa.charAt(i);
                System.out.print(aaa) ;
            }
        }
        else if (bb.length()>aa.length()) {
            System.out.print(Character.toUpperCase(bb.charAt(0)));
            for (int i = 0; i < bb.length(); i++) {
                char awal = Character.toUpperCase(bb.charAt(0));
                char bbb = bb.charAt(i);
                System.out.print(bbb);
            }
        }
        System.out.println( "'s name is longest");
        }
    }
