package _22_Maps;

import java.util.*;

/**
Görev:
Kullanıcının girdiği kelimeler arasından en uzun ve en kısa kelimeleri bulan ve tekrar sayılarını hesaplayan bir Java programı yazın.

İçerik:
1. Kullanıcıdan kaç kelime gireceği bilgisi alınır.
2. Kullanıcıdan belirtilen sayıda kelime alınır.
3. Her kelimenin kaç kez tekrarlandığı hesaplanarak bir HashMap içinde saklanır.
4. En uzun ve en kısa kelimeler belirlenir.
5. En uzun ve en kısa kelimeler ile kelime tekrar sayıları ekrana yazdırılır.
*/

public class _04_LongestAndShortestWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kelime gireceksiniz: ");
        int kelimeSayisi = scanner.nextInt();

        // `nextInt()` metodu yalnızca sayıyı okur ve Enter tuşuna basıldığında oluşan newline karakterini (`\n`) bırakır.
        // Bu nedenle, bir sonraki `nextLine()` çağrısı boş bir değer döner.
        // Bunu önlemek için, newline karakterini okumak ve atlamak için `scanner.nextLine()` çağrısı yapılır.
        scanner.nextLine(); // Satır sonu karakterini temizleyin

        // Kullanıcıdan kelimeleri al ve işle
        String[] kelimeler = kullanicidanKelimeleriAl(scanner, kelimeSayisi);

        // Kelime frekanslarını hesapla
        Map<String, Integer> kelimeFrekanslari = kelimeFrekansHesapla(kelimeler);

        // En uzun ve en kısa kelimeleri bul
        Set<String> enUzunKelimeler = new HashSet<>();
        Set<String> enKisaKelimeler = new HashSet<>();
        int[] uzunluklar = enUzunVeEnKisaKelimeleriBul(kelimeler, enUzunKelimeler, enKisaKelimeler);

        // Sonuçları yazdır
        System.out.println("\nEn Uzun Kelimeler (" + uzunluklar[0] + " harf): " + enUzunKelimeler);
        System.out.println("En Kısa Kelimeler (" + uzunluklar[1] + " harf): " + enKisaKelimeler);

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

    // En uzun ve en kısa kelimeleri bulan metod
    public static int[] enUzunVeEnKisaKelimeleriBul(String[] kelimeler, Set<String> enUzun, Set<String> enKisa) {
        int maxUzunluk = kelimeler[0].length();
        int minUzunluk = kelimeler[0].length();

        for (String kelime : kelimeler) {
            int uzunluk = kelime.length();

            if (uzunluk > maxUzunluk) {
                maxUzunluk = uzunluk;
                enUzun.clear();
                enUzun.add(kelime);
            } else if (uzunluk == maxUzunluk) {
                enUzun.add(kelime);
            }

            if (uzunluk < minUzunluk) {
                minUzunluk = uzunluk;
                enKisa.clear();
                enKisa.add(kelime);
            } else if (uzunluk == minUzunluk) {
                enKisa.add(kelime);
            }
        }
        return new int[]{maxUzunluk, minUzunluk};
    }
}
