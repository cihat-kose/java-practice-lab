package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan sürekli pozitif tam sayılar girmesini isteyen bir program yazınız.
   Kullanıcı negatif bir sayı girdiğinde program sonlanmalı ve toplam ekrana yazdırılmalıdır.

   Örnek:
   Sayı giriniz: 5
   Sayı giriniz: 10
   Sayı giriniz: 7
   Sayı giriniz: -1

   Çıktı:
   Girilen pozitif sayıların toplamı: 22
*/

public class _09_SumPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do {
            System.out.print("Sayı giriniz (negatif bir sayı girerek çıkış yapabilirsiniz): ");
            sayi = scanner.nextInt();

            if (sayi > 0) {
                toplam += sayi;
            }
        } while (sayi >= 0);

        System.out.println("Girilen pozitif sayıların toplamı: " + toplam);
        scanner.close();
    }
}