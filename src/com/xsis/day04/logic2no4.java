package com.xsis.day04;

public class logic2no4 {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 5;
        int n3 = 2;
        int indeks [] = {0,1,2,3,4,5,6};
        for (int j = 0; j < indeks.length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for(int i =0;i<indeks.length;i++){
            if(i%2==0){
                }
            else if(i>=1 && i<=3){
                n3*=2;}
            else if(i>=4&&i<=5){
                n3/=2;}
            else if(i==6) {
                n3 /= 3;
            }System.out.print(n3+" ");
        }
        System.out.println();
    }
    }

