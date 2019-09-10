package com.xsis.quiz.teori;

public class tempat_tinggalDemo {
    public static void main(String[] args) {
        System.out.println("Tempat tinggal 1");
        tempat_tinggal t1 = new tempat_tinggal(4,2);
        System.out.println(t1.toString());
        System.out.println("Tempat tinggal 2");
        tempat_tinggal t2 = new tempat_tinggal(4,2,2);
        System.out.println(t2.toString());
        System.out.println("Rumah");
        rumah r1 = new rumah(2,3,1,4);
        System.out.println(r1.toString());
        System.out.println("Hotel");
        hotel h1 = new hotel(1,2,3,1,2);
        System.out.println(h1.toString());




    }
}
