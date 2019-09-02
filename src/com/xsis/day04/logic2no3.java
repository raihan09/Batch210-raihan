package com.xsis.day04;

public class logic2no3 {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 2;
        int n3 = 2;
        int tabel [] = new int[n1];
        for (int j = 0; j < tabel.length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for(int i =0;i<tabel.length;i++){
            if(i==1){
                n3*=3;}
            else if(i>=1 && i<=3){
                n3*=2;}
            else if(i>=4&&i<=5){
                n3/=2;}
            else if(i==6) {
                n3 /= 3;
            }System.out.print(n3+" ");
        }
        System.out.println();
        int perhitungan = tabel[3] - tabel[2] - tabel[1];
        System.out.println('\n' + "perhitungan = " + tabel[3]+ "+" + tabel[2]+ "+" + tabel[1]+ "= " + perhitungan);
    }
        }

