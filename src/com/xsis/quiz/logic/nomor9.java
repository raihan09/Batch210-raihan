package com.xsis.quiz.logic;

public class nomor9 {
    public static void main(String[] args) {
        int [] scores = {10,9,7,10};
        nomor9 Score = new nomor9();
        Score.addScores(scores);
    }

    public void addScores(int scores []){
        int b =0;
        System.out.print("Scores : ");
        for (int i=0;i<scores.length;i++){
             b = b + scores[i];
            System.out.print(scores[i]+ " ");
        } System.out.println('\n'+"Total Score : ");
        System.out.print(b);

    }

}

