package com.xsis.quiz.logic;

public class nomor3 {
    public static void main(String[] args) {
        nomor3 hasil = new nomor3();
        hasil.getGrade(60);
    }

    public void getGrade(int grade) {
        char rank;
        if (grade < 60) {
            rank = 'F';
            System.out.println(rank);
        }
         else if (grade <= 69 && grade >= 60){
            rank = 'D';
            System.out.println(rank);}
        else if (grade <= 79 && grade >= 70){
            rank = 'C';
            System.out.println(rank);}
        else if (grade <= 89 && grade >= 80){
            rank = 'B';
            System.out.println(rank);}
        else if (grade <= 100 && grade >= 90){
            rank = 'A';
            System.out.println(rank);}
        }

    }

