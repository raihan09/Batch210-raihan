package com.xsis.day06;

public class counter {
    static int counter =0;
    public static void main(String[] args) {
        increment();
        System.out.println("counter : "+ counter);
        decrement();
        System.out.println("counter : "+counter);

    }
    static void increment(){
        counter = counter+5;
    }

    static void decrement(){
        counter= counter-1;
}


}
