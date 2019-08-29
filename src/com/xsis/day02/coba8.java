package com.xsis.day02;

public class coba8 {
    public static void main(String[] args) {
        int m = 4;
        for (int i = 1; i <= 7; i++) {

            if (i%3== 0) {
                System.out.print("*" + " ");
            }
            else {
                System.out.print(m + " ");
                int n = m * 4;
                m = n;
            }

        }
    }
}
