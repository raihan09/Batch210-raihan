package com.xsis.day04;

public class logic2no2 {
    public static void main(String[] args) {
        int n =7;
        int n2 = 3;
        int tabel[] = new int[n];
        for (int j = 0; j < tabel.length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < tabel.length-1; i++) {
            tabel[i]= (int)Math.pow(n2,i);
            if((i+1)%3==0){
                tabel[i] = -tabel[i];
                System.out.print(tabel[i]+" ");
        }
            else {System.out.print(tabel[i]+" ");
            }
        }
        double perhitungan= tabel[0] * tabel[1]* tabel [2];
        System.out.println( '\n'+"perhitungan = "+ tabel [0]+"*"+tabel [1]+"*"+tabel [2]+   "= "+perhitungan);
    }
}


