package _06_Scanner;

import java.util.Scanner;

public class _04_ArithmeticOperations {

    public static void main(String[] args) {

        /**
            Task: Kullanıcıdan iki tamsayı alarak,
            bu sayıların toplamını, farkını ve çarpımını
            ekrana yazdıran bir program yazın.
         */

        // Değişken tanımlamaları
        int sayi1, sayi2, sayiToplam, sayiFark, sayiCarpim;

        Scanner input = new Scanner(System.in);

        // Birinci tamsayıyı al
        System.out.println("Birinci tamsayıyı giriniz:");
        sayi1 = input.nextInt();

        // İkinci tamsayıyı al
        System.out.println("İkinci tamsayıyı giriniz:");
        sayi2 = input.nextInt();

        // Aritmetik işlemler
        sayiToplam = sayi1 + sayi2;
        sayiFark = sayi1 - sayi2;
        sayiCarpim = sayi1 * sayi2;

        // Sonuçları ekrana yazdır
        System.out.println("Toplam = " + sayiToplam);
        System.out.println("Fark = " + sayiFark);
        System.out.println("Çarpım = " + sayiCarpim);
    }
}
