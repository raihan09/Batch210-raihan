package com.xsis.day02;

public class SkipBilanganGanjil {
    public static void main(String[] args) {
        int[] nums = {0, 3, 4, 5, 7, 2, 6, 9, 8, 7, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {// complete code here
                System.out.println(nums[i] + " is Genap");
            }
        }
    }
}