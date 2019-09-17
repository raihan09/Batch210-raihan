package com.xsis.ft1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class DaftarMenu {
    public static void main(String[] args) {

        int Burger = 2500;
        int Pizza = 6000;
        int Donut = 10000;
        int Lasagna = 35000;
        int Spaghetti = 20000;
        int BigRamen = 75000;
        int LemonTea = 15000;
        int IceTea = 10000;
        int OrangeJuice = 15000;
        int HotCoffe = 20000;
        int EsKopiSusu = 18000;
        DaftarMenu A = new DaftarMenu();
        //A.nomor1("Safii", 100000);
//A.nomor2(100000,18000);
//A.nomor3(20);
//A.nomor4(7000);
//A.nomor5();
        char C [] = {'G','G','G'};
        char D [] ={'K','K','B'};
 A.nomor6(2,C,D);
       // A.nomor7("NTNTNTNNTT");
        //A.nomor7("TNTNTNTNTNTTN");
    }

    void nomor1(String x, double y) {
        double diskon = 0;
        if (y >= 30000) {
            diskon = diskon + (y * 0.5);
            for (int i = 0; i < x.length(); i++) {
                if (x.charAt(i) == 'a') {
                    double diskon1 = (y * 0.5) / 2;
                    if (x.charAt(i) == 'i') {
                        double diskon2 = (y * 0.5) / 2;
                        diskon = diskon1 + diskon2;
                    }
                    if (diskon < (y * 0.5)) {
                        diskon = 20000;
                    }
                }
                if (diskon > 30000) {
                    diskon = 3000;
                }
            }
            double ongkir = (y - diskon) * 0.1;
            double hargatotal = (y - diskon + ongkir);


            System.out.println("harga yang harus dibayar = " + hargatotal);
        }
    }

    void nomor2(int saldoOpo, int TotalHarga){
        double diskon=0;
        int EsKopi = 18000;
        //double totalharga = n*EsKopi;
        if(TotalHarga>40000) {
             diskon = TotalHarga * 0.5;
            if (diskon > 100000) {
                diskon = 100000;
            }
        }
        double cashback = (TotalHarga-diskon)*0.1;
        if (cashback>30000);{
        cashback=30000;}
        double total = TotalHarga-diskon;
        double saldoakhir = saldoOpo-cashback;
        int n = TotalHarga/EsKopi;
        if(total>diskon){
            System.out.println("total melebihi diskon" +"; Saldo Akhir = "+saldoakhir);
        }else System.out.println("Jumlah cup = "+n + "; Saldo Akhir"+saldoakhir);
    }

    void nomor3(double nCupcake){
        int cupcake =15;
        double terigu =125;
        double gulapasir = 100;
        double susu = 100;

        double z = nCupcake/15;
        System.out.println(z);
        int terigu1 =(int)(terigu*z);
        int gulapasir1 =(int)(gulapasir*z);
        int susu1 = (int)(susu*z);

//        int terigu1 =(int)terigu*nCupcake;
//        int gulapasir1 =(int)gulapasir*nCupcake;
//        int susu1 =(int) susu*nCupcake;
        System.out.println("Terigu = "+terigu1);
        System.out.println("GulaPasir = "+gulapasir1);
        System.out.println("Susu = "+susu1);

    }
    void nomor4(int uang){
        int esloli=1000;
        int se = uang/esloli;
        int e= se/5;
        int total = e+se;
        System.out.println("Junlah maksimal es loli = "+total);

    }
    void nomor5(){

        int to_te1=2000;
        int te1_te2=500;
        int te2_te3=1500;
        int te3_te4=2500;
        int toko =0;
        int tempat1= to_te1+toko;
        int tempat2= to_te1+te1_te2;
        int tempat3= to_te1+te1_te2+te2_te3;
        int tempat4= to_te1+te1_te2+te2_te3+te3_te4;
        int rute = toko+tempat1+tempat2;
        int bensin = rute/2500;
        System.out.println(bensin + " liter");



    }
    void nomor6(int jarakawal,char A [],char B[]){
        int a= 0;
        int b =jarakawal;
        int c=0;
        String Pemenang =null;
        for (int i =0;i<A.length;i++) {
            if (A[i] == 'G' && B[i] == 'K') {
                a = +2;
                b = -1;
                Pemenang = "A";
            } else if (A[i] == 'G' && B[i] == 'B') {
                a = -1;
                b = +2;
                Pemenang = "B";
            } else if (A[i] == 'B' && B[i] == 'G') {
                a = +2;
                b = -1;
                Pemenang = "A";
            } else if (A[i] == 'B' && B[i] == 'K') {
                a = -1;
                b = -+2;
                Pemenang = "B";
            } else if (A[i] == 'K' && B[i] == 'B') {
                a = +2;
                b = -1;
                Pemenang = "A";
            } else if (A[i] == 'K' && B[i] == 'G') {
                a = -1;
                b = +2;
                Pemenang = "B";
            }
            if (a==b) {
                c+=1;
                break;
            }
        }
        if (c==1){
            System.out.println("PEMENANG ADALAH : "+Pemenang);
        }
        else System.out.println("PEMENANG ADALAH : DRAW");

    }

    void nomor7(String urutan){
        double Gunung =0;
        double Lembah =0;
        char y='l';
        for(int i=0;i<urutan.length();i++){
            char x = urutan.charAt(i);
            if( x=='N'&& y=='1'){
            }
            else if( x=='T'&& y=='1') {
            }
            else if( x=='N'&&y=='N'){
                Gunung+=0.5;
                Lembah+=0.5;
            }else if( x=='T'&&y=='N') {
                Gunung+=1;

            }else if( x=='T'&&y=='T') {
                Lembah+=0.5;
                Gunung+=0.5;
            }else if( x=='N'&&y=='T'){
                Lembah+=1;
            }
            y=x;
}
        System.out.println("Jumlag Gunung = "+Gunung);
        System.out.println("Jumlah Lembah = "+Lembah);
    }}

