package _14_ForLoop;

import java.util.Scanner;

/**
   Görev:
   Kullanıcıdan alınan bir sayının faktöriyelini hesaplayan bir Java programı yazınız.
   (Faktöriyel, pozitif bir tam sayının kendisi ile 1 arasındaki tüm tam sayıların çarpımıdır.)
   Örneğin: 5! = 5 x 4 x 3 x 2 x 1 = 120
*/
public class _05_FactorialCalculator { // Sınıf ismi amaca uygun hale getirildi.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        int faktoriyel = 1; // Faktöriyel sonucunu saklamak için bir değişken tanımlanır.

        // Döngü, 1'den başlayarak girilen sayıya kadar iterasyon yapar.
        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i; // Her adımda faktoriyel değişkeni i ile çarpılır.
        }

        System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyel);
    }
}
