package com.xsis.quiz.logic;
import java.util.Scanner;
public class nomor1 {
    public static void main(String[] args) {
        int harga = 20000;
        System.out.println("__Cash Register__");
        Scanner input = new Scanner(System.in);
        System.out.println("Harga Produk : "+harga);
        System.out.print("Cash : ");
        int x = input.nextInt();
        int kembalian = x-harga;
        System.out.println("Kembalian : "+kembalian);

    }
}
