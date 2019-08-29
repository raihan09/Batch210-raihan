package com.xsis.day01;

public class Gaya {
    public static void main(String[] args) {
        Gaya gaya = new Gaya();
        int f = gaya.getGaya(8, 10);
        System.out.println(" F = " + f);

        Gaya massa = new Gaya();
        int m = massa.getMassa(80, 10);
        System.out.println(" M = " + m);

        Gaya percepatan = new Gaya();
        int a = percepatan.getPercepatan(8, 80);
        System.out.println(" A = " + a);
    }

    public int getGaya(int m, int a) {
        return m * a;
    }

    public int getMassa(int f, int a) {
        return f / a;
    }

    public int getPercepatan(int m, int f) {
        return f / m;
    }
}
