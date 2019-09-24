package com.xsis.extend4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Tanggal Peminjaman(yyyy-mm-dd) :");
        String pinjam = input.nextLine();
        System.out.println("Masukkan Tanggal Batas Peminjaman(yyyy-mm-dd) :");
        String batas = input.nextLine();
        System.out.println("Masukkan Tanggal Pengembalian(yyyy-mm-dd) :");
        String kembali = input.nextLine();
        soal01(pinjam,batas,kembali);

    }

    static void soal01(String startDate, String batasDate, String pengembalianDate){
        LocalDate startdate = LocalDate.parse(startDate);
        LocalDate batasdate = LocalDate.parse(batasDate);
        LocalDate pengembaliandate = LocalDate.parse(pengembalianDate);
         long lamaPeminjaman = ChronoUnit.DAYS.between(startdate, batasdate);
        long lamaPengembalian = ChronoUnit.DAYS.between(startdate, pengembaliandate);
         long harga = lamaPeminjaman*2500;
        long denda = 0;
        long waktuTelat = 0;
        if(lamaPeminjaman<lamaPengembalian){
            waktuTelat =lamaPengembalian-lamaPeminjaman;
             denda = (waktuTelat)*550;
         }
         double total = harga+denda;
        System.out.println("Tanggal Peminjaman : "+startdate);
        System.out.println("Batas Pengembalian : "+batasdate);
        System.out.println("Tanggal Pengembalian : "+pengembaliandate);
        System.out.println("Waktu terlambat : "+waktuTelat);
        System.out.println("Denda : "+denda);
        System.out.println("Total Harga : "+total);
    }


}
