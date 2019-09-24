package com.xsis.extend6;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Money Budget: $");
        int budget = input.nextInt();
        System.out.println("Money Spent This Month(type -1 to quit) : ");
        System.out.println("----------------------------------");
        int i = 1;
        int jumlah = 0;
        boolean done = true;
        while (done) {
            System.out.print("Enter cost #" + i + ": ");
            int cost = input.nextInt();
            i++;
            if (cost!=-1) {
                jumlah += cost;
            }
            else if (cost == -1) {
                done = false;
            }
        }input.close();
        System.out.println("Total Cost : $"+jumlah);
        System.out.println("You are $"+moneySpent(budget,jumlah)+" under your budget");

    }

    static int moneySpent(int budget, int jumlah) {
        return budget - jumlah;

    }
}
