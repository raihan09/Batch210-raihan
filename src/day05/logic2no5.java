package day05;
import java.util.Scanner;
public class logic2no5 {
    public static void main(String[] args) {
         // membuat scanner baru
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Masukan: ");
            // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
            String x = keyboard.nextLine();
            String y = x.replaceAll("[kaynm]","*");
            System.out.print("keluaran :");
            for(int j=0; j< x.length(); j++){
                    System.out.print(y.charAt(j));

            }
    }

        }



