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

        System.out.print("1. sayıyı giriniz: ");
        int oncekiSayi = scanner.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int mevcutSayi = scanner.nextInt();

            if (mevcutSayi > oncekiSayi) {
                System.out.println("Döngü sonlandırıldı çünkü son girilen sayı önce girilenden büyük.");
                scanner.close();
                return; // Programı bitir
            }

            oncekiSayi = mevcutSayi; // Karşılaştırma için güncelle
        }

        System.out.println("Tüm sayılar başarıyla girildi.");
        scanner.close();
    }
}
