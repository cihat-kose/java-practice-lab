package _06_Scanner;

import java.util.Scanner;

/**
Görev:
Kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayan bir program yazın.
(Not: KDV oranı %18 olarak alınacaktır.)
*/
public class _06_KDVCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan tutar alınır
        System.out.print("%18 KDV'li hali hesaplanacak olan tutarı giriniz: ");
        double girilenTutar = input.nextDouble();

        // KDV hesaplamaları
        double kdvOrani = 0.18;
        double kdvTutari = girilenTutar * kdvOrani;
        double kdvliTutar = girilenTutar + kdvTutari;

        // Sonuçlar ekrana yazdırılır
        System.out.println("KDV’siz tutar = " + girilenTutar);
        System.out.println("KDV’li tutar = " + kdvliTutar);
        System.out.println("KDV tutarı = " + kdvTutari);
    }
}
