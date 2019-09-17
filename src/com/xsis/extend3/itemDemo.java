package com.xsis.extend3;

import com.xsis.day03.Array;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class itemDemo {
    public static void main(String[] args) {
        item i1 = new item("06-478", "Shirt-Sport", 'M', 100, 350000.00, "2019-08-17");
        item i2 = new item("06-420", "Shirt-sport-abu", 'M', 120, 350000.00, "2019-08-17");
        item i3 = new item("01-100", " Baju Anak Sport", 'M', 150, 150000.00, "2019-03-15");
        item i4 = new item("02-200", "Baju Wanite", 'M', 160, 250000, "2019-09-15");
        item[] daftar = {i1, i2, i3, i4};
        // discount(daftar);

        Scanner input = new Scanner(System.in);
        System.out.println("Member? (Y/N)");
        String aa = input.nextLine();
        if (aa.equals("y")) {
            discountMember(daftar);
        } else if (aa.equals("n")) {
            discount(daftar);
        }
        boolean done = true;
        while (done) {
            System.out.println("Masukkan Item Code : ");
            String member = input.nextLine();
            item pilihanBarang = getBarang(daftar, member);
            showBarang(pilihanBarang);
            System.out.println("masukkan Jumlah barang : ");
            int jumlah = input.nextInt();
            System.out.println("Total harga Barang : " + totalBarang(jumlah, pilihanBarang));
            stock(pilihanBarang,jumlah);
            System.out.println("Selesai Transaksi?(Y/N)");
           String transaksi = input.nextLine();
            if(transaksi.equals("y")) {
                showBarang(pilihanBarang);
                done=false;

            }

        }
    }


    static void discount(item[] daftar) {
        for (int i = 0; i < daftar.length; i++) {
            LocalDate tglMasukk = LocalDate.parse(daftar[i].getTglMasuk());
            long jumlahHari = ChronoUnit.DAYS.between(tglMasukk, LocalDate.now());
            if (jumlahHari >= 30 && jumlahHari < 60) {
                daftar[i].setDiskon(0.4);
            } else if (jumlahHari >= 60) {
                daftar[i].setDiskon(0.6);
            }
        }
    }
    static void discountMember(item[] daftar) {
        for (int i = 0; i < daftar.length; i++) {
            LocalDate tglMasukk = LocalDate.parse(daftar[i].getTglMasuk());
            long jumlahHari = ChronoUnit.DAYS.between(tglMasukk,LocalDate.now());
            if (jumlahHari >= 30 && jumlahHari < 60) {
                daftar[i].setDiskon(0.5);
            } else if (jumlahHari >= 60) {
                daftar[i].setDiskon(0.7);
            } else if (jumlahHari < 30) {
                daftar[i].setDiskon(0.1);
            }
        }
    }

    static item getBarang(item[] daftar, String code) {
     item barang =null;
        for (int i = 0; i < daftar.length; i++) {
            if (daftar[i].getItemCode().equals(code)) {
               barang = daftar[i];
            }
        }
        return barang; }

    static void cashRegister(item daftar){
        daftar.totalHarga+=daftar.getHargaPrice();
        System.out.println("Total harga : "+daftar.totalHarga);
        double diskon = daftar.getDiskon()*daftar.totalHarga;
        double hargaDiskon = daftar.totalHarga-diskon;
        System.out.println("Diskon : "+diskon);
        System.out.println("harga Seteleh Diskon : "+hargaDiskon);
        double ppn = 0.5*hargaDiskon;
        System.out.println("PPN : "+ppn);
        double total = hargaDiskon+ppn;
        System.out.println("Total : "+total);


    }
    static void showBarang(item pilihan){
        System.out.println("Kode barang  :"+pilihan.getItemCode());
        System.out.println("Nama barang  :"+pilihan.getItemName());
        System.out.println("Ukuran       :"+pilihan.getSize());
        System.out.println("Harga Barang :"+pilihan.getHargaPrice());
        System.out.println("Stok Gudang  :"+pilihan.getQty());
    }
    static double totalBarang(double jumlah, item jumlah2){
        double a= jumlah* jumlah2.getHargaPrice();
        return a+jumlah* jumlah2.getHargaPrice() ;
    }
    static void stock(item jumlah, int a){
        jumlah.setQty(jumlah.getQty()-a);
    }
    }
