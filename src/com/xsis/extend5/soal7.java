package com.xsis.extend5;

public class soal7 {
    public static void main(String[] args)throws InterruptedException {
        for (int i = 0; i <12 ; i++) {
            long startTime = System.currentTimeMillis();
            Thread.sleep(60);
            fibo(i);
             long endTime = System.currentTimeMillis();
             float timeElapsed = (endTime-startTime)/1000F;
            System.out.println("Rudal("+i+") = "+fibo(i)+", lauch in : "+timeElapsed);

            
        }
    }

    static int fibo(int i){
        if(i<2){
            return 1;
        }
        else
        return fibo(i-2)+fibo(i-1);
    }

}
