package day05;

public class logic3no2 {
    public static void main(String[] args) {
        int[][] nums = new int[7][7];
        int i, j;
        int miring = 17;
        int kanan = 20;
        int fix = 3;
        int aa=6;
        int bawah = 41;
        for (i = 0; i < nums.length+1; i++) {
            for (j = 0; j < nums.length+1; j++) {
                //KANAN
                if (j == nums.length&&i<nums.length) {
                    if (i == 2) {
                        System.out.print("9");
                    } else if (i == 6) {
                        System.out.print("27");
                    }
                    else if(i>1) {
                        System.out.print(kanan);

                        kanan += 3;
                    }

                }
                // BAWAH
             else if (i == 7 &&j>0&&j<6) {
                    System.out.print(" ");
                   System.out.print(bawah);

                    bawah -= 3;
                    if (j == 2) {
                        System.out.print(" ");
                        System.out.print(81);
                    }
                }
                //miring
             else if ((i + j) == nums.length) {
                    if (j == 3) {
                        System.out.print(fix);

                    } else {
                        System.out.print(miring);
                        miring -= 3;
                    }
                }
                else {
                    System.out.print(" ");
                    System.out.print(" ");
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}

