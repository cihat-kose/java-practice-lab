package _21_Sets;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Görev:
 * - Kullanıcıdan iki farklı kelime listesi alın.
 * - Kullanıcının girdiği kelimeleri iki ayrı HashSet içinde saklayın.
 * - İki kelime listesinin kesişimini (ortak kelimeleri) bir Set kullanarak bulun.
 * - Ortak kelimeleri ekrana yazdırın.
 */
public class _05_CommonWordsFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // İlk liste
        System.out.print("İlk kelime listesinin boyutunu giriniz: ");
        int boyut1 = scanner.nextInt();
        scanner.nextLine(); // buffer temizliği

        HashSet<String> kelimeListesi1 = new HashSet<>();
        System.out.println("Lütfen ilk kelime listesindeki kelimeleri giriniz:");
        for (int i = 0; i < boyut1; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeListesi1.add(scanner.nextLine());
        }

        // İkinci liste
        System.out.print("İkinci kelime listesinin boyutunu giriniz: ");
        int boyut2 = scanner.nextInt();
        scanner.nextLine(); // buffer temizliği

        HashSet<String> kelimeListesi2 = new HashSet<>();
        System.out.println("Lütfen ikinci kelime listesindeki kelimeleri giriniz:");
        for (int i = 0; i < boyut2; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeListesi2.add(scanner.nextLine());
        }

        // Kesişim (retainAll orijinal seti değiştirir)
        HashSet<String> ortakKelimeler = new HashSet<>(kelimeListesi1);
        ortakKelimeler.retainAll(kelimeListesi2);

        // Sonuç yazdırma
        if (ortakKelimeler.isEmpty()) {
            System.out.println("Ortak kelime bulunamadı.");
        } else {
            System.out.println("Ortak Kelimeler: " + ortakKelimeler);
        }

        // scanner.close(); // İsteğe bağlı
    }
}
