package com.xsis.day03;

public class logic2 {
    public static void main(String[] args) {
        int n1=7;
        int n2=3;
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        int e = 4;
        int f = 5;
        int g = 6;
        int[][] tabel ={{a,b,c,d,e,f,g},{n2^a,n2^b,n2^c,n2^d,n2^e,n2^f,n2^g}};
        for (int i = 0; i < tabel.length; i++) {
            for (int j = 0; j < tabel[i].length; j++) {
                System.out.printf("%d", tabel[i][j] );
            }
            System.out.println();
        }

    }
}
