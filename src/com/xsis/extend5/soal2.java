package com.xsis.extend5;

public class soal2 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(nolGenap(i) + " , ");

        }
    }

    static int nolGenap(int a) {
        if(a%2==0) {
            return 0;
        }
        else return nolGenap(a-1);
    }
}
