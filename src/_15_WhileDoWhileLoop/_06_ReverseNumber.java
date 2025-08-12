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
        boolean negatifMi = false;

        // Negatif sayılar için kontrol
        if (sayi < 0) {
            negatifMi = true;
            sayi = Math.abs(sayi); // Mutlak değere çevir
        }

        // Basamakları sondan başa ekleyerek tersini oluştur
        while (sayi != 0) {
            int basamak = sayi % 10;             // Son basamağı al
            tersSayi = tersSayi * 10 + basamak;  // Ters sayıya ekle
            sayi /= 10;                          // Son basamağı çıkar
        }

        // Negatifse işareti tekrar ekle
        if (negatifMi) {
            tersSayi = -tersSayi;
        }

        System.out.println("Girilen sayının tersi: " + tersSayi);

        scanner.close(); // Kaynakları kapat
    }
}
