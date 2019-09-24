package com.xsis.extend4;

public class fibo {
    public static void main(String[] args){
        for (int i = 0; i <10 ; i++) {
            System.out.println(deretfibo(i));
        }

    }
    static int deretfibo(int a){
        if(a<2){
            return 1;
        }
        else return  deretfibo(a-2)+deretfibo(a-1);
    }
    }

