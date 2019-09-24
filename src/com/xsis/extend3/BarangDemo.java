/*
package com.xsis.Barang;


import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
import java.util.Scanner;

public class BarangDemo {
    public static void main(String[] args) {
        BarangBelanjaan brg1=new BarangBelanjaan("06-478","Shirt Sport",'M',100,350000,LocalDate.of(2019,8,17));
        BarangBelanjaan brg2=new BarangBelanjaan("06-420","Shirt Sport Abu",'M',120,350000,LocalDate.of(2019,8,17));
        BarangBelanjaan brg3=new BarangBelanjaan("01-100","Baju Anak Sport",'M',150,150000,LocalDate.of(2019,3,15));
        BarangBelanjaan brg4=new BarangBelanjaan("02-200","Baju Wanita",'M',160,250000,LocalDate.of(2019,9,15));
        BarangBelanjaan[] stockBarang ={brg1,brg2,brg3,brg4};
        Cashier temp=new Cashier(0,0);
        BarangBelanjaan[] CartBarang=new BarangBelanjaan[10];//menampung object barang dari kelas barang belanjaan yang dibeli
        Cashier[] CartBelanjaan = new Cashier[10];//menampung qty dan total harga dari barang yang dibeli
        BarangDemo process=new BarangDemo();
        int cartcount=0;
        Scanner scan=new Scanner(System.in);
        String check="y";
        System.out.println("Apakah anda member [m=member n=non member]");
        String member=scan.next();
        do {
            BarangBelanjaan Cart=process.findBarang(scan,stockBarang);
            process.DiskonyangDiDapat(Cart,member);
            process.showBarang(Cart);
            System.out.println("Masukan jumlah barang ");
            int jumlahBarang=scan.nextInt();
            double totalHarga = process.totalHargaItem(Cart,jumlahBarang);
            temp.setQty(jumlahBarang); //temp adalah objek dari class Cashier yang dibuat untuk menampung Qty&total harga dari barang yang dibeli
            temp.setTotalHarga(totalHarga);
            CartBelanjaan[cartcount]=new Cashier(temp.getQty(),temp.getTotalHarga());
            CartBarang[cartcount]=Cart;
            cartcount++;
            System.out.println("Apakah anda ingin melanjutkan pembelian [Y] Ya /[T] Tidak");
            check=scan.next();
        }while(check.equalsIgnoreCase("y"));
        process.showBelanjaan(CartBarang,CartBelanjaan,cartcount);
        System.out.println("Total harga "+process.totalHarga(CartBelanjaan,cartcount));
        System.out.println("Total diskon "+process.totalDiskon(CartBelanjaan,CartBarang,cartcount));

    }
    void showBelanjaan(BarangBelanjaan[] barang,Cashier[] cart,int cartcount){
        System.out.println("Item Code \t Nama Barang \t Harga/Pcs \t Qty Beli \t Total Harga \t Diskon");
        for (int i = 0; i <cartcount ; i++) {
            System.out.println(barang[i].getItemCode()+" \t "+barang[i].getItemName()+" \t "+barang[i].getHarga()
            +" \t "+cart[i].getQty()+" \t "+cart[i].getTotalHarga()+" \t "+besarDiskon(barang[i],cart[i].getQty()));
        }
    }

    public double totalHarga(Cashier[] Cart,int CartCount){
       double total=0;
        for (int i = 0; i <CartCount ; i++) {
            total=Cart[i].getTotalHarga()+total;
        }
        return total;
    }
    public double totalDiskon(Cashier[] Cart,BarangBelanjaan[] Barang,int CartCount){
        double total=0;
        for (int i = 0; i <CartCount ; i++) {
            total=besarDiskon(Barang[i],Cart[i].getQty())+total;
        }
        return total;
    }

    public long getLamaBarang (BarangBelanjaan item){
        long lama = ChronoUnit.DAYS.between(item.getTglMasuk(), LocalDate.now());
        return lama;
    }
    public double DiskonyangDiDapat (BarangBelanjaan barang, String member){
        double diskon=0;
        long lama= getLamaBarang(barang);
        if (lama>=30){
            diskon=(double)40/100;
        }  if (lama>=60 && member.equalsIgnoreCase("n")){
            diskon=(double)60/100;
        } if (lama<30 && member.equalsIgnoreCase("m")){
            diskon=(double)10/100;
        }  if ((lama>=30 && lama<60) && member.equalsIgnoreCase("m")){
            diskon=(double)50/100;
        } if (lama>=60 && member.equalsIgnoreCase("m")){
            diskon=(double)70/100;
        }
        barang.setDiskon(diskon);
        return diskon;
    }
    public BarangBelanjaan findBarang (Scanner sc, BarangBelanjaan[] stockBarang){
        BarangBelanjaan beli=null;
        System.out.println("Masukan Kode Barang ");
        String kodeBarang=sc.next();
        for (int i = 0; i <stockBarang.length ; i++) {
            if (stockBarang[i].getItemCode().equalsIgnoreCase(kodeBarang)){
                beli=stockBarang[i];
            }
        }
        return beli;
    }
    public double totalHargaItem(BarangBelanjaan beli,int qty){
        return beli.getHarga()*qty;
    }
    public double besarDiskon(BarangBelanjaan barang,int qty){
        return barang.getDiskon()*totalHargaItem(barang,qty);
    }
    public void showBarang(BarangBelanjaan barang){
        System.out.println("Kode Barang \t "+barang.getItemCode());
        System.out.println("Nama Barang \t "+barang.getItemName());
        System.out.println("Diskon      \t "+(barang.getDiskon()*100)+"%");
    }


}
*/
