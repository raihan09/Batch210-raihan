package com.xsis.day02;

public class coba5 {
    public static void main(String[] args) {
        int m = 1;
        int n = 7;

        for (int i = 1; i <= n; i++) {

            if (i%3 == 0) {
                System.out.print("*" + " ");
            }
            else {System.out.print(m + " ");
                }
            int h = m + 4;
            m = h;

        }
    }}


