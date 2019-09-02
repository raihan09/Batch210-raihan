package com.xsis.day04;

public class FIsika {
    public static void main(String args[]){
        FIsika F = new FIsika();
        double k1= F.kalor(5,4.2,10.5);
        System.out.println("kalor 1 = "+k1);
        F.kalor(5,10.5);
        int k5 = F.kalor();
        System.out.println("K5 = "+k5);
    }
    double kalor(double m, double c,double dt){
        return m*c*dt;
    }
    void kalor(double m,double dt){
        double c =5.5;
        double x= m*c*dt;
        System.out.println("Kalor2 = "+x);
    }

    int kalor (){
        return 5*4*3;

    }

}
