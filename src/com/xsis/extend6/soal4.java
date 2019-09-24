package com.xsis.extend6;

import java.nio.charset.Charset;
import java.util.Random;
import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        String[] array = {"rock","paper","scissor"}; // length is bounded by 7
        Scanner input =new Scanner(System.in);
        Random random = new Random();
       System.out.println("enter rock, paper, or scissor : ");
        String masukan=input.nextLine();
        String character =array[random.nextInt(array.length)];
        System.out.println("Computer's chice : "+character);
        if(masukan.equals("rock")&&character.equals("paper")){
            System.out.println("Computer loses");
        }
        if(masukan.equals("rock")&&character=="scissor"){
            System.out.println("Computer wins");
        }
        if(masukan.equals("paper")&&character.equals("rock")){
            System.out.println("Computer loses");
        }
        if(masukan.equals("paper")&&character.equals("scissor")){
            System.out.println("Computer wins");
        }
        if(masukan.equals("scissor")&&character.equals("paper")){
            System.out.println("Computer loses");
        }
        if(masukan.equals("scissor")&&character.equals("rock")){
            System.out.println("Computer losess");
        }else System.out.println("Draw");
        input.close();
    }

    }

