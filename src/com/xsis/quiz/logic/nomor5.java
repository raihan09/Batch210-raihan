package com.xsis.quiz.logic;
import java.util.Scanner;
public class nomor5 {
    public static void main(String[] args) {
        System.out.println("Masukkan kata/angka : ");
        Scanner keyboard = new Scanner(System.in);
        String x = keyboard.nextLine();

        int left = 0;
        int right = x.length()-1;
            int check = 1;
        for (int i = 0; i < right ; i++) {
            if (x.charAt(right) != x.charAt(i)) {
                check= 0;
            }
            right--;
        }
        if(check==1){
            System.out.println("Palindrome");}
            else System.out.println("Bukan palindrome");
        }
        }


