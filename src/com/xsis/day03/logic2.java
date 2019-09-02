package com.xsis.day03;

public class logic2 {
    public static void main(String[] args) {
        int n1=7;
        int n=3;
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int tabel [][] ={{a,b,c,d,e,f,g},{1,2,3,4,5,6,7}} ;
        int tabel1 [][] = new int[4][2];
        System.out.println(tabel.length);
        System.out.println(tabel1.length);
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[i].length; j++) {
                System.out.printf("%d",tabel[i][j]);
            }
            System.out.println();
        }

    }
}
