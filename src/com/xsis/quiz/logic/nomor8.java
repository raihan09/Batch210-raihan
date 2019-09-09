package com.xsis.quiz.logic;

public class nomor8 {
    public static void main(String[] args) {
        barang b1 = new barang();
        b1.setGula(1000);
        b1.setIndomie(3000);
        b1.setKopi(1000);
        int Total = (b1.getGula()+b1.getIndomie()+b1.getKopi());
        System.out.println("Kopi : "+b1.getGula());
        System.out.println("Indomie : "+b1.getIndomie());
        System.out.println("Gula : "+b1.getKopi());
        System.out.println("TOTAL : "+Total);

    }
}
