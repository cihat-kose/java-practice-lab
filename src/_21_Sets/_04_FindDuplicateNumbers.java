package _21_Sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Görev:
 * - Kullanıcıdan bir dizi uzunluğu alın.
 * - Kullanıcının girdiği sayılar ile bir dizi oluşturun.
 * - Dizinin içinde yinelenen (tekrarlayan) sayıları bulun.
 * - Yinelenen sayıları bir Set içinde saklayarak ekrana yazdırın.
 */
public class _04_FindDuplicateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dizinin boyutunu al
        System.out.print("Lütfen dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        // Kullanıcıdan gelen boyutla dizi oluştur
        int[] sayilar = new int[boyut];

        // Kullanıcıdan dizi elemanlarını al
        System.out.println("Lütfen " + boyut + " adet sayı giriniz:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            sayilar[i] = scanner.nextInt();
        }

        // Yinelenen sayıları bul
        Set<Integer> yinelenenSayilar = yinelenenleriBul(sayilar);

        // Sonucu yazdır
        if (yinelenenSayilar.isEmpty()) {
            System.out.println("Dizide yinelenen sayı yok.");
        } else {
            System.out.println("Yinelenen sayılar: " + yinelenenSayilar);
        }

        scanner.close();
    }

    // Dizide tekrar eden sayıları bulan metot
    public static Set<Integer> yinelenenleriBul(int[] dizi) {
        Set<Integer> yinelenenler = new HashSet<>();
        Set<Integer> tekilElemanlar = new HashSet<>();

        for (int sayi : dizi) {
            if (!tekilElemanlar.add(sayi)) { // eklenemiyorsa zaten vardı
                yinelenenler.add(sayi);
            }
        }
        return yinelenenler;
    }
}
