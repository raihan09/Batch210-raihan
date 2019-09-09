package com.xsis.quiz.logic;

public class nomor7 {
    public static void main(String[] args) {
        int asterix [] =new int[8];
        for (int i=0;i<asterix.length;i++){
            for (int j=0;j<asterix.length;j++){
                if(j<i){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
