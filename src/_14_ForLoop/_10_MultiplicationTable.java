package _14_ForLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan bir sayı alarak, bu sayıya kadar olan çarpım tablosunu yazdıran
   bir Java programı yazınız.

 Örnek:
 Kullanıcıdan girdi: 3

 Çıktı:

 1 x 1 = 1
 1 x 2 = 2
 1 x 3 = 3

 2 x 1 = 2
 2 x 2 = 4
 2 x 3 = 6

 3 x 1 = 3
 3 x 2 = 6
 3 x 3 = 9
*/

public class _10_MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        int sayi = input.nextInt();

        // Dış döngü, çarpım tablosundaki her satırı temsil eder (1'den 'sayi'ya kadar).
        for (int i = 1; i <= sayi; i++) {
            // İç döngü, çarpım tablosundaki her sütunu temsil eder (1'den 'sayi'ya kadar).
            for (int j = 1; j <= sayi; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        input.close();
    }
}
