package _09_IfElseStatements;

import java.util.Scanner;

/**
 Görev: Bir kişinin yaşına göre sinema bileti fiyatını hesaplayan bir Java programı yazın.
 Sinema bileti fiyatı 60 TL'dir. Yaşa göre aşağıdaki indirimler uygulanmaktadır:

 - 18 yaşından küçükler: 12 TL indirim
 - 18-60 yaş arası: 6 TL indirim
 - 60 yaşından büyükler: 9 TL indirim

 Kullanıcıdan yaş bilgisi alarak indirimli bilet fiyatını ekrana yazdırın.
 */
public class _02_CinemaTicketCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();  // Kaynak sızıntısını önlemek için Scanner kapatılır.

        double indirim;  // İndirim miktarı
        double sabitFiyat = 60;  // Sinema bileti temel fiyatı

        // Yaşa göre indirim belirlenir
        if (yas < 18) {
            indirim = 12;  // 12 TL indirim
        } else if (yas < 60) {
            indirim = 6;   // 6 TL indirim
        } else {
            indirim = 9;   // 9 TL indirim
        }

        // İndirim uygulanarak fiyat hesaplanır
        double fiyat = sabitFiyat - indirim;

        // Sonuç kullanıcıya gösterilir
        System.out.println("Sinema bileti fiyatınız: " + fiyat + " TL");
    }
}
