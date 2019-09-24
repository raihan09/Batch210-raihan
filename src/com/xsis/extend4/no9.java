package com.xsis.extend4;

import java.util.Scanner;

public class no9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("masukkan kata :");
        String masuk = input.nextLine().toUpperCase();
        System.out.println(vokal(masuk));
    }

    static String vokal (String aa){
        String kondisi=null;
        int simpan = 0;
        for (int i = 0; i <aa.length() ; i++) {
            if (aa.charAt(i)=='A'||aa.charAt(i)=='I'||aa.charAt(i)=='U'
                    ||aa.charAt(i)=='E'||aa.charAt(i)=='O')
            { kondisi="true";

            }
            else simpan=10;
        }if(simpan==10)return "false";
        else return "true";
    }
}
