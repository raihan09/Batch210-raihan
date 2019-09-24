package com.xsis.extend6;

import java.util.Scanner;

public class soal8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a month(1-12) :");
        int bulan = input.nextInt();
        System.out.print("Enter a year :");
        int tahun = input.nextInt();
        int jumlah;
        String bulan2=null;
        if(bulan==2&&tahun%4==0){
            jumlah =29;
        }else if(bulan==2&&tahun%4!=0){
            jumlah=28;
        }
        else if(bulan==1||bulan==3||bulan==5||bulan==7||bulan==8||bulan==10||bulan==12){
            jumlah=31;
        }else jumlah=30;
        switch (bulan){
            case 1 : bulan2="January";
            case 2 : bulan2="February";
            case 3 : bulan2="March";
            case 4 : bulan2="April";
            case 5 :bulan2="May";
            case 6 : bulan2="June";
            case 7 : bulan2="July";
            case 8 : bulan2="August";
            case 9 : bulan2="September";
            case 10 : bulan2="Oktober";
            case 11 :bulan2="November";
            case 12 : bulan2="Desember";
        }

        /*if(bulan==1){
            bulan2="January";
        }
        else if(bulan==2){
            bulan2="February";
        }
        else if(bulan==3){
            bulan2="March";
        }
        else if(bulan==4){
            bulan2="April";
        }
        else if(bulan==5){
            bulan2="May";
        }
        else if(bulan==6){
            bulan2="June";
        }
        else if(bulan==7){
            bulan2="July";
        }
        else if(bulan==8){
            bulan2="August";
        }
        else if(bulan==9){
            bulan2="September";
        }
        else if(bulan==10){
            bulan2="October";
        }
        else if(bulan==11){
            bulan2="November";
        }
        else if(bulan==12){
            bulan2="Desember";
        }
*/      input.close();
        System.out.println(bulan2+" "+tahun+" has "+jumlah+" days");

    }
}
