package com.xsis.extend5;

public class soal1 {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(starString(i));
        }
    }
    static String  starString(double j) {
        if(j==0){
            return "*";
        }
        else return starString(j-1)+starString(j-1);
    }
}




