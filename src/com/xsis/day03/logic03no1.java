package com.xsis.day03;

public class logic03no1 {
    public static void main(String[] args) {
        int[][] nums = new int[7][7];
        int i,j;
        int atas = 2;
        int bawah = 44;
        int fix = 3;
        int Kiri1 = 53;
        int Kanan1 = 20;
        for (i=0; i<nums.length; i++){
            for (j=0; j<nums[i].length; j++){
                //ATAS
                if (i==0){
                    System.out.print(atas);
                    System.out.print(" ");

                    atas += 3;
                    if (j == 2){
                        System.out.print(fix);
                        System.out.print(" ");
                    }
                }

                // BAWAH
                else if (i==6){
                    System.out.print(bawah);
                    System.out.print(" ");

                    bawah -= 3;
                    if (j == 2){
                        System.out.print(fix);
                        System.out.print(" ");
                    }
                }

                //KIRI
                else if (j==0){
                    if (i>1 && i<5){
                        System.out.print(Kiri1);
                        Kiri1 -= 3;
                    }
                    if (i==1 || i==5){
                        System.out.print("3");
                    }
                }

                //KANAN
                else if (j==6){
                    if (i>1 && i<5){
                        System.out.print("     ");
                        System.out.print(Kanan1);

                        Kanan1 += 3;
                    }
                    if (i==1 || i==5){
                        System.out.print("      ");
                        System.out.print("3");

                    } break;
                }

                else {
                    System.out.print(" ");
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}



