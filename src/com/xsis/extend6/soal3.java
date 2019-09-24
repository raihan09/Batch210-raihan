package com.xsis.extend6;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean done =true;
        int max =0;
        int min =999999999;
        while (done){
            System.out.print("Enter a number (-99 to quit):");
            int number = input.nextInt();
            if(number==-99){
                done=false;
            }else if(number<min){
                min=number;
            }else if (number>max){
                max=number;
            }
        }
        if(max==0){
            System.out.println("Tidak ada masukan");}
        else {
            System.out.println("Largest Number : " + max);
            System.out.println("Smallest Number : " + min);
        }
        input.close();
    }
}
