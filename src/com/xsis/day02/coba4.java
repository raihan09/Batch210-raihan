package com.xsis.day02;

public class coba4 {
    public static void main(String[] args) {
        int m = 1;
        int x = 3;
        for (int i = 1; i <=7; i++) {
            if (i%x==0) {
                System.out.print("*" + " ");
            } else {
                System.out.print(m + " ");
                int n = m + 4;
                m = n;
            }

        }
    }
}


