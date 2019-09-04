package com.xsis.day06;

public class selamatpagi {
    public static void main(String[] args) {
int AA [][] = {{5,4,2},{3,2,1}};
        selamatpagi rank = new selamatpagi();
        rank.Rank(AA);
    }


            public void Rank (int c [][]){
                int a[] = new int[3];
                int b [] = new int[3];
                int Alice = 0;
                int Bob = 0;
                for(int i=0;i<a.length;i++){
                    for(int j=0;j<b.length;j++){
                        if(a[i] >b[i]){
                            Alice++;
                        }
                        else if (a[i]<b[i]) {
                            Bob++;
                        }
                        System.out.println("Alice"+Alice);
                        System.out.println("BOB"+Bob);

        }
    }
}}

