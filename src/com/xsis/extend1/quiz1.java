package com.xsis.extend1;

import java.util.Scanner;

public class quiz1 {
    public static void main(String[] args) {
        quiz1 jawab = new quiz1();
       //jawab.soal1(12.5,10);

//

        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukan harga mobil : " );
        double harga = inputUser.nextDouble();

        System.out.print("Masukan bunga : ");
        double bunga = inputUser.nextDouble();

        System.out.print("Masukan Tenor : ");
        int tenor = inputUser.nextInt();

        System.out.print("Masukan biaya admin : ");
        double biayaAdmin = inputUser.nextDouble();

        System.out.println("masukan premi : ");
        double premi = inputUser.nextDouble();

        jawab.soal2(harga,bunga,tenor,biayaAdmin,premi);
    }

    void soal1(double deposit, int durasi){

        for( int i=0; i<durasi;i++) {
            double bunga = 0.05*deposit;
            deposit = deposit+bunga;
        }
        System.out.println("Total Uang : "+deposit+" Juta");
    }
    void soal2(double harga,double bunga, int tenor, double biayaAdmin,double premi){

        double dp = 0.2* harga;
        System.out.println("DP = "+dp);
        double plafon = harga-dp;
        System.out.println("Plafon Kredit = "+plafon);
        double totalBunga= plafon*((bunga*tenor)/100);
        double angsuran = ((plafon+(totalBunga))/(tenor*12));
        double premiAsuransi = ((premi/100)*harga)/12;
        double angsuranbulan1 = dp+angsuran+premiAsuransi+biayaAdmin;

        System.out.println("Total Besar Bunga= "+totalBunga+" Juta");
        System.out.println("Angsuran Bulanan : "+angsuran+" Juta");
        System.out.println("Angsuran Bulan Pertama : "+(int)angsuranbulan1+" Juta");



    }
}
