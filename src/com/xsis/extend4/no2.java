package com.xsis.extend4;

import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean done = true;
        double total = 0;
        double ongkir = 1000.00;
        while (done) {

            System.out.println("Masukkan Barang : (1)yes (2)no");
            int masukan = input.nextInt();
                if(masukan==1) {
                    System.out.println("Masukkan Berat Barang : ");
                    double berat = input.nextDouble();
                    beratPembulatan(berat);


                    System.out.println("Ongkir/kg : " + ongkir);

                    System.out.println("Tujuan Pengiriman? (1)Dalam Kota (2)Satu Pulau (3)Beda Pulau");

                    int pilihan = input.nextInt();
                    if (pilihan == 1) {
                        total += dalamKota(beratPembulatan(berat), ongkir);
                    } else if (pilihan == 2) {
                        total += satuPulau(beratPembulatan(berat), ongkir);
                    } else if (pilihan == 3) {
                        total += bedapulau(beratPembulatan(berat), ongkir);
                    }

                    System.out.println("Member ? (1)Yes  (2)No");
                    double member = input.nextDouble();
                    if (member == 1) {
                        System.out.println("Total Biaya : " + total);
                        System.out.println("Cashback : " + member(total));
                    } else {
                        System.out.println("Total Biaya : " + total);
                    }
                }
             else if (masukan==2) {
                done = false;
            }

        }



        System.out.println("Bayar Tunai : ");
        double bayar = input.nextDouble();
        System.out.println("Kembalian : " + pembayara(total, bayar));


    }
    static void harga(double berat,double ongkir ){

    }
    static double beratPembulatan(double berat) {
        if (berat - Math.floor(berat) >= 0.4) {
            berat = Math.ceil(berat);
        } else {
            berat = Math.floor(berat);
        }return berat;
    }
    static  double dalamKota(double berat, double biaya){
        return 2000+(berat*biaya);
    }
    static  double satuPulau(double berat, double biaya) {
        return 10000 + (berat * biaya);
    }
    static  double bedapulau(double berat, double biaya) {
        return 50000 + (berat * biaya);
    }
    static double member(double ongkir){
        double cashback= 0;
        if (ongkir>200000.00){
            cashback+=15000;
        }
        return cashback;
    }
    static double pembayara(double harga, double bayar){
        return bayar-harga;

    }

}
