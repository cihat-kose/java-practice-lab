package _14_ForLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan kaç adet sayı gireceğini isteyen ve bu sayıların
   en büyüğünü ve en küçüğünü bulan bir Java programı yazınız.
*/

public class _08_FindMaxAndMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceğinizi belirtin: ");
        int n = input.nextInt();
        input.close();

        // En büyük ve en küçük sayıları tutmak için başlangıç değerleri atanır.
        int enBuyuk = Integer.MIN_VALUE; // Başlangıçta en büyük, minimum değeri alır.
        int enKucuk = Integer.MAX_VALUE; // Başlangıçta en küçük, maksimum değeri alır.

        // Kullanıcının belirttiği kadar sayı girmek için döngü çalıştırılır.
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı girin: "); // Sayı sırasını belirtmek için i+1.
            int num = input.nextInt();

            // Girilen sayı en büyükten büyükse en büyük güncellenir.
            if (num > enBuyuk) {
                enBuyuk = num;
            }

            // Girilen sayı en küçükten küçükse en küçük güncellenir.
            if (num < enKucuk) {
                enKucuk = num;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
