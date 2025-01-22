package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcının gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz.

   Örnek:
   Bir sayı giriniz: 1234
   Girilen sayının tersi: 4321
*/

public class _06_ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int tersSayi = 0;

        while (sayi != 0) {
            int basamak = sayi % 10;  // Son basamağı al
            tersSayi = tersSayi * 10 + basamak;  // Ters sayıya ekle
            sayi /= 10;  // Son basamağı çıkar
        }

        System.out.println("Girilen sayının tersi: " + tersSayi);

        scanner.close();
    }
}
