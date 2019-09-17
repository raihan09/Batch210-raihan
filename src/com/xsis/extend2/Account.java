package com.xsis.extend2;
import java.util.Scanner;
public class Account {
 double saldo;
 int norek;

    public Account(double saldo, int norek) {
        this.saldo = saldo;
        this.norek = norek;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNorek() {
        return norek;
    }

    public void setNorek(int norek) {
        this.norek = norek;
    }
}
