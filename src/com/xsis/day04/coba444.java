package com.xsis.day04;

public class coba444 {
    public static void main(String[] args) {
        int [][] matrix = new int[7][7];
        int a=2;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[1].length;j++){
                if(i==0) {
                    System.out.print(a);
                    a+=3;
                }else if (j==5) {
                    System.out.print("x ");
                }else {
                    System.out.print(0+" ");
                }

            }
            System.out.println();
        }

    }
}
