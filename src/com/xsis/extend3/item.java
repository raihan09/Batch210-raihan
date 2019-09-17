package com.xsis.extend3;

import java.time.LocalDate;
import java.util.Date;

public class item {
    private String itemCode;
    private String itemName;
    private char Size;
    private int Qty;
    private double HargaPrice;
    private String TglMasuk;
    private double Diskon;
    double totalHarga =0;

    public item(String itemCode, String itemName, char size, int qty, double hargaPrice, String tglMasuk) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        Size = size;
        Qty = qty;
        HargaPrice = hargaPrice;
        TglMasuk = tglMasuk;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public char getSize() {
        return Size;
    }

    public void setSize(char size) {
        Size = size;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public double getHargaPrice() {
        return HargaPrice;
    }

    public void setHargaPrice(int hargaPrice) {
        HargaPrice = hargaPrice;
    }

    public String getTglMasuk() {
        return TglMasuk;
    }

    public void setTglMasuk(String tglMasuk) {
        TglMasuk = tglMasuk;
    }

    public double getDiskon() {
        return Diskon;
    }

    public void setDiskon(double diskon) {
        Diskon = diskon;
    }
}
