package com.xsis.extend6;

import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int i=1;
        int jumlah=0;
        char gradeLetter;
        boolean done=true;
        while (done){
            System.out.print("Enter the score for test "+i+" : ");
            int aa=input.nextInt();
            i++;
            jumlah+=aa;
            if(i==5){
                done=false;
            }
        }
        int avg = jumlah/i;
        System.out.println("The avg is "+avg);
        if(avg>=90){
            gradeLetter='A';
        }else if(avg>=80){
            gradeLetter='B';
        }else if(avg>=70){
            gradeLetter='C';
        }else if(avg>=60){
            gradeLetter='D';
        }else{
            gradeLetter='F';
        }
        input.close();
        System.out.println("Your Letter Grade is : "+gradeLetter);
    }
}
