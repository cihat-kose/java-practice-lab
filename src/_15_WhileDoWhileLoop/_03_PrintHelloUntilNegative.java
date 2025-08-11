package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan bir sayı girmesini isteyen ve girilen sayı pozitif olduğu sürece
   ekrana "Merhaba!" yazan bir Java programı yazınız.
   Kullanıcı negatif bir sayı girdiğinde program sonlanmalıdır.

   Örnek:
   Bir sayı giriniz: 3
   Merhaba
   Bir sayı giriniz: 0
   Merhaba
   Bir sayı giriniz: -2
   Program sonlandı.
*/

public class _03_PrintHelloUntilNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        do {
            System.out.print("Bir sayı giriniz (negatif sayı girildiğinde çıkılır): ");
            sayi = input.nextInt();

            // Eğer sayı pozitif veya sıfırsa
            if (sayi >= 0) {
                System.out.println("Merhaba!");
            }
        } while (sayi >= 0); // Negatif girilirse döngü biter

        System.out.println("Program sonlandı.");
        input.close();
    }
}
