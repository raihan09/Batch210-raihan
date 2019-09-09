package com.xsis.quiz.logic;

public class nomor2 {
    public static void main(String[] args) {
        int N = 6;

        for (int i = 2; i <= N; i++) {
            int kondisi = 1;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    kondisi = 0;
                }
            }
            if (kondisi == 1) {
                System.out.print(i + " ");
            }
        }
    }
}


