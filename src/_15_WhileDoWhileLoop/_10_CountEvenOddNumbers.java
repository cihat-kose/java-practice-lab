package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan belirli sayıda sayı girişi alınarak kaç tane çift ve kaç tane tek
   sayı girdiğini bulan bir program yazınız.

   Örnek:
   Kaç adet sayı gireceksiniz? 5
   1. sayıyı giriniz: 12
   2. sayıyı giriniz: 7
   3. sayıyı giriniz: 9
   4. sayıyı giriniz: 20
   5. sayıyı giriniz: 14

   Çıktı:
   Çift sayı adedi: 3
   Tek sayı adedi: 2
*/

public class _10_CountEvenOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int adet = scanner.nextInt();

        if (adet <= 0) {
            System.out.println("Geçerli bir adet giriniz.");
            scanner.close();
            return;
        }

        int ciftSayac = 0;
        int tekSayac = 0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi = scanner.nextInt();

            if (sayi % 2 == 0) {
                ciftSayac++;
            } else {
                tekSayac++;
            }
        }

        System.out.println("Çift sayı adedi: " + ciftSayac);
        System.out.println("Tek sayı adedi: " + tekSayac);

        scanner.close();
    }
}