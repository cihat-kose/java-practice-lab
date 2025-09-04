package _22_Maps;

import java.util.*;

/**
 Görev:
 Kullanıcının girdiği kelimeler arasından en uzun ve en kısa kelimeleri bulur,
 ayrıca kelimelerin tekrar sayılarını hesaplayıp yazdırır.

 Notlar (Eğitsel):
 - Sayımda tutarlılık için kelimeler küçük harfe çevrilir.
 - Boş giriş kabul edilmez; kullanıcı yeniden girmeye yönlendirilir.
 - Alfabetik yazdırma için TreeMap kullanılır (kolay ve anlaşılır).
 */
public class _04_LongestAndShortestWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Eğitim amaçlı: System.in kapatılmıyor.

        System.out.print("Kaç kelime gireceksiniz: ");
        int kelimeSayisi = readPositiveInt(scanner);

        // 1) Kelimeleri al
        String[] kelimeler = readWords(scanner, kelimeSayisi);

        // 2) Frekansları hesapla (küçük/büyük harf duyarsız)
        Map<String, Integer> kelimeFrekanslari = countFrequencies(kelimeler);

        // 3) En uzun ve en kısa kelimeleri bul
        Set<String> enUzun = new HashSet<>();
        Set<String> enKisa = new HashSet<>();
        int max = kelimeler[0].length();
        int min = kelimeler[0].length();

        for (String kelime : kelimeler) {
            int uzunluk = kelime.length();

            if (uzunluk > max) {
                max = uzunluk;
                enUzun.clear();
                enUzun.add(kelime);
            } else if (uzunluk == max) {
                enUzun.add(kelime);
            }

            if (uzunluk < min) {
                min = uzunluk;
                enKisa.clear();
                enKisa.add(kelime);
            } else if (uzunluk == min) {
                enKisa.add(kelime);
            }
        }

        // 4) Sonuçları yazdır
        System.out.println("\nEn Uzun Kelimeler (" + max + " harf): " + enUzun);
        System.out.println("En Kısa Kelimeler (" + min + " harf): " + enKisa);

        System.out.println("\nKelime Tekrar Sayıları (alfabetik):");
        // TreeMap: alfabetik sıralama için yeterli ve anlaşılır
        Map<String, Integer> sirali = new TreeMap<>(kelimeFrekanslari);
        for (Map.Entry<String, Integer> e : sirali.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    // Pozitif tam sayı okur; hatalı girişte tekrar ister
    private static int readPositiveInt(Scanner scanner) {
        while (true) {
            if (scanner.hasNextInt()) {
                int deger = scanner.nextInt();
                scanner.nextLine(); // satır sonunu temizle
                if (deger > 0) return deger;
            } else {
                scanner.nextLine(); // hatalı girişi temizle
            }
            System.out.print("Lütfen pozitif bir tam sayı girin: ");
        }
    }

    // Kullanıcıdan kelimeleri alır (boş girişe izin verilmez)
    private static String[] readWords(Scanner scanner, int adet) {
        String[] kelimeler = new String[adet];
        System.out.println("Lütfen kelimeleri giriniz:");
        for (int i = 0; i < adet; i++) {
            while (true) {
                System.out.print((i + 1) + ". kelime: ");
                String giris = scanner.nextLine().trim();
                if (!giris.isEmpty()) {
                    kelimeler[i] = giris;
                    break;
                }
                System.out.println("Boş giriş geçersizdir. Lütfen tekrar deneyin.");
            }
        }
        return kelimeler;
    }

    // Kelime tekrar sayılarını hesaplar (küçük/büyük harf duyarsız)
    private static Map<String, Integer> countFrequencies(String[] kelimeler) {
        Map<String, Integer> sayac = new HashMap<>();
        for (String kelime : kelimeler) {
            String normal = kelime.toLowerCase(Locale.ROOT);
            sayac.put(normal, sayac.getOrDefault(normal, 0) + 1);
        }
        return sayac;
    }
}
