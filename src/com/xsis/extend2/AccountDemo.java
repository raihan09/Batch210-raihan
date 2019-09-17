package com.xsis.extend2;

import java.util.Scanner;

public class AccountDemo {
    public static void main(String[] args) {
        Account acc = new Account(100000, 123);
        Account acc2 = new Account(10000,124);
        Scanner sc = new Scanner(System.in);

        boolean done = true;
        while (done) {
            System.out.println("Enter Command (1=debet,2=transfer,0=keluar");
            int command = sc.nextInt();
            if (command == 1) {
                System.out.println("Penarikan Uang Tunai");
                double tarik = sc.nextDouble();
                System.out.println("Current Saldo : " + acc.getSaldo());
                System.out.println("Tarik Tunai : " + tarik);
                double sisa = acc.getSaldo() - tarik;
                System.out.println("Sisa : "+sisa);
                acc.setSaldo(sisa);
            }
            else if(command ==2){
                System.out.println("Transfer");
                double transfer = sc.nextDouble();
                System.out.println("Current Saldo : " + acc.getSaldo());
                System.out.println("Transfer : " + transfer);
                double sisa = acc.getSaldo() - transfer;
                System.out.println("Sisa : "+sisa);
                acc.setSaldo(sisa);
                System.out.println("Saldo Awal penerima : "+acc2.getSaldo());
                acc2.setSaldo(acc2.getSaldo()+transfer);
                System.out.println("Saldo Akhir penerima : "+acc2.getSaldo());

            }else if(command==0){
                done = false;
            }
        }
    }
}
