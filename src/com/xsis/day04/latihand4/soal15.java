package com.xsis.day04.latihand4;

public class soal15 {

    public void soal1() {
        int deret = 1;
        int interval = 2;
        for (int i = 0; i <= 7; i++) {
            System.out.print(deret + " ");
            deret = deret + 4;
            interval += 1;
            if (interval % 2 == 0) {
                System.out.print("*");
            }
        }
    }

    void soal2() {
        int m=7;
        for (int i = 1; i <= 7; i++) {
            System.out.print(m + " ");
            int n = m + 2;
            m = n;

        }
    }

    void soal3() {
        int m = 1;
        for (int i = 1; i <= 7; i++) {
            int n = m + 3;
            System.out.print(m + " ");
            m = n;
        }
    }

    void soal4() {
        int m = 1;
        int x = 3;
        for (int i = 1; i <= 7; i++) {
            if (i % x == 0) {
                System.out.print("*" + " ");
            } else {
                System.out.print(m + " ");
                int n = m + 4;
                m = n;
            }
        }
    }
    void soal5 () {
        int m = 1;
        int n = 7;

        for (int i = 1; i <= n; i++) {

            if (i%3 == 0) {
                System.out.print("*" + " ");
            }
            else {System.out.print(m + " ");
            }
            int h = m + 4;
            m = h;

        }

        }
    }


