package com.xsis.quiz.logic;
import java.util.Scanner;
public class nomor6 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan Kalimat");
        String kata = keyboard.nextLine();
        nomor6 count = new nomor6();
        count.countChar(kata,'a');


        }
        void  countChar(String kata, char searchKarakter){
        int a=0;
        for (int i=0;i< kata.length();i++){
            if(searchKarakter == kata.charAt(i)){
                a++;
            }
        }
            System.out.println("Jumlah Karakter "+searchKarakter+" adalah : "+a);
    }
}
