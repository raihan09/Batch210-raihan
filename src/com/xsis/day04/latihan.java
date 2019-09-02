package com.xsis.day04;

public class latihan {
    public static void main(String[] args) {
       /* int [][] matrix = new int[5][5];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[1].length;j++){
                if(i==j) {
                    System.out.print(i+1+" ");
                }else if (i>j) {
                    System.out.print("x ");
                }else {
                    System.out.print(0+" ");
                }

            }
            System.out.println();
        }*/
        latihan phy = new latihan();
         phy.phytagoras(7, 3);
        phy.phytagoras(7, 3);

    }

    public void phytagoras(int n, int m) {

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int hasil = i * j;
                if (i==0&&j >0){
                    System.out.print(j +"  ");}
                    else if(j==0&&i>0){
                        System.out.print(i+"  ");
                    }

                else{System.out.print(hasil+"  ");}

            }        System.out.println();
        }

    }
}



