package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcının gireceği bir sayının kaç basamaklı olduğunu bulan bir Java programı yazınız.

   Örnek:
   Sayı giriniz: 163460
   Basamak sayısı: 6
*/

public class _05_CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int sayi = scanner.nextInt();

        sayi = Math.abs(sayi); // Negatif sayılar için mutlak değer alınır.

        // 0 özel durum: tek basamak
        if (sayi == 0) {
            System.out.println("Basamak sayısı: 1");
            return;
        }

        int sayac = 0;

        while (sayi > 0) {
            sayi = sayi / 10; // Sayıyı 10'a bölerek bir basamağı düşür.
            sayac++; // Basamak sayacını artır.
        }

        System.out.println("Basamak sayısı: " + sayac);
        scanner.close();
    }
}
