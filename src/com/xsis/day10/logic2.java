package com.xsis.day10;

public class logic2 {
    public static void main(String[] args) {
        int[] arr = new int[7];

        // initial value
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= i;
        }

//        soal01(arr);
//        System.out.println();
//        soal02(arr);
//        System.out.println();
        soal05("Aku Sayang        Kamu dan dia dan semuanya ");
//        soal06("AkuSayangKamuTapiKamu");

    }

    static void soal06(String s){
        int counter=0;
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)){
                counter++;
            }
        }
        System.out.println("Found Kapital : "+counter);
    }

    static void soal05(String s){
        int start=0;
        int end =0;
        String finalWord="";
        // loop sepanjang kalimat Aku Sayang Kamu
        for (int i = 0; i < s.length() ; i++) {
            // ubah tiap kalimat menjadi karater, dimulai dari index ke-0
            char ch = s.charAt(i);
            // variable end akan menyimpan index i, kita gunakan untuk detek akhir kata
            end = i;

            // check apakah ketemu karakter space, jika true maka process
            if (ch == ' '){
                // cut kalimat menjadi per kata, dengan memotong kata dari index start to end
                String cutWord = s.substring(start,end);
                // simpang panjang kata yang sudah di cut, untuk kita proses nilai tengah jadi *
                int lengthWord = s.substring(start,end).length();
                // create variable tuk simpan per karater, misal Aku menjadi A,k, u
                String kata="";
                for (int j = 0; j < lengthWord ; j++) {
                    char chin= cutWord.charAt(j);
                    if ((j ==0 )|| (j==lengthWord-1)){
                        kata=kata +chin;
                    }
                    if (j> 0 && j < lengthWord-1){
                        kata=kata +"*";
                    }

                }
                start = end+1;
                finalWord = finalWord+" "+kata;

            }
        }
        System.out.println("finalword : "+finalWord);
    }

    static void soal02(int[]arr){
        // show output
        for (int i = 0; i < arr.length ; i++) {
            if (i >= 1){
                int fact = 1;
                for (int j = 1; j <= i ; j++) {
                    fact = fact * 3 ;
                }
                if ( i ==1) System.out.print(1 + " ");
                if (i == 2 || i == 5){
                    System.out.print((fact*-1)+" ");
                }else{
                    System.out.print((fact)+" ");
                }

            }
        }
    }

    static void soal01(int[]arr){
        // show output
        for (int i = 0; i < arr.length ; i++) {
            if (i >= 1){
                int fact = 1;
                for (int j = 1; j <= i ; j++) {
                    fact = fact * 3 ;
                }
                System.out.print(fact+" ");
            }
        }
    }
}
