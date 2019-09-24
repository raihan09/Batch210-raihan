package com.xsis.extend4;

import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        String simpan[] = new String[100];
        int num[] = new int[100];
        Scanner input = new Scanner(System.in);
        int max = 0;
        boolean done = true;
        //while (done) {
            for (int i = 0; i < simpan.length; i++) {
                simpan[i] = input.nextLine();
                if (simpan[i].equals("q")) {
                    break;
                }
                num[i] = Integer.parseInt(simpan[i]);
                if (num[i] > max) {
                    max = num[i];
                }
            }

        for (int j = 0; j < simpan.length; j++) {
            if (num[j] != 0) {
                if (max == num[j]) {
                    System.out.println(num[j] + " <== largest value");
                } else System.out.println(num[j]);
            }

                }
                   /* for (int j = 0; j < simpan.length; j++) {
                        if (num[j] != 0) {
                            if (max == num[j]) {
                                System.out.println(num[j] + "asdasd");
                            } else System.out.println(num[j]);*/

            }
        }
        /*  if( AA.get(i) >max);*/





