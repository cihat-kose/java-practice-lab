package _10_TernaryOperator;

import java.util.Scanner;

/**
Görev:
Bir kişinin yaşına göre sinema bileti fiyatını hesaplayan bir program yazın.
Ternary operator kullanarak indirim miktarını belirleyin ve son bilet fiyatını hesaplayın.

Kurallar:
- 18 yaşından küçükler: 12 TL indirim
- 18-60 yaş arası: 6 TL indirim
- 60 yaşından büyükler: 9 TL indirim

Kullanıcıdan yaş bilgisi alarak indirimli bilet fiyatını ekrana yazdırın.
Not: Temel sinema bileti fiyatı 60 TL'dir.
*/

public class _02_CinemaTicketCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();
        input.close();

        // Sabit bilet fiyatı
        double sabitFiyat = 60;

        // Ternary operator ile indirim miktarı hesaplanır
        double indirim = (yas < 18) ? 12 : (yas < 60) ? 6 : 9;

        // İndirim uygulanarak fiyat hesaplanır
        double fiyat = sabitFiyat - indirim;

        System.out.println("Sinema bileti fiyatınız: " + fiyat + " TL");
    }
}
