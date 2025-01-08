package _06_Scanner;

import java.util.Scanner;

public class _05_AgeCalculator {

    public static void main(String[] args) {

        /**
            5. Task: Doğum yılı girilen kişinin yaşını hesaplayan bir program yazınız.
            Not: İçinde bulunulan yıl kullanıcıdan alınacak.
         */

        // Değişken tanımlamaları
        int dogumYili, guncelYil;

        Scanner input = new Scanner(System.in);

        // Doğum yılı al
        System.out.println("Doğum yılınızı giriniz: ");
        dogumYili = input.nextInt();

        // İçinde bulunulan yılı al
        System.out.println("İçinde bulunduğunuz yılı giriniz: ");
        guncelYil = input.nextInt();

        // Yaş hesapla ve ekrana yazdır
        int yas = guncelYil - dogumYili;
        System.out.println(yas + " yaşındasınız!");
    }
}
