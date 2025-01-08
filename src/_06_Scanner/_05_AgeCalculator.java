package _06_Scanner;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan doğum yılını ve içinde bulunulan yılı alarak yaşını hesaplayan bir program yazınız.
*/
public class _05_AgeCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Doğum yılını al
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = input.nextInt();

        // İçinde bulunulan yılı al
        System.out.print("İçinde bulunduğunuz yılı giriniz: ");
        int guncelYil = input.nextInt();

        // Yaşı hesapla
        int yas = guncelYil - dogumYili;

        // Sonucu ekrana yazdır
        System.out.println("Yaşınız: " + yas);
    }
}
