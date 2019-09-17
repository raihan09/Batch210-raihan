package com.xsis.quiz.logic;
import java.util.Scanner;
public class nomor10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int max = 0;
        System.out.println("Please enter values, Q to quit");
        String y = keyboard.nextLine();
        for (int i = 0; i < y.length(); i++) {
            if (y.charAt(i) == 'q') {
                break;
            }
            int x = y.charAt(i);
            if (x>max) {
                max = x;
            } else if (max<x) {
                max=max;
                System.out.println("largest array = "+max);
            }
            System.out.println(y.charAt(i));
        }

    }
}


