package com.xsis.quiz.logic;

public class nomor4 {
    public static void main(String[] args) {
        double[] deret = {2, 5, 3.5, 6.5, 10};
        double max = deret[0];
        for (int i = 0; i < deret.length; i++) {
            if (deret[i] > max) {
                max = deret[i];
            }
            System.out.print(deret[i]+" ");

        }
        System.out.print('\n'+"largest Number : ");
        System.out.println(max);
    }
}
