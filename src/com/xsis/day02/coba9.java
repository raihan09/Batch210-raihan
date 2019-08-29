package com.xsis.day02;

public class coba9 {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        for (int i = 1; i <= n; i++) {

            if (i%4==0) {
                System.out.print("xxx" + " ");
            }else {System.out.print(m + " ");}
            int h = m*3;
            m = h;

        }

    }
}
