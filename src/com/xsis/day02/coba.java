package com.xsis.day02;


public class coba
{
    public static void main(String[] args) {
        int deret = 1;
        int interval = 2;
        for (int i = 0; i <= 7 ; i++) {
            System.out.print(deret+" ");
            deret = deret +4;
            interval +=1;
            if (interval % 2==0){
                System.out.print("*");
            }
        }

    }

    }




