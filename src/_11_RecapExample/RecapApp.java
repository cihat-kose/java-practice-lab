package _11_RecapExample;

import java.util.Scanner;

public class RecapApp {
    public static void main(String[] args) {
        // 1. Print ve Println Kullanımı
        System.out.println("Java Konularının Genel Tekrarına Hoş Geldiniz!");
        System.out.print("Lütfen devam etmek için ENTER tuşuna basın...");

        // 2. Scanner ile Kullanıcıdan Bilgi Alma
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine(); // Enter tuşunu bekler

        // 3. Değişkenler ve Veri Tipleri
        String ad;
        int yas;
        double kilo;

        System.out.print("Adınızı giriniz: ");
        ad = scanner.nextLine();

        System.out.print("Yaşınızı giriniz: ");
        yas = scanner.nextInt();

        System.out.print("Kilonuzu giriniz: ");
        kilo = scanner.nextDouble();

        // 4. Type Casting
        int kiloYuvarlanmis = (int) kilo; // double -> int dönüşümü

        // 5. String Metotları
        String adBuyukHarf = ad.toUpperCase();

        // 6. Aritmetik Operatörler
        int dogumYili = 2024 - yas;

        // 7. If-Else Kullanımı
        String yetiskinMi = (yas >= 18) ? "Evet, yetişkinsiniz." : "Hayır, yetişkin değilsiniz.";

        // 8. Switch-Case Kullanımı
        String kiloDurumu;
        switch (kiloYuvarlanmis) {
            case 50, 60 -> kiloDurumu = "Zayıf";
            case 61, 70 -> kiloDurumu = "Normal";
            case 71, 80 -> kiloDurumu = "Kilolu";
            default -> kiloDurumu = "Bilinmiyor";
        }

        // 9. Çıktıları Gösterme
        System.out.println("\n--- KULLANICI BİLGİLERİ ---");
        System.out.println("Adınız (Büyük Harf): " + adBuyukHarf);
        System.out.println("Doğum Yılınız: " + dogumYili);
        System.out.println("Yetişkin misiniz? " + yetiskinMi);
        System.out.println("Yuvarlanmış Kilo: " + kiloYuvarlanmis + "kg");
        System.out.println("Kilo Durumunuz: " + kiloDurumu);

        scanner.close();
    }
}
