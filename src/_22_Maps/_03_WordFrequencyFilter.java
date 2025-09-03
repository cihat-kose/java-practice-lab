package _22_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 Görev:
 Kullanıcının girdiği kelimeleri analiz eden bir Java programı yazın.
 Program, tekrar eden kelimeleri ayıklamalı ve her kelimenin kaç kez tekrarlandığını hesaplamalıdır.
 */
public class _03_WordFrequencyFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kelime gireceksiniz: ");
        int kelimeSayisi = scanner.nextInt();
        scanner.nextLine(); // Satır sonu karakterini temizle

        // Kullanıcıdan kelimeleri al
        String[] kelimeler = kullanicidanKelimeleriAl(scanner, kelimeSayisi);

        // Kelime frekanslarını hesapla
        Map<String, Integer> kelimeFrekanslari = kelimeFrekansHesapla(kelimeler);

        // Benzersiz kelimeleri ayıkla
        Set<String> benzersizKelimeler = kelimeFrekanslari.keySet();

        // Sonuçları yazdır
        System.out.println("\nBenzersiz Kelimeler: " + benzersizKelimeler);
        System.out.println("\nKelime Tekrar Sayıları:");
        for (Map.Entry<String, Integer> entry : kelimeFrekanslari.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " kez");
        }

        scanner.close();
    }

    // Kullanıcıdan kelimeleri alıp bir dizi olarak döndüren metod
    public static String[] kullanicidanKelimeleriAl(Scanner scanner, int kelimeSayisi) {
        String[] kelimeler = new String[kelimeSayisi];
        System.out.println("Lütfen kelimeleri giriniz:");
        for (int i = 0; i < kelimeSayisi; i++) {
            System.out.print((i + 1) + ". kelime: ");
            String giris = scanner.nextLine().trim().toLowerCase();
            if (giris.isEmpty()) {
                System.out.println("Boş kelime girilemez, tekrar deneyin.");
                i--; // tekrar ettir
            } else {
                kelimeler[i] = giris;
            }
        }
        return kelimeler;
    }

    // Kelime tekrar sayılarını hesaplayan metod
    public static Map<String, Integer> kelimeFrekansHesapla(String[] kelimeler) {
        Map<String, Integer> kelimeSayaci = new HashMap<>();
        for (String kelime : kelimeler) {
            kelimeSayaci.put(kelime, kelimeSayaci.getOrDefault(kelime, 0) + 1);
        }
        return kelimeSayaci;
    }
}
