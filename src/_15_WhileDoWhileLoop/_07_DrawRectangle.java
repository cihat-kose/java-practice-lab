package _15_WhileDoWhileLoop;

import java.util.Scanner;

/**
 Görev:
 Kullanıcının belirlediği genişlik ve uzunluktaki dikdörtgeni,
 verilen bir karakterle oluşturan bir Java programı yazınız.

 Örnek:
 Bir karakter giriniz: *
 Genişlik giriniz: 5
 Uzunluk giriniz: 3

 Çıktı:
 *****
 *****
 *****
 */

public class _07_DrawRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir karakter giriniz: ");
        char karakter = scanner.next().charAt(0);

        System.out.print("Genişlik giriniz: ");
        int genislik = scanner.nextInt();

        System.out.print("Uzunluk giriniz: ");
        int uzunluk = scanner.nextInt();

        int satir = 1;
        while (satir <= uzunluk) {
            int sutun = 1;
            while (sutun <= genislik) {
                System.out.print(karakter);
                sutun++;
            }
            System.out.println();
            satir++;
        }

        scanner.close();
    }
}
