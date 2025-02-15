package _22_Maps;

import java.util.*;

/*
Görev:
Kullanıcının girdiği kelimeleri analiz eden bir Java programı yazın.
Program, tekrar eden kelimeleri ayıklamalı ve her kelimenin kaç kez tekrarlandığını hesaplamalıdır.

İçerik:
1. Kullanıcıdan kaç kelime gireceği bilgisi alınır.
2. Kullanıcıdan belirtilen sayıda kelime alınır.
3. Kelime tekrar sayıları hesaplanarak bir HashMap içinde saklanır.
4. Tekrar eden kelimeler ayıklanarak bir Set içinde saklanır.
5. Benzersiz kelimeler ve tekrar sayıları ekrana yazdırılır.
*/

public class _03_WordFrequencyFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kelime gireceksiniz: ");
        int kelimeSayisi = scanner.nextInt();
        scanner.nextLine(); // Satır sonu karakterini temizle

        // Kullanıcıdan kelimeleri al ve işle
        String[] kelimeler = kullanicidanKelimeleriAl(scanner, kelimeSayisi);

        // Kelime frekanslarını hesapla
        Map<String, Integer> kelimeFrekanslari = kelimeFrekansHesapla(kelimeler);

        // Benzersiz kelimeleri ayıkla
        Set<String> benzersizKelimeler = kelimeFrekanslari.keySet();

        // Sonuçları yazdır
        System.out.println("\nBenzersiz Kelimeler: " + benzersizKelimeler);
        System.out.println("\nKelime Tekrar Sayıları:");
        for (Map.Entry<String, Integer> entry : kelimeFrekanslari.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }

    // Kullanıcıdan kelimeleri alıp bir dizi olarak döndüren metod
    public static String[] kullanicidanKelimeleriAl(Scanner scanner, int kelimeSayisi) {
        String[] kelimeler = new String[kelimeSayisi];
        System.out.println("Lütfen kelimeleri giriniz:");
        for (int i = 0; i < kelimeSayisi; i++) {
            System.out.print((i + 1) + ". kelime: ");
            kelimeler[i] = scanner.nextLine().trim();
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
