package _18_Methods;

import java.util.Scanner;

/**
 * Görev:
 * Kullanıcıdan alınan iki sayı ile dört temel matematiksel işlemi gerçekleştiren
 * bir hesap makinesi programı.
 *
 * Özellikler:
 * - Kullanıcıdan iki ondalıklı (double) sayı alır.
 * - Kullanıcının seçimine göre toplama, çıkarma, çarpma veya bölme işlemi yapar.
 * - Kullanıcı geçersiz bir seçim yaptığında program sonlandırılır.
 * - Bölme işleminde sıfıra bölme kontrolü yapılır.
 *
 * Örnek Çalışma Senaryosu:
 * Hesap Makinesi
 * 1. Toplama(+) için 1
 * 2. Çıkarma(-) için 2
 * 3. Çarpma (x) için 3
 * 4. Bölme  (/) için 4
 * 5. Çıkış için 1-2-3-4 dışındaki bir rakamı girin:
 *
 * Kullanıcı girişi: 1
 * Birinci sayıyı giriniz: 10
 * İkinci sayıyı giriniz: 5
 * Sonuç: 15.00
 */

public class _06_Calculator {

    // Tek bir Scanner nesnesi tanımlıyoruz.
    private static final Scanner giris = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            menuyuGoster();
            int secim = tamSayiAl();

            if (secim < 1 || secim > 4) {
                System.out.println("Hesap makinesi kapatılıyor...");
                break;
            }

            double birinciSayi = ondalikSayiAl("Birinci sayıyı giriniz: ");
            double ikinciSayi = ondalikSayiAl("İkinci sayıyı giriniz: ");

            double sonuc = hesaplamaYap(secim, birinciSayi, ikinciSayi);
            System.out.printf("Sonuç: %.2f%n", sonuc);
        }
    }

    // Kullanıcıya menüyü gösterir
    private static void menuyuGoster() {
        System.out.println("\nHesap Makinesi");
        System.out.println("1. Toplama (+)");
        System.out.println("2. Çıkarma (-)");
        System.out.println("3. Çarpma (x)");
        System.out.println("4. Bölme  (/)");
        System.out.println("Çıkış için 1-4 dışındaki bir rakamı girin.");
        System.out.print("Seçiminiz: ");
    }

    // Kullanıcıdan tam sayı almak için metot
    private static int tamSayiAl() {
        return giris.nextInt();
    }

    // Kullanıcıdan ondalıklı sayı almak için metot
    private static double ondalikSayiAl(String mesaj) {
        System.out.print(mesaj);
        return giris.nextDouble();
    }

    // Kullanıcının seçimine göre işlemi yapan metot
    private static double hesaplamaYap(int secim, double sayi1, double sayi2) {
        switch (secim) {
            case 1: return toplam(sayi1, sayi2);
            case 2: return cikarma(sayi1, sayi2);
            case 3: return carpma(sayi1, sayi2);
            case 4: return bolme(sayi1, sayi2);
            default: return 0;
        }
    }

    private static double toplam(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    private static double cikarma(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }

    private static double carpma(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }

    // Bölme işlemi yapan metot (sıfıra bölme kontrolü içerir)
    private static double bolme(double sayi1, double sayi2) {
        if (sayi2 == 0) {
            System.out.println("Hata: Sıfıra bölme yapılamaz. Sonuç 0 döndürüldü.");
            return 0;
        }
        return sayi1 / sayi2;
    }
}
