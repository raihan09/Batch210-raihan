package com.xsis.day10;

public class logic3coba {
    public static void main(String[] args) {
        logic3coba hacker_rank = new logic3coba();
        int a[] = {1, 200, 6};
        int b[] = {4, 50, 6};
        hacker_rank.soal03(a, b);



    }

    void soal03(int a[], int b[]) {
        int alice =0;
        int bob =0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>b[i]){
                alice++;
            }
            else if(a[i]<b[i]){
                bob++;
            }
        }
        System.out.println("point alice = "+alice);
        System.out.println("point bob = "+bob);
    }

    void soal04(int a[], int b[]){

    }
}


