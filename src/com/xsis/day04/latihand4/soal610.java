package com.xsis.day04.latihand4;

public class soal610 {

    void soal6() {
        int m = 1;
        int n = 7;

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0) {
                System.out.print("*" + " ");
            } else {
                System.out.print(m + " ");
            }
            int h = m + 4;
            m = h;

        }
    }

    void soal7() {
        int m = 2;
        int n = 7;
        for (int i = 1; i <= n; i++) {
            System.out.print(m + " ");
            int h = m * 2;
            m = h;
        }
    }

    void soal8() {
        int m = 3;
        int n = 7;
        for (int i = 1; i <= n; i++) {
            System.out.print(m + " ");
            int h = m * 3;
            m = h;

        }
    }

    void soal9() {
        int m = 4;
        for (int i = 1; i <= 7; i++) {

            if (i % 3 == 0) {
                System.out.print("*" + " ");
            } else {
                System.out.print(m + " ");
                int n = m * 4;
                m = n;
            }
        }
    }
        void soal10 (){
            int m = 3;
            int n = 7;
            for (int i = 1; i <= n; i++) {

                if (i % 4 == 0) {
                    System.out.print("xxx" + " ");
                } else {
                    System.out.print(m + " ");
                }
                int h = m * 3;
                m = h;

            }
        }
    }

