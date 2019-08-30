package com.xsis.day03;

public class cobacoba {
    public static void main(String[] args) {
        int n = 7;
        int m = 3;
        int o = 2;
        int interval = 2;

        int[][] nums = new int[n][n];
        for (int i = 1; i < 24; i++) {
            for (int j =0;j<nums.length;j++);{
                if (i % 4 == 0) {
                    System.out.print(3 + " ");
                } else {
                    System.out.print(o + " ");
                    o += 3;
                }


            }

        }
    }}

 /*if (i == 0 || i ==nums.length -1|| j== 0 ||j==nums.length-1) {

                    System.out.printf("%d", nums[i][j] = 1 );
                    System.out.print(" ");
                } else {
                    System.out.printf("%s", "  ");
                }*/
