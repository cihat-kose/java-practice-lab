package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan 10 adet sayı alınız. Eğer girilen bir sayı, kendisinden önce girilen
   sayıdan büyükse döngü sonlandırılacaktır.

   Örnek:
   1. sayıyı giriniz: 50
   2. sayıyı giriniz: 40
   3. sayıyı giriniz: 30
   4. sayıyı giriniz: 35

   Çıktı:
   Döngü sonlandırıldı çünkü son girilen sayı önce girilenden büyük.
*/

public class _08_TerminateOnIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oncekiSayi = Integer.MAX_VALUE; // İlk karşılaştırma için büyük bir değer
        boolean dahaBuyuk = false;

        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            int mevcutSayi = scanner.nextInt();

            if (mevcutSayi > oncekiSayi) {
                dahaBuyuk = true;
                break;  // Döngüyü sonlandır
            }
            oncekiSayi = mevcutSayi;  // Mevcut sayıyı bir sonraki karşılaştırma için sakla
        }

        if (dahaBuyuk) {
            System.out.println("Döngü sonlandırıldı çünkü son girilen sayı önce girilenden büyük.");
        } else {
            System.out.println("Tüm sayılar başarıyla girildi.");
        }

        scanner.close();
    }
}