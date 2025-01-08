package _06_Scanner;

import java.util.Scanner;

public class _06_KDVCalculator {

    public static void main(String[] args) {

        /**
            6. Task: Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
            KDV tutarını hesaplayıp ekrana bastıran programı yazın.
            (Not: KDV oranı %18 olarak alınacaktır.)
         */

        // Değişken tanımlamaları
        double girilenTutar, kdvliTutar, kdvTutari;

        Scanner input = new Scanner(System.in);

        // Kullanıcıdan tutar alınır
        System.out.println("%18 KDV'li hali hesaplanacak olan tutarı giriniz:");
        girilenTutar = input.nextDouble();

        // KDV'li tutar ve KDV tutarı hesaplanır
        kdvliTutar = girilenTutar * 1.18;
        kdvTutari = girilenTutar * 0.18;

        // Sonuçlar ekrana yazdırılır
        System.out.println("KDV’siz tutar = " + girilenTutar + "\n" +
                "KDV’li tutar = " + kdvliTutar + "\n" +
                "KDV tutarı = " + kdvTutari);
    }
}