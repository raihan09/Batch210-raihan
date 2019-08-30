package com.xsis.day03;

public class Array {
    public static void main(String[] args) {
        int[][] nums = new int[5][5];
        /*for (int i =0; i< nums.length;i++){
            for (int j = 0); j < nums[1].length ; I++)
        }*/
        Array arr = new Array();
        //arr.setDiagonalRight(nums);//
        arr.setDiagonalLeft(nums);
        //arr.setBox(nums);//
    }

    void setDiagonalLeft(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i == j) {
                    System.out.printf("%d", nums[i][j] = 9);
                } else {
                    System.out.printf("%s", "*");
                }
            }
            System.out.println();
        }
    }

    void setDiagonalRight(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (i + j == 4) {
                    System.out.printf("%d", nums[i][j] = 9);
                } else {
                    System.out.printf("%s", "*");
                }
            }
            System.out.println();
        }
    }

    void setBox(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.printf("%d", nums[i][j] = 9);
            }
            System.out.println();
        }
    }


}
   /* public void setLoop90{

    }
}*/

